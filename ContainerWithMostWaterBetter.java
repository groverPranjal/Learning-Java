import java.util.ArrayList;

public class ContainerWithMostWaterBetter {
    public static int MostWaterrr(ArrayList<Integer>  height,int n){
        int ans=Integer.MIN_VALUE;

        int start=0;
        int end=n-1;
        while(start<end){
            int h=Math.min(height.get(start),height.get(end));
            int w=end-start;
            int area=h*w;
            ans=Math.max(ans, area);
           if(height.get(start)>height.get(end)){
            end--;
           }
           else{
            start++;
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

        int ans=MostWaterrr(height,height.size());
        System.out.println(ans);
    }
}
