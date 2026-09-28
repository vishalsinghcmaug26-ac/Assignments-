public class ComplexNumber {
    private final double real;
    private final double imaginary;

    
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    
    public double getReal() {
        return real;
    }

    
    public double getImaginary() {
        return imaginary;
    }

    
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(
            this.real + other.real, 
            this.imaginary + other.imaginary
        );
    }

    
    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(
            this.real - other.real, 
            this.imaginary - other.imaginary
        );
    }

    public ComplexNumber multiply(ComplexNumber other){
        return new ComplexNumber(this.real * other.real, this.imaginary * other.imaginary);
    }

    
    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + Math.abs(imaginary) + "i";
        }
    }


    public static void main(String[] argument) {
        ComplexNumber num1 = new ComplexNumber(4.5, 3.0);  
        ComplexNumber num2 = new ComplexNumber(1.2, 5.0);  

        ComplexNumber sum = num1.add(num2);
        ComplexNumber difference = num1.subtract(num2);
        ComplexNumber product = num1.multiply(num2);

        System.out.println("First Number:  " + num1);
        System.out.println("Second Number: " + num2);
        System.out.println("Sum:           " + sum);         
        System.out.println("Difference:    " + difference);
        System.out.println("Product:       " + product);  
    }
}

