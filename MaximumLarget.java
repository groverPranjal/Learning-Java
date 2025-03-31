import java.util.*;
public class MaximumLarget {
    public static void main(String[] args) {
        String[] s={"3","30","34","5","9"};
        Arrays.sort(s,(a,b)->(b+a).compareTo(a+b));
        String st=String.join("",s);
        System.out.println(st);
      
    }
}
