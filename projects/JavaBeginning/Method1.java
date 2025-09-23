public class Main {
    public static void main(String[] args) {
        int x = 3, y = 5;
       print();
       print();
       printHello("Betty");
        System.out.println(hello());
        sum(x, y);
        System.out.println(multip(5, 4));
        calculateRectangleArea(5, 90);
        System.out.println("Area:" + calculateRectArea(5, 4));
    }

    public static void calculateRectangleArea(int x, int y){
        System.out.println("Area:" + x*y);


    }

    public static int calculateRectArea(int x, int y){
        return x*y;

    }
    public static void print(){
        System.out.println("Hello");
   //Parametresiz --> Geriye değer döndürmeyen.
    }

    public static void printHello(String name){
        System.out.println("Hello " + name + ". How Are You?");
        //Parametreli -->Geriye değer döndürmeyen
    }

    public static String hello(){
        return "Betty";
    }

    public static void sum(int first, int second){
        System.out.println("Sum:" + (first + second));

    }
    public static int multip(int a, int b){
        int mul = a * b;
        return mul;
    }
}


