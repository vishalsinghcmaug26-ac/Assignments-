package Inheritance;

class Rectangle{
    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    public void printArea(){
        int area = length*width;
        System.out.println("Area: "+area);
    }
    public void printPerimeter(){
        int perimeter = 2 * (length + width);
        System.out.println("Perimeter: "+perimeter);
    } 
}

class Squares extends Rectangle{
    
    public Squares(int side){
        super(side,side);
    }
}

public class RectangleSquare{
    public static void main(String[] args){
        System.out.println("----- Rectangle Details -----");
        Rectangle rec = new Rectangle(4, 5);
        rec.printArea();
        rec.printPerimeter();
        System.out.println("----- Square Details -----");
        Squares sq = new Squares(4);
        sq.printArea();
        sq.printPerimeter();
    }
}
