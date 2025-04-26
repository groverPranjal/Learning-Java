import java.util.*;
import java.util.LinkedList;

public class NonREapeatingLetter {

    public static void print(String s){
     int freq[]=new int[26];
        Queue<Character> q= new LinkedList<>() ;
        for(int i=0;i<s.length();i++){
     char ch=s.charAt(i);
     q.add(ch);
     freq[ch-'a']++;

     while(!q.isEmpty() && freq[q.peek()-'a']>1){
        q.remove();
     }
     if(q.isEmpty()){
        System.out.println("-1");
    }
    else{
        System.err.println(q.peek());
    }
        }

        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
      print(s);
        sc.close();
    }
}
