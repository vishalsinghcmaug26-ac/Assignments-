import java.util.Scanner;

public class WorkingEmployee {
    private int salary;
    private int noh;

    public void getInfo(int sal, int noh){
        this.salary = sal;
        this.noh = noh;
    }
    public void addSal(){
        if(salary<500)
            salary+=10;
    }
    public void addWork(){
        if(noh>6)
            salary+=5;
    }
    public void printSalary(){
        System.out.println("Salary: "+salary);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        WorkingEmployee emp = new WorkingEmployee();

        System.out.print("Enter salary: ");
        int sal = sc.nextInt();

        System.out.print("Enter hours: ");
        int hrs = sc.nextInt();

        emp.getInfo(sal,hrs);
        emp.addSal();
        emp.addWork();
        emp.printSalary();

        sc.close();
    }

}
