public class SodokuSolver {
    public static boolean SudokuSolve(int[][] Sudoku,int row,int col){
        //base case
        if(row==9 && col==0){
            return true;
        }

        //recusion  
        int nextRow=row;
        int NextCol=col+1;
        if(NextCol+1==9){
            NextCol=0;
            nextRow=row+1;
        }

        if(Sudoku[row][col]!=0){
            return SudokuSolve(Sudoku, nextRow, NextCol);
        }
        for(int i=1;i<=9;i++){
            if( isSafe(Sudoku,row,col,i)){
                Sudoku[row][col]=i;
                if(SudokuSolve(Sudoku, nextRow, NextCol)){
                    return true;
                }
                Sudoku[row][col]=0;
            }
        }

        return false;
    }

    public static boolean isSafe(int[][] Sudoku,int row,int col,int digit){
        //check entire row
        for(int i=0;i<Sudoku[0].length;i++){
            if(Sudoku[i][col]==digit){
                return false;
            }
        }
        //check column
        for(int j=0;j<9;j++){
            if(Sudoku[row][j]==digit){
                return false;
            }
        }
        //for grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(Sudoku[i][j]==digit){
                    return false;
                }
            }
        }

        return true;
    }
    public static void printSudoku(int [][] matrix){
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix[1].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int Sudoku[][] = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        if(SudokuSolve(Sudoku,0,0)){
            printSudoku(Sudoku);
        };
    }
}
