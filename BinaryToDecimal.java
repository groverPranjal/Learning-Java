import java.util.*;
public class BinaryToDecimal {
    public static int conver(int n){
        int ans=0;
        int index=0;
       while(n>0){
        int rem=n%10;
        if(rem==1){
            ans+=Math.pow(2,index);
        }
        index++;
        n/=10; 
       }
       return ans;
    }
    public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
      int a=sc.nextInt();
      System.out.println(conver(a));
      sc.close(); 
    }
}
