import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDequeue {
    static class QueueD{
        Deque<Integer> de=new LinkedList<>();
        public void add(int data){
            de.addLast(data);
        }
        public int remove(){
            return de.removeFirst();
        }
        public int peek(){
            return de.getFirst();
        }
    }
    public static void main(String[] args) {
        QueueD q=new QueueD();
        q.add(1);
        q.add(2);
        q.add(13);
        q.add(14);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

    }
}
