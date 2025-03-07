public class RemoveduplicatesRecursion {
    public static void main(String args[]){
    String str="appnacollage";
    remove(str, 0, new StringBuilder(""), new boolean[26]);
    }
    public static void remove(String str,int idx,StringBuilder newstr,boolean[] map){
        if(idx==str.length()){
            System.out.println(newstr);
         return ;
        }
        char curchar=str.charAt(idx);
        if(map[curchar-'a']==true){
            //duplicate;
            remove(str,idx+1,newstr,map);
        }
        else{
            map[curchar-'a']=true;
            remove(str, idx+1, newstr.append(curchar), map);
        }
    }
}
