package Methods;

public class Exampl {
    static int area;
    public static void main(String[] args) {

        area = calculate(3, 4);
        System.out.println(area);

    }
    public static int calculate(int a, int b) {
        area = a + b;
        return area;
    }
}
