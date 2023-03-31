public class MethodOverloading {
    public static void main(String[] args) {
        sum(5);
    }

    public static void sum(int a){
        System.out.println("One Parameter " + a);
    }

    public static void sum(int a, int b){
        System.out.println("Two Parameter" + a);
    }
}
