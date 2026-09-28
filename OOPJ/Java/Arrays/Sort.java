package Arrays;
import java.util.Arrays;
import java.util.Scanner; 

public class Sort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.print("Enter elements: ");

        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        System.out.print("Sorted Array: "+ Arrays.toString(numbers));

        sc.close();
    }
}
