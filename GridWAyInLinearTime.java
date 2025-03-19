public class GridWAyInLinearTime {
    public static int fact(int n){
        if(n==0){
          return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int n=3;
        int m=3;
        //solving (n-1+m-1)! */
        int factnm=fact((n-1)+(m-1));
        //solving (n-1)! and (m-1)!
        int factn=fact(n-1);
        int factm=fact(m-1);
        //finale answer
        int ans=factnm/(factn*factm);
        System.out.println(ans);

    }
}
