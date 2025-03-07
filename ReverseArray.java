public class ReverseArray {
    public static void Revarr(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
      
    
    public static void main(String[] args) {
        int num[]={2,4,6,8,10,12,14,16}; 
        Revarr(num);
        int n=num.length;
        for(int i=0;i<n;i++){
            System.out.print(num[i]+" ");
        }
   }
}
