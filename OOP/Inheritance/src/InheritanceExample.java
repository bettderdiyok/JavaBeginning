public class InheritanceExample {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(30, 20);
        rect1.printFeatures();
        System.out.println(rect1);
    }
}

class GeometricShape{
 private int width;
 private int length;

    public GeometricShape(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public GeometricShape() {
    }

    public GeometricShape(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void calculateArea(){
        System.out.println("Area : " + (width * length));
    }

    public void calculatePerimeter(){
        System.out.println("Perimeter: " +  (width + length) * 2);
    }

    @Override
    public String toString() {
        return "Lenght : " + length + "\nWidth : " + width;
    }
}

class Rectangle extends GeometricShape {
   public Rectangle (int width, int length){
       setLength(length);
       setWidth(width);
   }
    public void printFeatures(){
        System.out.println("Rectangle's width : " +  getWidth() + "\nRectangle's length : " + getLength());
        calculateArea();
        calculatePerimeter();
    }
}
