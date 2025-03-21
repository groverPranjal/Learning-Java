import java.util.ArrayList;

public class SwapTwoInArrayList {
    public static void main(String[] args) {
         ArrayList<Integer> List=new ArrayList<>();
        List.add(2);
        List.add(5);
        List.add(9);
        List.add(3);
        List.add(6);
        System.out.println(List);

        int temp=List.get(1);
        List.set(1,List.get(3));
        List.set(3,temp);
        System.out.println(List);
    }
}
