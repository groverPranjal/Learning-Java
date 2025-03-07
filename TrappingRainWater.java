
public class TrappingRainWater {
    public static int TrapWater(int[] arr){
        int ans=0;
        int n=arr.length;
        int[] leftbound=new int[n];
        int[] rightbound=new int[n];
        leftbound[0]=arr[0];

        for(int i=1;i<n;i++){
            leftbound[i]=Math.max(arr[i],leftbound[i-1]);
        }
        rightbound[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
         rightbound[i]=Math.max(arr[i],rightbound[i+1] );
        }
       for(int i=0;i<n;i++){
        int level=Math.min(leftbound[i],rightbound[i]);
        ans+=level-arr[i];
       }
        return ans;
    }
    public static void main(String args[]){
        int arr[]={4,2,0,6,3,2,5};
        System.out.println(TrapWater(arr));
    }
}
