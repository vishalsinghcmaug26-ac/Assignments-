import java.util.Scanner;
 
class MultiplicationTable{
      static void printMultiplicationTable(){
             Scanner obj= new Scanner(System.in);
             System.out.print("Enter a number: ");
             int num= obj.nextInt();
             
             for(int i=1;i<=10;i++){
                     System.out.println(num + "x" + i + "=" + (num*i));
             }
      }

      public static void main(String[] args){
             printMultiplicationTable();
      }
}
      