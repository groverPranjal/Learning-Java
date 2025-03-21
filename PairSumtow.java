import java.util.ArrayList;
public class PairSumtow {

  public static boolean PairSum2(ArrayList<Integer> list,int target){
    int pivot=-1;
    for(int i=0;i<list.size();i++){
       if(list.get(i)>list.get(i+1)){
           pivot=i;
           break;
       }
    }
    int start=pivot+1;
    int  end=pivot; 
    while(start!=end){
      int sum=list.get(start)+list.get(end);
      if(sum==target){
        return true;
      }
      if(sum<target){
        start=(start+1)%list.size();
      }
      else{
        end=(list.size()+end-1)%list.size();
      }
    } 
    return false;
    
  }
    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
      height.add(11);
      height.add(15);
      height.add(6);
      height.add(8);
      height.add(9);
      height.add(10);
      int target=16;
      System.out.println(PairSum2(height,target));
      
  }
}

