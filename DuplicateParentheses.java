import java.util.Stack;

public class DuplicateParentheses {
   
    public
     static boolean isDuplicate(String str){
        Stack <Character>s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            //opening operator opernds
             if(ch==')'){
                int count=0;
                while( s.peek()!='('){
                   s.pop();
                   count++; 
                }
            if(count<1){
                return true;
            }
            else{
                s.pop();
            }
             }
            else{
                //opening
                s.push(ch);
            }
        }
        return false;
     }
    public static void main(String[] args) {
        String str="((a+b))";//true;
        String str2="(a-b)";//false
        System.err.println(isDuplicate(str));
        System.err.println(isDuplicate(str2));
         
    }
}
