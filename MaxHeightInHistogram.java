import java.util.*;
public class MaxHeightInHistogram {
    public static void maxArea(int arr[]){
       
        int nsr[]=new int[arr.length];
        int nsl[]=new int[arr.length];
        Stack<Integer> s=new Stack<>();

        //next smaller right
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
               nsr[i]=arr.length;  //-1
            }
            else{
                nsr[i]=s.peek();//top
            }
            s.push(i);
        }
        // next smaller left
        s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
               nsl[i]= -1;  //-1
            }
            else{
                nsl[i]=s.peek();//top
            }
            s.push(i);
        }
        // current area w=j-i-1
        int maxarea=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int h=arr[i];
            int w=nsr[i]-nsl[i]-1;
            maxarea=Math.max(h*w,maxarea);
        }
         System.out.println("Max area is "+maxarea);
 
    }
    
    
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        maxArea(arr);
         
    }
}
