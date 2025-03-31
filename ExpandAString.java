import java.util.Scanner;

public class ExpandAString {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char cur=str.charAt(i);

            if(i+1<str.length() && Character.isDigit(str.charAt(i+1))){
                int count=str.charAt(i+1)-'0';
                for(int j=0;j<count;j++){
                    sb.append(cur);
                }
                i++;
            }
            else{
                sb.append(cur);
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
