import java.util.ArrayList;

public class PaiSumTwoPointer {
    public static boolean PairSum1(ArrayList<Integer> arr,int target){

        int start=0;
        int end=arr.size()-1;
        while(start<end){
            int sum=arr.get(start)+arr.get(end);
            if(sum==target){
                return true;
            }
            if(sum>target){
                end--;
            }
            if(sum<target){
                start++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
          ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(2);
        height.add(3);
        height.add(4);
        height.add(5);
        height.add(6);
        int target=5;
        System.out.println(PairSum1(height,target));
        
    }
}
