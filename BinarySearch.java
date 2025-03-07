public class BinarySearch {
    public static int bs(int[] arr,int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]>key){
                end=mid-1;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else if(arr[mid]==key){
                 return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10,12,14,16}; 
        int key=25;
        System.out.println(bs(num,key));
   }
}
