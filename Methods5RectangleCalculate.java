public class Methods5RectangleCalculate {
    public static void main(String[] args) {
   // rectangleArea(8,9);
        System.out.println("Area of the rectangle = " + rectangleArea(8, 9));
        System.out.println(rectangleArea(5, 3) + rectangleArea(4, 6));
        double area;
        area = rectangleArea(0,0);
        System.out.println(area);

    }


   /* public static void rectangleArea(int a, int b) {
        System.out.println("Area of the rectangle = " + a*b);

    }
    Parametreli ve geriye değer döndürmeyen
    */

    public static  int rectangleArea(int a, int b) {
        int area = a*b;
        return area;
 /*
return tipi ile method tipi aynı olmalı.
parametreli ve geriye değer döndüren method.
  */




    }

}
