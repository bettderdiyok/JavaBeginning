package OOPExamples;

public class MainCircle {
    public static void main(String[] args) {
     CircleAndFilledCircle circle = new CircleAndFilledCircle(5);
        System.out.println("Circle perimeter : " + circle.calculatePerimeter());
        System.out.printf("Circle perimeter :  %.2f\n", circle.calculatePerimeter());
        System.out.println("Circle area : " + circle.calculateArea());
        System.out.println("Radius : " + circle.getRadius());
        circle.setRadius(9);
        System.out.println("Radius : " + circle.getRadius());
        System.out.println("Circle perimeter : " + circle.calculatePerimeter());
    }
}
