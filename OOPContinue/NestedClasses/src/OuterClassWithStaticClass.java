public class OuterClassWithStaticClass {
    int objectVariable;
    static int staticVariable;
    public void method(){}
    public static void staticMethod(){}
    static class InnerClass{
        int innerClassVariabla;
        static int innerClassStatic;
        public void innerClassMethod(){
            staticVariable = 10;
            staticMethod();

        }
        static void innerClassStaticMethod(){}
    }

}


