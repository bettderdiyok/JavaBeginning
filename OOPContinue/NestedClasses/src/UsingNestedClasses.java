public class UsingNestedClasses {
    public static void main(String[] args) {
        MemberInnerClasses.PrintStringArray object = new MemberInnerClasses().new PrintStringArray();
        MemberInnerClasses memberObject = new MemberInnerClasses();
        MemberInnerClasses.PrintStringArray newObject= memberObject.new PrintStringArray();
        object.publicVariableInternal = 6;
        System.out.println(object.publicVariableInternal);
        String[] cities = {"İstanbul", "Ankara", "Bursa"};
        object.printStringArray(cities);
        MemberClassExampleABC.A.B memberObject2 = new MemberClassExampleABC().new A().new B();
        memberObject2.method();
        MemberClassExampleABC.A memberobject3 = new MemberClassExampleABC().new A();
        memberobject3.method1();
        memberobject3.new B().method();

    }
}
