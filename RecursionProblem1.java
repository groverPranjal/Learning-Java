import java.util.Scanner;

public class RecursionProblem1 {
 //decresing number;
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 Dec(n);
 System.out.println( );

 sc.close();
 }
 

 public static void Dec(int n){
    if(n==0){
        return ;
    }
    // int k=Dec(n-1);
    System.out.print(n+" ");
    Dec(n-1);
}
public static void Inc(int n){
    // int i=1;
    if(n==0){
        return;
    }
   
    Inc(n-1);
    System.out.print(n+" ");
}
 static int i=1;

}
