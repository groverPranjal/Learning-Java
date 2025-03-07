public class Buy_SellStocks {
    public static int B_And_SStocks(int[] arr){
   int Maxprofit=0;
   int buyprice=Integer.MAX_VALUE;
   int n=arr.length;
   for(int i=0;i<n;i++){
    if(buyprice<arr[i]){
        int profit=arr[i]-buyprice;
        Maxprofit=Math.max(profit,Maxprofit);
    }
    else{
        buyprice= arr[i];
    }
   }

   return Maxprofit;
    }
    public static void main(String args[]){
        int[] arr={7,1,5,3,6,4};
       System.out.println( B_And_SStocks(arr));
    }
}
