public class StudentExample {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.name="Betül";
        student1.surname="Ekren";
        student1.age=22;
        student1.schoolClass=2;

        System.out.println(student1.name);
        Student student2 = new Student();
        System.out.println(student2.name);
        student2=student1;
        System.out.println(student2.name);
        student1.sayName();
    }
}

class Student{
    String name;
    String surname;
    int age;
    int schoolClass;

    public void sayName(){
        System.out.println("My name is " + name);
    }



}
