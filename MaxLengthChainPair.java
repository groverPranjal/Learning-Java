import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainPair {
    public static void main(String[] args) {
    int pair[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};

    Arrays.sort(pair,Comparator.comparingDouble(o->o[1]));
 int chain=1;
 int lastend=pair[0][1];//chain end

 for(int i=1;i<pair.length;i++){
   if(pair[i][0]>lastend){
    chain++;
    lastend=pair[i][1];

   }
 }
 System.err.println(chain);



     

    }
}
