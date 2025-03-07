import java.util.*;
public  class Function {
    public static int avg(int a,int b,int c){
        return (a+b+c)/3;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static long fact(long a){
        long fct=1;
         for(long i=1;i<=a;i++){
            fct=fct*i;
         }
         return fct;
    }
    public static long binomial(long n,long r){
        long fa=fact(n);
        long fb=fact(r);
        long fc=fact(n-r);
        long  ans=fa/(fb*fc); 
        return ans;

    }
     public static boolean isPrime(long    a){
        if(a<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(a);i++){
          if(a%i==0){
            return false;
          }
        }
        return true;
    }

    public static  void primerange(long a){
        for(long i=0;i<=a;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    long a=sc.nextLong();
    primerange(a);
    // long b=sc.nextLong();  
    // int b=sc.nextInt();
    // int c=sc.nextInt();
    // System.out.println(mul(5,40));
    // System.out.println(avg(a,b,c));
     
    // if(isPrime(a)){
    //     System.out.println("Yes");
    // }
    // else{
    //     System.out.println("No");
    // }
   
    // System.out.println(binomial(a,b));
    sc.close();
}
}
