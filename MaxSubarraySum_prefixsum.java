public class MaxSubarraySum_prefixsum {
    public static int MSubSum(int[] arr){
       
        int n=arr.length;
        int[] prefix=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        int maxSum=Integer.MIN_VALUE;
        int  sum=0;
        for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            sum=i==0? prefix[j]:prefix[j]-prefix[i-1];
            // System.out.println(sum);
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
