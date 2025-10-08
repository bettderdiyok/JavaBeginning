public class SummaryAndJava8 {
    public static void main(String[] args) {
         ClassA a = new ClassA();
         a.methodA();
         InterfaceA.staticMethod();
    }
}

interface InterfaceA { //varsayılan olarak abstract zaten
    void methodA();
    default void defaultMethod(){
        System.out.println("I'm default method with Java8");
    }
    public static final int number = 10;
    static void staticMethod(){
        System.out.println("I'm static method with Java8");
    }
}

class ClassA implements  InterfaceA {

    @Override
    public void methodA() {
        defaultMethod();
    }

}
