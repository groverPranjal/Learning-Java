public class FirstOccurenceRecursion {
    public static void main(String[] args) {
        int[] arr={8,3,6,9,5,10,2,5,3};
        System.out.println(FindFir(arr,0,5));
        System.out.println(FindLast(arr,arr.length-1,5));
    }
    public static int FindFir(int[] arr,int i,int key){
       if(i==arr.length){
        return -1;
       }
        if(arr[i]==key){ 
            return i;
        }
        return FindFir(arr,i+1,key);
    }
    public static int FindLast(int[] arr,int n,int key){
        if(n==0){
            return -1;
        }
        if(arr[n]==key){
            return n;
        }
        return FindLast(arr, n-1, key);

    }
}
