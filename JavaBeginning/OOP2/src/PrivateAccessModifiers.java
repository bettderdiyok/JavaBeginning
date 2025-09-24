import java.sql.SQLOutput;

public class PrivateAccessModifiers {
    public static void main(String[] args) {
        StudentSchool o1 = new StudentSchool("Betül", "Ekren", 23, 2);
        StudentSchool o2 = new StudentSchool("Se", "Derdiyok", 100, 4);
        o1.SayAge();
        o1.setAge(80);
        o1.SayAge();
        o1.setAge(81);
        o1.SayAge();
        o1.setName("Selim");
        o1.SayName();
        o1.setName("Be");
        System.out.println();


        o2.SayAge();
        o2.setAge(80);
        o2.SayAge();
        o2.setAge(81);
        o2.SayAge();
        o2.setName("Selim");
        o2.SayName();
        o2.setName("Be");


    }
}

class StudentSchool{
   private String name;
   private String surname;
   private int age;
   private int schoolClass;

    public void setName(String name) {
        if(name.length()>=3){
            this.name = name;
        }
        else{
            System.out.println("Out of joint");

        }
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        //Burada bir kural belirledik örneğin yaş en fazla 80 olmalı
        if (age <= 80) {
            this.age = age;
        }
        else {
            System.out.println("Out of joint");
            this.setAge(0);
        }
    }

    public void setSchoolClass(int schoolClass) {
        this.schoolClass = schoolClass;
    }

    public StudentSchool(String name, String surname, int age, int schoolClass){
        setName(name);
        setSurname(surname);
        setAge(age);
       setSchoolClass(schoolClass);

    }
    public void SayAge(){
        System.out.println("My age is " + this.age); //Public olduğundan erişilebiliyor.
    }

    public void SayName(){
        System.out.println("My name is " + this.name);
    }


}
