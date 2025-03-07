import java.util.Scanner;

public class FibonacciRecusion {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Fib(n));
        sc.close();
    }
    public static int Fib(int n){
        // if(n==0){
        //     return 0;
        // }
        if(n==1 || n==0){
            return n;
        }
        return Fib(n-1)+Fib(n-2);

    }
}
