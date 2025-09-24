public class Constructor2 {
    public static void main(String[] args) {
        Sstudent str1 = new Sstudent("Sude", "Odabaş", 22, 2);
        Sstudent str2 = new Sstudent("Yurdal", "Duran", 32, 4);
        str1.sayName();

        str1.setName("Betül");
        str1.sayName();
        System.out.println(str1.getName());

        str1.setName("Se");
       // str1.sayName();
        System.out.println(str1.getName());

        System.out.println( str2.getName());




    }
}

class Sstudent{
private String name;
private String surname;
private int age;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getYears() {
        return years;
    }

    private int years;

   public void sayYears(){
       System.out.println("My class is " + years);
   }
    public void sayName(){
        System.out.println("My name is " + name);
    }

    public void saySurname(){
        System.out.println("My surname is " + surname);
    }

    public void setName(String name) {
       if (name.length() >= 3) {
           this.name = name;
       }
      else  {
           System.out.println("Invalid Input!");
           this.name=null;
       }

    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public Sstudent (String name, String surname, int  age, int years){
     setName(name);
     setSurname(surname);
     setAge(age);
     setYears(years);



    }
}