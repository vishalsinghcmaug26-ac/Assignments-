package Arrays;

import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();
        int[] ogArray = new int[size];
        System.out.print("Enter elements: ");

        for(int i=0; i<size; i++){
            ogArray[i] = sc.nextInt();
        }

        int[] copiedArray = new int[ogArray.length];

        for(int i=0; i<ogArray.length; i++){
            copiedArray[i] = ogArray[i];
        }

        System.out.print("The copied array contains: ");
        for(int element : copiedArray){
            System.out.print(element+" ");
        }

        sc.close();

    }
    
}
