import java.util.Arrays;

public class CountingSort {
    public static void CS(int arr[]){
        int n=arr.length;
        int mx=Integer.MIN_VALUE;
        // int[] freq=new int[n];
        for(int i=0;i<n;i++){
            mx=Math.max(mx,arr[i]);
        }
        int[] freq= new int[mx+1];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        System.out.println(Arrays.toString(freq));
        int j=0;
        for(int i=0;i<freq.length;i++){
           
            while(freq[i]>0){
            arr[j]=i;
            j++;
            freq[i]--;
            }
        }
    }
     public static void main(String args[]){
        int arr[]={1,4,1,3,2,4,3,7};
        CS(arr);
        System.out.println(Arrays.toString(arr));
    }
}
