 class ArraySortedOrNotUsingRecursion {
    public static void main(String[] args) {
        int[] arr={1,2,7,4,5};
        System.out.println(Sort(arr,0));
    }
    public static boolean Sort(int[] arr,int i){
        if(arr.length-1==i){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return  Sort(arr,i+1);
      
    }
}
