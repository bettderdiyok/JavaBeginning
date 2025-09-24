package OOPExamples;

public class CircleAndFilledCircle {
    private int radius;
    private final static double PI = Math.PI;

    public CircleAndFilledCircle(int radius) {
        this.radius = radius;
    }

    public double calculatePerimeter(){
        return   2 * PI * radius;
    }

    public double calculateArea(){
        return  PI * radius * radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
