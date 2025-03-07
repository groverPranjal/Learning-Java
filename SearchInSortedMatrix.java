// import java.util.Arrays;
//staircaseSearch
public class SearchInSortedMatrix {
    public static void Search(int[][] arr,int k){
        // int ans=-1;
        int row=0;
        int col=arr[0].length-1;
        while(row<arr.length && col>=0){
         if(arr[row][col]==k){
            System.out.println(row+" "+col);
            break;
         }
         else if(k<arr[row][col]){
            col--;
         }
         else{
            row++;
         }
        }
        System.out.println("Not found");
    }
public static void main(String args[]){
    int[][] arr={{10,20,30,40},{15,25,35,45},{27,29,39,48},{32,33,39,50}};
    int key=33;
    Search(arr,key);
    }
}
