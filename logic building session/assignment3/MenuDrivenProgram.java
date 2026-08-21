import java.util.Scanner;

public class MenuDrivenProgram {

    // Problem 1: Grade Evaluation System
    static void gradeEvaluation() {
        int maths = 80;
        int science = 85;
        int history = 90;

        int average = (maths + science + history) / 3;

        System.out.println("Average Marks: " + average);

        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 70) {
            System.out.println("Grade: B");
        } else if (average >= 50) {
            System.out.println("Grade: C");
        } else if (average >= 30) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Fail");
        }
    }

    // Problem 2: Leap Year
    static void leapYearCheck() {
        int year = 2024;

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    // Problem 3: Days of the Week
    static void dayOfWeek() {
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("The day is Monday.");
                break;
            case 2:
                System.out.println("The day is Tuesday.");
                break;
            case 3:
                System.out.println("The day is Wednesday.");
                break;
            case 4:
                System.out.println("The day is Thursday.");
                break;
            case 5:
                System.out.println("The day is Friday.");
                break;
            case 6:
                System.out.println("The day is Saturday.");
                break;
            case 7:
                System.out.println("The day is Sunday.");
                break;
            default:
                System.out.println("Invalid day number");
        }
    }

    // Problem 4: Default Values
    byte a;
    short b;
    int c;
    long d;
    float e;
    double f;
    char g;
    boolean h;

    static void defaultValues() {
        MenuDrivenProgram obj = new MenuDrivenProgram();

        System.out.println("byte: " + obj.a);
        System.out.println("short: " + obj.b);
        System.out.println("int: " + obj.c);
        System.out.println("long: " + obj.d);
        System.out.println("float: " + obj.e);
        System.out.println("double: " + obj.f);
        System.out.println("char: " + obj.g);
        System.out.println("boolean: " + obj.h);
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            
            System.out.println("1. Grade Evaluation System");
            System.out.println("2. Leap Year Check");
            System.out.println("3. Day of the Week");
            System.out.println("4. Identify Default Values of Variables");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    gradeEvaluation();
                    break;

                case 2:
                    leapYearCheck();
                    break;

                case 3:
                    dayOfWeek();
                    break;

                case 4:
                    defaultValues();
                    break;

                case 5:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        
    }
}