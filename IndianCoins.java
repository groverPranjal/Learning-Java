import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    public static void main(String[] args) {
        int n=590;
        int num=0;
        Integer coins[]={1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<coins.length;i++){
            if(coins[i]<=n){
                while(coins[i]<=n){
                    num++;
                    ans.add(coins[i]);
                    n-=coins[i];
                }
            }
        }
        System.err.println(num);
        System.out.println(ans);

    }
}
