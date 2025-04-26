import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {
  static class StackD{
    Deque<Integer> de=new LinkedList<>();
    public void push(int data){
        de.addLast(data);
    }
    public int pop(){
        return de.removeLast();
    }
    public int peek(){
        return de.getLast();
    }
  }  
  public static void main(String[] args) {
    StackD s=new StackD();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    System.out.println(s.peek());
    System.out.println(s.pop());
    System.out.println(s.pop());
    System.out.println(s.pop());
    System.out.println(s.pop());
  }
}
