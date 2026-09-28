public class Triangle {
    Triangle(int a, int b, int c){
        int perimeter = a+b+c;
        System.out.println("Perimeter= "+perimeter);
        int spm = (a+b+c)/2;
        double area = Math.sqrt(spm*(spm-a)*(spm-b)*(spm-c));
        System.out.println("Area= "+area);
    }
    public static void main(String[] args){
        new Triangle(3, 4, 5);
    }
}
