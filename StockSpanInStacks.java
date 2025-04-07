import java.util.Arrays;
import java.util.Stack;

public class StockSpanInStacks {

    public static void stocksSpan(int[] stocks,int[] span){
      Stack <Integer>  s=new Stack<>();
      span[0]=1;
      s.push(0);

      for(int i=1;i<stocks.length;i++){
        int curprice=stocks[i];
        while(!s.isEmpty() && curprice>stocks[s.peek()]){
          s.pop();
        }
        if(s.isEmpty()){
            span[i]=i+1;
        }
        else{
            int prev=s.peek();
            span[i]=i-prev;
        }
        s.push(i);
      }
    }
    public static void main(String[] args) {
       int stocks[]={100,80,60,70,60,85,100}; 
       int span[]= new int[stocks.length];
       stocksSpan(stocks,span);

      System.out.println(Arrays.toString(span));
    }
}
