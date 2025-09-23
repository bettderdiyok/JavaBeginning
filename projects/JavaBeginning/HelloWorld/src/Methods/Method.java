package Methods;

public class Method {
    public static void main(String[] args) {
        print();
        printHey("How Are You?");
        System.out.println(hello());
        System.out.println(sum(7, 4));

    }
    public static void print() {
        System.out.println("Hello method");
        //Parametresiz ve Geriye değer döndürmeyen metot
    }

    public static void printHey(String message) {
        System.out.println(message);
        //Parametreli  ve Geriye değer döndürmeyen metot
    }

    public static String hello() {
        return "String value";
        //Parametresiz ve geriye değer döndüren metot
    }

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
        //Parametreli ve geriye değer döndüren metot.
    }

    public static int sign(int n) {
        if (n>0) {
            return 1;
        } else if (n==0) {
            return 0;
        } else if (n<0) {
            return -1;
        }
        return n;

    }
}
