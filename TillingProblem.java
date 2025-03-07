public class TillingProblem {
    public static void main(String[] args) {
        System.out.println(TP(4));
    }
    public static int TP(int n){

        //Base case
        if(n<=1){
            return 1;
        }
        //kaam
        //verticalChoice 
        int Vert=TP(n-1);

        //Horzontal choice
        int Horz=TP(n-2);
        return Vert+Horz;
    }
}
