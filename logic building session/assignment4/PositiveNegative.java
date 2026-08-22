import java.util.Scanner;

class PositiveNegative{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[6];

        int positive = 0;
        int negative = 0;

        System.out.print("Enter 6 integers: ");

        
        for (int i = 0; i < 6; i++) {
            numbers[i] = sc.nextInt();
        }

        
        for (int num : numbers) {
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            }
        }

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
    }
}