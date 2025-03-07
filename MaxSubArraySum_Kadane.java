public class MaxSubArraySum_Kadane {
    public static int MaxSubarraySum(int[] arr){
        int n=arr.length;
        int MAxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
          sum+=arr[i];
          if(sum<0){
            sum=0;
          }
          MAxSum=Math.max(sum,MAxSum);
        }
        return MAxSum;
    
    }
    public static void main(String arg[]){
        int[] arr={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(MaxSubarraySum(arr));
    }
}
