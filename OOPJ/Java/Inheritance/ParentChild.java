package Inheritance;

class Parent{
    public void display(){
        System.out.println("This is parent class");
    }
}
class Child extends Parent{
    public void show(){
        System.out.println("This is child class");
    }
}
public class ParentChild{
    public static void main(String[] args){
        Parent obj1 = new Parent();
        Child obj2 = new Child();
        obj1.display();
        obj2.show();
        obj1.display();
    }
}