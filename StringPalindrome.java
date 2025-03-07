import java.util.Scanner;

public class StringPalindrome {
    public static boolean Palindrome(String str){
        int start=0;
        int end=str.length()-1;
        while(start<=end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String args[]){
     
        Scanner sc=new Scanner(System.in);
        String name;
        name=sc.next();
        System.out.println(Palindrome(name));
        sc.close();
    }
}
