package Arrays;
import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("Enter elements: ");

        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }

        int min = array[0];
        int max = array[0];

        for(int i=1; i<array.length; i++){
            if(min<array[i])
                min = array[i];
            if(max>array[i])
                max = array[i];
        }
        System.out.println("Minimum: "+min);
        System.out.println("Maximum: "+max);
        sc.close();
    }
}
