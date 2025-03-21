import java.util.ArrayList;

public class TwoDArrayList {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer> >list=new ArrayList<>();

        ArrayList<Integer> curlist=new ArrayList<>();
        curlist.add(1);
        curlist.add(2);
        curlist.add(3);
        curlist.add(14);

        list.add(curlist);

        ArrayList<Integer> clist=new ArrayList<>();
        clist.add(5);
        clist.add(6);
        clist.add(9);
        clist.add(10);

        list.add(clist);

        for(int i=0;i<list.size();i++){
           ArrayList<Integer> ll=list.get(i);
            for(int j=0;j<ll.size();j++){
                System.out.print(ll.get(j)+" ");
            }
            System.out.println();

        }

        System.out.println(list);

    }
}
