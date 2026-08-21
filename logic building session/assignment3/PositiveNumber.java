import java.util.Scanner;

class PositiveNumber {

    static int askForPositiveNumber() {
        Scanner obj = new Scanner(System.in);
        int a;

        do {
            System.out.print("Enter a positive number: ");
            a = obj.nextInt();
        } while (a <= 0);

        return a;
    }

    public static void main(String[] args) {

        int num = askForPositiveNumber();

        System.out.println("You entered a positive number: " + num);
    }
}