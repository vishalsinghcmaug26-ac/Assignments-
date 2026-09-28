package Arrays;

import java.util.Scanner;

public class ComplexNumber {
    private int num1;
    private int num2;

    public int getNum1(){
        return this.num1;
    }
    public int getNum2(){
        return this.num2;
    }

    public void setNum1(int n1){
        this.num1 = n1;
    }
    public void setNum2(int n2){
        this.num2 = n2;
    }

    public int computeComplexNumber(){
        return num1*num2;
    }

    public static void main(String[] args) {
    // 1. Setup scanner for user input
    Scanner scanner = new Scanner(System.in);
    
    // 2. Create an array to hold 5 ComplexNumber objects
    ComplexNumber[] numberArray = new ComplexNumber[5];
    
    // 3. First Loop: Gather inputs and populate the array
    System.out.println("--- Enter Values for 5 Complex Numbers ---");
    for (int i = 0; i < numberArray.length; i++) {
        // CRITICAL STEP: Create the actual object at this index
        numberArray[i] = new ComplexNumber();
        
        System.out.println("\nFor Object " + (i + 1) + ":");
        System.out.print("Enter Number 1: ");
        int n1 = scanner.nextInt();
        
        System.out.print("Enter Number 2: ");
        int n2 = scanner.nextInt();
        
        // Use your setters to pass the values into the object
        numberArray[i].setNum1(n1);
        numberArray[i].setNum2(n2);
    }
    
    // 4. Second Loop: Calculate and display the results
    System.out.println("\n--- Displaying Multiplication Results ---");
    for (int i = 0; i < numberArray.length; i++) {
        // Call the method you wrote and print its return value
        int result = numberArray[i].computeComplexNumber();
        System.out.println("Result for Object " + (i + 1) + ": " + result);
    }
    
    scanner.close();
}

}
