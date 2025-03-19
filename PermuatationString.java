public class PermuatationString {
    public static void main(String[] args) {
        String str="abc";
        findPrum(str, "");
    }

    public static void findPrum(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String Newstr=str.substring(0, i)+str.substring(i+1);
           findPrum(Newstr, ans+curr);
        }
    }
}