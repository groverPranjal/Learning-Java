import java.util.Scanner;

public class SumofNnumberRecursion {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Sum(n));
        sc.close();
    }
    public static int Sum(int n){
        if(n==0){
            return 0;
        }
        return n+Sum(n-1);
    }
}
