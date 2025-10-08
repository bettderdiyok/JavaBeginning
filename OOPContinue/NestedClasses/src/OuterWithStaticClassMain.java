public class OuterWithStaticClassMain {
    public static void main(String[] args) {
        OuterClassWithStaticClass outerClass = new OuterClassWithStaticClass();
        outerClass.objectVariable = 3;
        outerClass.method();
        OuterClassWithStaticClass.staticMethod();
        OuterClassWithStaticClass.InnerClass innerClass = new OuterClassWithStaticClass.InnerClass();
        innerClass.innerClassVariabla = 7;
        OuterClassWithStaticClass.InnerClass.innerClassStaticMethod();

    }
}
