public class LargestinArray {
    public static int largest(int[] arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
    int[] nums={1,2,6,3,5};
    System.out.println(largest(nums));
    }
}
