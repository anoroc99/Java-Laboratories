
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        System.out.println("\nLength = "+rec1.getLength() +"\nWidth = "+rec1.getWidth());
        System.out.println("Area of Rectangle : "+rec1.getArea());
        System.out.println("Perimeter of Rectangle : "+rec1.getPerimeter());

        //Changing length and width
        rec1.setLength(7);
        rec1.setWidth(10);

        System.out.println("\nLength = "+rec1.getLength() +"\nWidth = "+rec1.getWidth());
        System.out.println("Area of Rectangle : "+rec1.getArea());
        System.out.println("Perimeter of Rectangle : "+rec1.getPerimeter());

         // Setting the length and width more than 20

        rec1.setWidth(22);
        rec1.setLength(25);
        System.out.println("\nLength = "+rec1.getLength() +"\nWidth = "+rec1.getWidth());
        System.out.println("Area of Rectangle : "+rec1.getArea());
        System.out.println("Perimeter of Rectangle : "+rec1.getPerimeter());
    }
}