public class MaxSubarraySum {
    public static int MSubSum(int[] arr){
        int n=arr.length;
        int maxSum=Integer.MIN_VALUE;
        int  sum=0;
        for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            sum=0;
            for(int k=i;k<=j;k++){
                sum+=arr[k];
            }
            System.out.println(sum);
            maxSum=Math.max(sum,maxSum);
        }
        }
        return maxSum;
    }
    public static void main(String args[]){
        int[] arr={1,-2,6,-1,3};
        System.out.println(MSubSum(arr));
    }
}
