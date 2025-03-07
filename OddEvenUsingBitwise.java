// package Bit Manipulation;
import java.util.*;

public class OddEvenUsingBitwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // if((n&1) == 0){
        //    System.out.println("Even");
        // }
        // else{
        //     System.out.println("Odd");
        // }
        int i=sc.nextInt();
        int bitMask=1<<i;
        if((n & bitMask)==0){
        System.out.println(0);
        }
        else{
            System.out.println(1);
        }

        sc.close();
    }  
}
