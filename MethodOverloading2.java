public class MethodOverloading2 {
    public static void main(String[] args) {
        sum(5, 9);
    }
    public static void sum(int a){
        System.out.println("One Parameter ");
    }

    public static void sum(int a, int b){
        System.out.println("Two Parameter ");
    }

}
