
///////nonsense code
/// 
public class SubStringOrNot{

    public static void main(String[] args) {
        String str1="CodeQuotient";
        String str2="QC";
        int match=0;
        for(int i=0;i<str2.length();i++){
            String cur=String.valueOf(str2.charAt(i));
            if(str1.contains(cur)){
                 match++;
            }
        }
        if(match==str2.length()){
            System.out.println("yes");
        }
    }
}