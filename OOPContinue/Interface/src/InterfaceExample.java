public class InterfaceExample {
    public static void main(String[] args) {
        A obj = new B();
        obj.methodA();
        Test test1 = new Test();
        test1.show();

    }
}

interface A {
   void methodA();
}

interface Constants {
    int NUMBER = 20; //interface deki değişkenler public static finaldır.
}

class B implements A {
    @Override
    public void methodA() {
        System.out.println("The method A has been implemented.");
    }
}

class Test implements Constants {
    void show(){
        System.out.println("NUMBER : " + NUMBER);
    }
}
