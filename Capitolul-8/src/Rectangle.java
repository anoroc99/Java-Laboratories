// Capitolul 8, sarcina 8.4
//Create a class Rectangle with attributes length and width, each of which
//defaults to 1. Provide methods that calculate the rectangle’s perimeter and area. It has set and get
//methods for both length and width. The set methods should verify that length and width are each
//floating-point numbers larger than 0.0 and less than 20.0. Write a program to test class Rectangle.


public class Rectangle {
    private float length;  //The rectangle lentgth
    private float width;  //The rectangle width

    public Rectangle() {
        this.length= 1;
        this.width= 1;
    }
    public Rectangle(float length,float width) {
        this.setLength(length);
        this.setWidth(width);
    }
    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        if(inRange(length)) {
            this.length=length;
        }
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        if(inRange(width)) {
            this.width=width;
        }
    }
    private boolean inRange(float value) {
        if(value> 0 &&value<= 20) {
            return true;
        }else{
            System.out.println("Please enter value in range 1-20");
            return false;
        }
    }
    public float getPerimeter() {
        float perimeter = 2 * (this.length+this.width);
        return perimeter;
        }
        public float getArea() {
        float area=this.length*this.width;
        return area;
    }
}
