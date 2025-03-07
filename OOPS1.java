public class OOPS1 {
     public static void main(String[] args) {
        Pen p1=new Pen(); //created pen object call p1
        p1.setColor("Blue") ;
        p1.setTip(5);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
        Student s1=new Student();
        s1.name="Pranjal";
        s1.age=18;
        Student s2= new Student (s1);
        System.out.println(s2.name);
        System.out.println(s2.age);
     }
}

class Pen {
 private String color;
 private int tip;
 String getColor(){
    return this.color;
 }
 int getTip(){
    return this.tip;
 }
 void setColor(String newColor){
    color=newColor;
 }
    void setTip(int newTip){
        tip=newTip;
    }
}
class Student{
    String name;
    int age;
    float percentage;
    //shallow copy
    Student(Student s1 ){
        this.name=s1.name;
        this.age=s1.age;
    }
    //deep copy

     Student(){
        System.out.println("Hii People");
     }
     Student(String name){
        this.name=name;
     }
     Student(int age){
        this.age=age;
     }
    void calcPercentage(int phy,int chem,int math){
        percentage=(phy+chem+math)/3; 
    }

}
