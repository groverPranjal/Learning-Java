import java.util.Arrays;

public class QuickSort {
    public static void main(String args[]){
    int[] arr={6,3,9,8,2,5};
    quick(arr, 0, arr.length-1);
    System.out.println(Arrays.toString(arr));
    }
    public static void quick(int arr[],int start,int end){
     if(start>=end){
        return;
     }
        int pindex=partition(arr,start,end);
     quick(arr, start, pindex-1);
     quick(arr, pindex+1, end);
    }
    public static int partition(int[] arr,int start,int end){
      int pivot=arr[end];
      int i=start-1;// to make place for elements smaller than pivot

      for(int j=start;j<end;j++){
        if(arr[j]<=pivot){
            i++;
            //swap
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
      }
      i++;
      //swap
      int temp=pivot;
      arr[end]=arr[i];
      arr[i]=temp;
      return i;
    }
}
