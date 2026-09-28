package Arrays;
import java.util.Scanner;

public class DuplicateValues {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.print("Enter elements: ");

        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.print("Duplicate Numbers: ");
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i]==numbers[j]){
                    System.out.print(numbers[i] + " ");
                    break;
                }
            }
        }
        sc.close();
    }
}
