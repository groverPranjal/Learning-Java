import java.util.*;
public class KeywordCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String st=sc.nextLine();
        int count=0;
        String[] s=str.split(" ");
        for(int i=0;i<s.length;i++){
           if(s[i].equals(st)){
            count++;
           }
        }
        System.out.println(count);
        sc.close();
    }
}
