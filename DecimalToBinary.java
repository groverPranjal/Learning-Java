import java.util.*;
public class DecimalToBinary {
    public static String Convert(int n){
        String ans="";
        while(n>0){
            int rem=n%2;
            ans=rem+ans;
            n/=2;
        }
        return ans;
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println(Convert(a));
        sc.close();

    }
}
