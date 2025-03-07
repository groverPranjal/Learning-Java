import java.util.*;
public class hii{
    public static void main(String args[]){
       Scanner sc =new Scanner(System.in);
       int n=sc.nextInt();
       for(char i=1;i<=n;i++){
        for(char j='A';j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
       }
       System.out.println(5 & 6);
       System.out.println(5 | 6);
       System.out.println(5 ^ 6);
       System.out.println(5<<2) ;
       System.out.println(6>>1);
       sc.close();
    }
}