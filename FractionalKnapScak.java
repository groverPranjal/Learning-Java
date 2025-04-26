// import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapScak {
   public static void main(String[] args) {
    int val[]={60,100,120};
    int weight[]={10,20,30};
    int w=50;

    double ratio[][]=new double[val.length][2];
     // 0th indx
     //1st col=ratio

     for(int i=0;i<val.length;i++){
        ratio[i][0]=i;
        ratio[i][1]=val[i]/(double)weight[i];
     }
// accending sort
     Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));

     int cap=w;
     int ans=0;
for(int i=ratio.length-1;i>=0;i--){
    int idx=(int)ratio[i][0];
    if(cap>=weight[idx]){
       ans+=val[idx];
       cap-=weight[idx];
    }
    else{
        //include fractional
        ans+=(ratio[i][1]*cap);
        cap=0;
        break;
    }
}
System.out.println(ans);

   } 
}
