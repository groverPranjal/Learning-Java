import java.util.Arrays;
import java.util.Scanner;
public class TwoDArray {

    public static int[] search(int[][] arr,int k){
      int[] ans=new int[2];
      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            if(arr[i][j]==k){
                ans[0]=i;
                ans[1]=j;
                break;
            }
        }
      }
      return ans;
    }
    public static void main(String args[]){
      int[][] matrix=new int[3][3];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<3;i++){// rows n
        for(int j=0;j<3;j++){//colums m
            matrix[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<3;i++){// rows n
        for(int j=0;j<3;j++){//colums m
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
    int k=sc.nextInt();
    // search(matrix,k);
     System.out.println(Arrays.toString(search(matrix,k)));
    sc.close();
    }
}
