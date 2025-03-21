import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class IntroToArrayList {
    public static void main(String[] args) {
        //java collection framework
        ArrayList<Integer> list= new ArrayList<>();
        //add elemnet time complexity 0(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //add at specific index
        list.add(3,9);//o(n)
        System.out.println(list);

        //get element TC=0(1)
        int e=list.get(2);
        System.out.println(e);

        //remove element TC=o(n) linear time
        list.remove(2);
        System.out.println(list);

        //set element at index TC=o(n) linear time
        list.set(2,100);
        System.out.println(list);

        //contain element
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        //we dont use arr[i] in list 
        //we use:
       System.out.println( list.get(3));

       //size of arraylist
       System.out.println(list.size());

       //iteration on arraylist print arraylist
       for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" ");
       }
       System.out.println();
       //sorting of arraylist
       Collections.sort(list);
       System.out.println(list);

       //decending order
       Collections.sort(list,Collections.reverseOrder());
       System.out.println(list);




    }
}
