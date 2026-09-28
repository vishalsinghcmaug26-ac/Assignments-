public class Employee {
    private String name;
    private int yoj;
    private String address;
    
    Employee(String n, int yy, String add){
        this.name = n;
        this.yoj = yy;
        this.address = add;        
    }

    public static void main(String[] args){
        Employee obj1 = new Employee("Robert", 1994, "64C-Wallstreet");
        Employee obj2 = new Employee("Sam", 2000, "68D-Wallstreet");
        Employee obj3 = new Employee("John", 1999, "26B-Wallstreet");
        System.out.println("Name"+"\t"+"Year of Joining"+"\t"+"Address");
        System.out.println(obj1.name+"\t"+obj1.yoj+"\t"+obj1.address);
        System.out.println(obj2.name+"\t"+obj2.yoj+"\t"+obj2.address);
        System.out.println(obj3.name+"\t"+obj3.yoj+"\t"+obj3.address);
    }
}
