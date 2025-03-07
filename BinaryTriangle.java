import java.util.*;
public class BinaryTriangle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num);
                if(num==1){
                    num=0;
                }
                else{
                    num=1;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
