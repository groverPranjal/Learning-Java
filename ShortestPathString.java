import java.util.Scanner;

public class ShortestPathString {
    public static float Short(String str){
      
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='N'){
                y++;
            }
            else if(str.charAt(i)=='S'){
                y--;
            }
            else if(str.charAt(i)=='E'){
                x++;
            }
            else if(str.charAt(i)=='W'){
                x--;
            }
        }
       int X2=x*x;
       int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String args[]){
     
        Scanner sc=new Scanner(System.in);
        String name;
        name=sc.next();
        System.out.println(Short(name));
        sc.close();
    }
}
