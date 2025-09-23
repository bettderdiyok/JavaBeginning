package OOPExamples;

public class MainCalculater {
    public static void main(String[] args) {
        System.out.println("Sum : " + Calculater.sum(4,6,2,6));
        System.out.println("Subst : " + Calculater.substraction(15,4,3));
        System.out.println("Multiple : " + Calculater.multiple(5,3,-3,2));
       if(Calculater.divide(40, 5, 2) != -1){
           System.out.println(Calculater.divide(40, 5, 2));

       }else {
           System.out.println("Divide is failed");
       }
    }
}
