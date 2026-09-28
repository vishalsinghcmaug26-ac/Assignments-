package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.print("Enter elements: ");

        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        int left = 0;
        int right = numbers.length-1;

        while(left<right){
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reversed Array: "+Arrays.toString(numbers));
        sc.close();

    }
}
