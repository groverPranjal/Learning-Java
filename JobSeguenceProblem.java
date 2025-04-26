import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class JobSeguenceProblem {
    public static void main(String[] args) {
        int jobs[][]={{4,20},{1,10},{1,40},{1,30}};
        int sot[][]=new int[jobs.length][3];

        for(int i=0;i<jobs.length;i++){
            sot[i][0]=i;
            sot[i][1]=jobs[i][0];
            sot[i][2]=jobs[i][1];
        }
        
        Arrays.sort(sot, new Comparator<int[]>() {
         public int compare(int[] a, int[] b) {
        return b[2] - a[2]; // compare profits
    }
});
 ArrayList<Integer> seq=new ArrayList<>();
 int time=0;
 for(int i=0;i<jobs.length;i++){
    
 }


    }
}
