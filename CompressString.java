public class CompressString {
    public static void main(String[] args) {
       
            String s="aaaabbbekk";
            char[] st=s.toCharArray();
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<st.length;i++){
                char cur=st[i];
                int count=1;
                while(i+1<st.length && cur==st[i+1]){
                     count++;
                     i++;
                }
                sb.append(cur);
                if(count>1){
                    sb.append(count);
    
                }
            }
            System.out.println(sb);
    
    }
}
