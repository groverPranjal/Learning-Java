import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String st="pranjal";
        Stack<Character> s=new Stack();

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<st.length();i++){
            s.push(st.charAt(i));
        }
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        System.out.println(sb);
    }
}
