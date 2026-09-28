public class Rectangle {
    int area; 

    Rectangle(int a, int b){
        
        this.area = this.Area(a, b); 
    }
    
    public int Area(int l, int b){
        int area = l*b;
        return area;
    }

    
    @Override
    public String toString() {
        return String.valueOf(this.area);
    }

    public static void main(String[] args){
        System.out.println("Area of Rectangle is: "+new Rectangle(4, 5));
        System.out.println("Area of Rectangle is: "+new Rectangle(5, 8));
    }
}
