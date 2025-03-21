import java.util.ArrayList;

public class ConatinerWithMostWaterBruteForce {
    public static int MostWater(ArrayList<Integer>  height,int n){
        int ans=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int h=Math.min(height.get(i),height.get(j));
                int w=j-i;
                int area=h*w;
                ans=Math.max(ans,area);
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        int ans=MostWater(height,height.size());
        System.out.println(ans);
    }
}
