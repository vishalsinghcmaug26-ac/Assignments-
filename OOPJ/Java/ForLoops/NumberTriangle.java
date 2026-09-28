package ForLoops;

public class NumberTriangle {
    public static void main(String[] args){
        int current_number = 1;

        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(current_number+" ");
                current_number++;
            }
            System.out.println();
        }
    }
}
