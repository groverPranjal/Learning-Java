import java.util.Scanner;
public class ReachSingleDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int step=0;
        
        while(num>10){
            int sum=0;
            while(num>0){
                int rem=num%10;
                sum+=rem;
                num/=10;
            }
            num=sum;
            step++;
        }
        System.out.println(step);
        sc.close();
    }
    
}
