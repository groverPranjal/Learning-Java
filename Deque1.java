import java.util.*;
public class Deque1 {
   public static void main(String[] args) {
    Deque<Integer> de=new LinkedList<>();
      de.addFirst(1);
      de.addFirst(2);
      de.addLast(3);
      de.addLast(4);
      System.out.println(de);
      de.removeLast();
      System.out.println(de);

   } 
}
