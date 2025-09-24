public class StudentExample2 {
    public static void main(String[] args) {
        Students  o1 = new Students();
        Students  o2 = new Students();
        o2.age=12;
        o1.name="Selim";


        System.out.println(o2.age);
        System.out.println(o1.age);
        o1.sayName();
        o2.sayName();
    }
}
class  Students{
    String name="Betül";
    String surname="Ekren";
    int age=20;
    int schoolClass=4;

    public void sayName(){
        System.out.println("My name is "+ name);
    }

}