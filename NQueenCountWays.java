public class NQueenCountWays {
    public static boolean isSafe(char board[][],int row,int col){
     //vertically up
     for(int i=row;i>=0;i--){
         if(board[i][col]=='Q'){
             return false;
         }
     }
     //diagonal left
     int j=col;
     for(int i=row;i>=0 && j>=0;i--,j--){
         if(board[i][j]=='Q'){
             return false;
         }
     }
     //digonal right
     int k=col;
     for(int i=row;i>=0 && k<board.length;i--,k++){
         if(board[i][k]=='Q'){
             return false;
         }
     }
        return true;
    }
     public static void nQueen(char board[][],int row){
 
         if(row==board.length){
            count++;
             return ;
             
             
         }
         for(int j=0;j<board.length;j++){
             if(isSafe(board,row,j)){
                 board[row][j]='Q';
                 nQueen(board, row+1);//function call
                 board[row][j]='.';//backtracking
             }
             
         }
        
     }
   
     static int count=0;
     public static void main(String[] args) {
         int n=5;
         char chess[][]=new char[n][n];
 
         for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                 chess[i][j]='.';
             }
         }
 
         nQueen(chess,0);
         System.out.println(count);
 
     }
 }
 