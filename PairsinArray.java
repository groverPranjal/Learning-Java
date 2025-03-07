public class PairsinArray {
    public static int Pair(int[] arr){
        
        int n=arr.length;
        int np=n*(n-1)/2;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.print("("+arr[i]+","+arr[j]+")"+" ");
            }
            System.out.println();
        }
        return np;
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10 }; 
        System.out.println(Pair(num));
   }
}
