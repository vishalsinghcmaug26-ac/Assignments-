package Inheritance;

class Shape{
    public void showShape(){
        System.out.println("This is shape");
    }
}
class MyRectangle extends Shape{
    public void Rec(){
        System.out.println("This is rectangular shape");
    }
}
class Circle extends Shape{
    public void cir(){
        System.out.println("This is circular shape");
    }
}
class myCustomSquare extends MyRectangle{
    public void sqr(){
        System.out.println("Square is a Rectangle");
    }
}
public class Shapes{
    public static void main(String[] args){
        myCustomSquare obj = new myCustomSquare();
        obj.showShape();
        obj.Rec();       
    }
}