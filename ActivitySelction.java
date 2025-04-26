import java.util.*;
import java.util.Comparator;

public class ActivitySelction {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        // if end time was not sorted
        int act[][]= new int[start.length][3];
        for(int i=0;i<start.length;i++){
            act[i][0]=i;
            act[i][1]=start[i];
            act[i][2]=end[i];
        }

        Arrays.sort(act, Comparator.comparingDouble(o -> o[2]));
        int count=0;
        ArrayList <Integer> ans=new ArrayList<>();

        //1st activity
        count=1;
        ans.add(act[0][0]);
        int lastend=act[0][2];
        for(int i=1;i<end.length;i++){
          if(act[i][1]>=lastend){
        ans.add(act[i][0]);
        count++;
        lastend=act[i][2];
          }
        }

        System.out.println(count);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
