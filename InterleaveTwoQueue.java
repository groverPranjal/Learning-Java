import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class InterleaveTwoQueue {
    public static void Inter(Queue<Integer> q){
        Queue<Integer> qhalf=new LinkedList<>(); 
       
        int n=q.size();
        for(int i=0;i<n/2;i++){
            qhalf.add(q.remove());
        }
        while(!qhalf.isEmpty()){
            q.add(qhalf.remove());
            q.add(q.remove());
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
        
        Inter(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
        sc.close();
    }
    
}
