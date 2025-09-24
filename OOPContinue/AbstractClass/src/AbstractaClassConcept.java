public class AbstractaClassConcept {
    public static void main(String[] args) {
        GeometricShape geometricShape = new Square(5);
        geometricShape.calculatePerimeter();
        if (geometricShape instanceof  Square) {
            Square newSquare = (Square)geometricShape;
            newSquare.sayName();
        }
        //Cast yapmadan erişemeyiz.
        Rectangle rectangle = new Rectangle(5, 3);
        rectangle.calculatePerimeter();
        rectangle.calculateArea();
        rectangle.sayName();

        GeometricShape rectangle2 = new Rectangle(6, 2);
        //Üst sınıfta bulunan ortak özelliklere ve üst sınıftakilere erişebilirim sayName e erişemem.


        GeometricShape circle = new Circle(5);
        circle.calculatePerimeter();
        circle.calculateArea();
        compareAreas(circle, rectangle);
    }
    /* bunun yeribe polymorphism ile aşağıdaki gibi yap
    public static void compareAreas(Square square1, Square square2 ){}
    public static void compareAreas(Rectangle rectangle1, Square square){}
    public static void compareAreas(Rectangle rectangle1, Rectangle rectangle){}
     */
    public static void compareAreas(GeometricShape g1, GeometricShape g2){
        if (g1.getCalculatedArea() < g2.getCalculatedArea()) {
            System.out.println("The area of the first parameter’s object is smaller than the area of the second parameter’s object.");
        }else if (g1.getCalculatedArea() > g2.getCalculatedArea()){
            System.out.println("The area of the first parameter’s object is bigger than the area of the second parameter’s object.");
        }else System.out.println("They are equals");

    }


}

abstract class GeometricShape {
    private int firstEdge;
    private int calculatedArea;
    private int calculatedPerimeter;

    

    public int getFirstEdge() {
        return firstEdge;
    }

    public void setFirstEdge(int firstEdge) {
        this.firstEdge = firstEdge;
    }

    public int getCalculatedArea() {
        return calculatedArea;
    }

    public void setCalculatedArea(int calculatedArea) {
        this.calculatedArea = calculatedArea;
    }

    public int getCalculatedPerimeter() {
        return calculatedPerimeter;
    }

    public void setCalculatedPerimeter(int calculatedPerimeter) {
        this.calculatedPerimeter = calculatedPerimeter;
    }

    abstract public void calculatePerimeter();

    abstract public void calculateArea();

}

  class Square extends GeometricShape {
      public Square(int edge) {
          this.setFirstEdge(edge);
      }

      @Override
    public void calculatePerimeter() {

        System.out.println("The perimeter of the Square : " + getFirstEdge()*4);

    }

      @Override
      public void calculateArea() {
          setCalculatedArea(2*getFirstEdge());
          System.out.println("The area of the square : " + getCalculatedArea());

      }

      public void sayName(){
          System.out.println("I'm a square object.");
      }


  }

  class Rectangle extends GeometricShape {
      private final int secondEdge;

      public Rectangle(int firstEdge, int secondEdge) {
          this.setFirstEdge(firstEdge);
          this.secondEdge = secondEdge;
      }

      @Override
      public void calculatePerimeter() {
          System.out.println("The perimeter of the rectangle : " + 2 * (getFirstEdge() + secondEdge));

      }

      @Override
      public void calculateArea() {
          setCalculatedArea(getFirstEdge() * secondEdge);
          System.out.println("The area of the rectangle : " + getCalculatedArea());

      }

      public void sayName(){
          System.out.println("I'm a rectangle object");
      }

  }

  class Circle extends GeometricShape {
    final double PI = Math.PI;
      public Circle(int radius) {
          setFirstEdge(radius);
      }


      @Override
      public void calculatePerimeter() {
          setCalculatedPerimeter((int)(2 * PI * getFirstEdge()));
          System.out.println("The perimeter of the circle : " + getCalculatedPerimeter());

      }

      @Override
      public void calculateArea() {
          setCalculatedArea((int) (PI * Math.pow(getFirstEdge(), 2)));
          System.out.println("The area of the circle : " + getCalculatedArea());
      }
  }





