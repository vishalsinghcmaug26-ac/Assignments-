import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (dd/mm/yyyy): ");
        String input = sc.nextLine();

        String[] parts = input.split("/");

        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        Date d = new Date(day, month, year);

        int choice;

        do {
            System.out.println("\n1. Add Date");
            System.out.println("2. Add Month");
            System.out.println("3. Add Year");
            System.out.println("4. Display Date");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of days: ");
                    int days = sc.nextInt();
                    d.addDay(days);
                    break;

                case 2:
                    System.out.print("Enter number of months: ");
                    int months = sc.nextInt();
                    d.addMonth(months);
                    break;

                case 3:
                    System.out.print("Enter number of years: ");
                    int years = sc.nextInt();
                    d.addYear(years);
                    break;

                case 4:
                    d.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}