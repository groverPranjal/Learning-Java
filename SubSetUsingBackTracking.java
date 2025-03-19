public class SubSetUsingBackTracking {
    public static void main(String[] args) {
      String str="abc" ;
      findSubset(str, " ", 0);
    }
    public static void findSubset(String str,String ans,int i){

        if(i==str.length()){
            System.err.println(ans);
            return;
        }
     //YesChoice
       findSubset(str, ans+str.charAt(i), i+1);
    //No choice
      findSubset(str, ans, i+1);
    }
}
