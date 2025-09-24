public class Main3 {
    public static void main(String[] args) {
     Student s1 = new Student();
     Student s2 = new Student();
     s1.name="Betül";
     s1.surname="Ekren";
     s1.age=22;
     s1.schollClass=2;

        s2.name="Selim";
        s2.surname="Derdiyok";
        s2.age=22;
        s2.schollClass=4;

        System.out.println(s1.name);
        System.out.println(s2.name);
       /* s2=s1; //s2 artık s1 in göstergesini göstersin. Atama değil!
        System.out.println(s2.name);
        s2.name="Selim";
        System.out.println(s1.name);
        s1.go();
        */

        s2.sayName();





    }
}

class Student {
    String name;
    String surname;
    int age;
    int schollClass;

  public void go() {
      System.out.println("Go to the Scholl...");
  }

  public void sayName(){
      System.out.println("My name is " + name);
  }

}
