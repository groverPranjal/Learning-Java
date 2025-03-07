// import java.util.Scanner;
public class StringPractice {
    public static void main(String args[]){
        // char[] arr={'a','b','c','d'};
        // String str="abcd";
        // String str2=new String("xyz");

        // Scanner sc=new Scanner(System.in);
        // String name;
        StringBuilder sb=new StringBuilder(" ");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);
    //     name=sc.next();
    //     String lastName=sc.next();
    //     String FullName=name+" "+lastName;
    //     System.out.println(FullName); 
    //     System.out.println(FullName.length());
    // System.out.println(FullName.charAt(5));
    //     sc.close();
    }
}
