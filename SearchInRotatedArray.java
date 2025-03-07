public class SearchInRotatedArray {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2,3};
        int target=0;
        int ans=search(arr, target, 0, arr.length-1);
        System.out.println(ans);
    }
    public static int search(int[] arr,int target,int start,int end){
    if(start>end){
        return -1;
    }
        int mid=start+(end-start)/2;
    if(arr[mid]==target){
        return mid;
    }
    //mid on L1
    if(arr[start]<=arr[mid]){
     // case a: left
     if(arr[start]<=target && target<=arr[mid]){
       return search(arr, target, start, mid);
     }
     else{
        //case b
        return search(arr, target, mid+1,end);
        }
    }
    
    //mid on l2
    else{
       if(arr[mid]<=target && target <=arr[end]){
        return search(arr, target, mid+1, end);
       } 
       else{
        return search(arr, target, start, mid-1);
       }
    }
    }
}
