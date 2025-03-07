import java.util.Arrays;

public class InserationSort {
    public static void IS(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
        int cur=arr[i];
        int prev=i-1;
        while(prev>=0 && arr[prev]>cur){
         arr[prev+1]=arr[prev];
         prev--;
        }
        arr[prev+1]=cur;
        }
    }
        public static void main(String args[]){
        int arr[]={5,4,1,3,2} ;
        Arrays.sort(arr,0,4);
        System.out.println(Arrays.toString(arr));
    }
}
