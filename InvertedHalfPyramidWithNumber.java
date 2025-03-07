import java.util.*;
public class InvertedHalfPyramidWithNumber {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        // int num=1;
        for(int j=1;j<= n-i+1;j++){
            System.out.print(j);
            // num++;
        }
        System.out.println();
    }
    sc.close();
    }
} 
