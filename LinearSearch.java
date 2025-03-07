public class LinearSearch {
    public static int ls(int arr[],int a){
         int n=arr.length;
         
         for(int i=0;i<n;i++){
            if(arr[i]==a){
                return i;
            }
         }
         return -1; 
    }
    public static void main(String[] args) {
         int num[]={2,4,6,8,10,12,14,16}; 
         int key=10;
         System.out.println(ls(num,key));
    }
}
