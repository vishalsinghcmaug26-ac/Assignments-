public class Student{
    private String name;
    private int roll_no;
    private String phone_no;
    private String address;

    public static void main(String[] args){
        Student obj1 = new Student();
        Student obj2 = new Student();
        obj1.name = "John";
        obj1.roll_no = 2;
        obj1.phone_no = "7346578978";
        obj1.address = "Kansas";
        obj2.name = "Sam";
        obj2.roll_no = 4;
        obj2.phone_no = "6875437897";
        obj2.address = "Washington";
        System.out.println(obj1.name+" "+obj1.roll_no+" "+obj1.phone_no+" "+obj1.address); 
        System.out.println(obj2.name+" "+obj2.roll_no+" "+obj2.phone_no+" "+obj2.address);

    }
}