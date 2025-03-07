import java.util.Scanner;
public class PowerFunUsingRec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(OptiPow(x,n));
        sc.close();
    }
    public static int Pow(int x,int n){
        if(n==1){
            return x;
        }
        return x*Pow(x,n-1);
    }
    public static int OptiPow(int x,int n){
        if(n==0){
            return 1;
        }
        int a=OptiPow(x, n/2);
        int Half=a*a;
        if(n%2!=0){
            Half=x*Half;
        }
        return Half;
    }
}
