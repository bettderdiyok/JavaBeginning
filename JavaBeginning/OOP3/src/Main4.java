public class Main4 {
    public static void main(String[] args) {
     StudentS s1 = new StudentS();
     StudentS s2 = new StudentS();
        System.out.println(s1.namee);
        System.out.println(s2.namee);
        s2.namee="Selim";
        System.out.println(s2.namee);
        System.out.println(s1.age);
        s1.age=25;
        System.out.println(s1.age);
        System.out.println(s2.age);
        s1.sayName();

    }
}

class StudentS {
    String namee = "Betül";
    String surnamee = "Ekren";
    int age= 22;
    int classS = 2;

    void sayName() {
        System.out.println("My name is " + namee);
    }
}
