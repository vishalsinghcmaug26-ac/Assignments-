package Arrays;
import java.util.Scanner;

public class SumArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.print("Enter elements: ");

        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        
        int sum = 0;

        for(int number : numbers){
            sum += number;
        }

        System.out.println("Sum: "+sum);
        sc.close();

    }
    
}
