import java.util.*;
public class Pattern1 {
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        char var='A';
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
              System.out.print(var);
              var++;
            }
            System.out.println();
        }
        sc.close();
    }
}
