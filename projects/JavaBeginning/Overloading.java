public class Main {
    public static void main(String[] args) {
      sum();
      sum(4, 6);
      sum(5.4, 7.8);
      sum(6.5, 5);
      sum(3, 5, 4);
    }

    public static void sum(){
        System.out.println(6 + 5);
    }
    public static void sum(int x, int y){
        System.out.println(x + y);
    }
    public static void sum(double x, double y){
        System.out.println(x + y);
    }
    public static void sum(double x, int y){
        System.out.println(x + y);
    }
    public static void sum(int x, int y, int z){
        System.out.println(x + y + z);
    }




}