import java.util.Arrays;
public class BubbleSort {
    public static void BS(int[] arr){
    int n=arr.length;
    int turns=0;
    boolean swap;
    for(int i=0;i<n-1;i++){
        turns++;
         swap=false;
        for(int j=0;j<n-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
                swap=true;
            }
        }
        if(!swap){
            System.out.println("The array is sorted in "+"  turns: "+turns);
            return ;
        }
        
    }
    System.out.println("Sorted in" +turns+" turns.");
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        BS(arr);
        System.out.println(Arrays.toString(arr));
    }
}
