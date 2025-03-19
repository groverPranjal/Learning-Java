public class Gridways {
    public static int Gridway(int row,int col,int n,int m){
        if(row==n-1 && col==m-1 ){
            return 1;
        }
        if(row>n || col>m){
            return 0;
        }
       return Gridway(row+1,col,n,m)+Gridway(row, col+1, n, m);
    }
    public static void main(String[] args) {
        int n=3;
        int m=3;
        System.out.println(Gridway(0,0,n,m));
    }
}
