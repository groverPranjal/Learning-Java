import java.util.ArrayList;

public class MaxInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> List=new ArrayList<>();
        List.add(2);
        List.add(5);
        List.add(9);
        List.add(3);
        List.add(6);
        int mx=Integer.MIN_VALUE;

        for(int i=0;i<List.size();i++){
            if(List.get(i)>mx){
                mx=List.get(i);
            }

        }
        System.out.println(mx);
        


    }
}
