import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] ={6,8,0,1,3};
        Stack <Integer> s=new Stack<>();
        int[] ans=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            //1 while loop 
           while(!s.isEmpty() && arr[i]>=arr[s.peek()]){
            s.pop();
           } 
           //2 if else
           if(s.isEmpty()){
            ans[i]=-1;
           }
           else{
            ans[i]=arr[s.peek()];
           }
           //3 push in stack
           s.push(i);
        }
        System.out.println(Arrays.toString(ans));
        
    }

}
