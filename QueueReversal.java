import java.util.*;
// import java.util.Scanner;

public class QueueReversal {
    public static void rev(Queue<Integer> q){
        Stack<Integer> s=new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }

    }
    public static void main(String[] args) {
           Queue<Integer> q=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            q.add(a);
        }
        rev(q);
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
