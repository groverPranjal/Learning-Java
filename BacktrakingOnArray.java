import java.util.Arrays;

public class BacktrakingOnArray {
    public static void main(String[] args) {
        int arr[] =new int[5];
        ChangeArr(arr,0,1);
        System.out.println(Arrays.toString(arr));
    }
    public static void ChangeArr(int arr[],int i,int val){
        //base case
        if(i==arr.length){
            System.out.println(Arrays.toString(arr));
            return ;
        }

        //kam
        arr[i]=val;
        ChangeArr(arr, i+1, val+1);
        arr[i]=arr[i]-2;//backtracking step
       // this step will take place ater recusion hit base case and will be returning from base case call stack to main function for output
    }
}
