public class PrintSubarray {
    public static void PSub(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int start=i;
            
            for(int j=i;j<n;j++){
                int end=j;
                // System.out.print(arr[i]+" ");
                for(int k=start;k<=end;k++){
                 System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            // System.out.println();
        }
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10}; 
       PSub(num);
        
   }
}
