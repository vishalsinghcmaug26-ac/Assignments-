package Inheritance;
import java.util.Scanner;

class Member{
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;
    
    public String getName(){
        return name; 
    }
    public int getAge(){
        return age;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getAddress(){
        return address;
    }
    public double getSalary(){
        return salary;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void printSalary(){
        System.out.println("Salary: "+salary);
    }
}
class PrimeMember extends Member{
    private int joiningYear;
    private double joiningFees;
    private boolean isActive;

    public int getJoiningYear(){
        return joiningYear;
    }
    public double getJoiningFees(){
        return joiningFees;
    }
    public boolean getIsActive(){
        return isActive;
    }
    public void setJoiningYear(int joiningYear){
        this.joiningYear = joiningYear;
    }
    public void setJoiningFees(double joiningFees){
        this.joiningFees = joiningFees;
    }
    public void setIsActive(boolean isActive){
        this.isActive = isActive;
    }
    public void display(){
        System.out.println("----- Member Details -----");
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Phone Number: "+getPhoneNumber());
        System.out.println("Address: "+getAddress());
        printSalary();
        System.out.println("Joining Year: "+getJoiningYear());
        System.out.println("Joining Fees: "+getJoiningFees());
        System.out.println("Is Active: "+getIsActive());
    }
}

public class PMembers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrimeMember pm = new PrimeMember();

        System.out.println("Enter Name: ");
        pm.setName(sc.nextLine());

        System.out.println("Enter Age: ");
        pm.setAge(sc.nextInt());
        sc.nextLine(); // consume newline

        System.out.println("Enter Phone Number: ");
        pm.setPhoneNumber(sc.nextLine());

        System.out.println("Enter Address: ");
        pm.setAddress(sc.nextLine());

        System.out.println("Enter Salary: ");
        pm.setSalary(sc.nextDouble());

        System.out.println("Enter Joining Year: ");
        pm.setJoiningYear(sc.nextInt());

        System.out.println("Enter Joining Fees: ");
        pm.setJoiningFees(sc.nextDouble());

        System.out.println("Is Active (true/false): ");
        pm.setIsActive(sc.nextBoolean());

        System.out.println("\n--- Output ---");
        pm.display();
        
        sc.close();
    }
}

