import java.util.Arrays;
public class SelectionSort {
public static int min(int arr[],int start,int end){
    int minIdx=start;
    // int n=arr.length;
    for(int i=start+1;i<=end;i++){
    if(arr[i]<arr[minIdx]){
        minIdx=i;
       }

    }
    return minIdx;
}
 public static void SS(int arr[]){
    int n=arr.length;
    for(int i=0;i<n-1;i++){
       int minpos= min(arr,i,n-1);
    int temp=arr[minpos];
    arr[minpos]=arr[i];
    arr[i]=temp;
       
    }
 }
     public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        SS(arr);
        System.out.println(Arrays.toString(arr));
    }
}
