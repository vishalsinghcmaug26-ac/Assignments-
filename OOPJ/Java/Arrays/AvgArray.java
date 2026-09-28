package Arrays;
import java.util.Scanner;

public class AvgArray {
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
        
        int avg = sum/numbers.length;

        System.out.println("Average: "+avg);

        sc.close();
    }

}
