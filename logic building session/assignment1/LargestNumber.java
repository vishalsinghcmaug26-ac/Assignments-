class LargestNumber{
      public static void main(String[] args){
             int a=9;
             int b=11;
             int c=7;
             int largest;
             if(a>=b && a>=c){
                largest=a;
             }
             else if(b>=a && b>=c){
                largest=b;
             }
             else { 
                largest=c;
             }
             System.out.println("Largest number is: "+largest);
       }
}