public class Constructor {
    public static void main(String[] args) {
        StudentClass st1 = new StudentClass("Betül", "Ekren", 30, 0);
        StudentClass st2 = new StudentClass("Selim", "Derdiyok", 22, 4);
        st1.sayName();
        System.out.println();
        st1.setName("Se");
        st1.sayName();
        st1.setAge(300);
        st1.sayAge();
    }
}

class StudentClass {
    private String name;
    private String surname;
    private int age;

    public void setName(String name) {
        if(name.length()>=3){
            this.name = name;
        }
        else {
            System.out.println("Invalid input");
            this.name = "invalid";
        }
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        if(age < 80){
            this.age = age;
        }
        else {
            System.out.println("Invalid input");
            this.age = 0;
        }

    }

    public void setYearS(int yearS) {
        this.yearS = yearS;
    }

    private  int yearS;
    public void sayAge(){
        System.out.println("My age is " + this.age);
    }

    public void sayName(){
        System.out.println("My name is " + this.name);
    }


   public  StudentClass(String name, String surname, int age, int yearS) {
      setName(name);
      setSurname(surname);
      setAge(age);
      setYearS(yearS);

       /* this.name = name;
        this.surname = surname;
        this.age= age;
        this.yearS = yearS;

        */
       /* Constructor  tanımlamasında  yani
        StudentClass st1 = new StudentClass("k", "Ekren", 350, 2);
        burada da yukarıdaki gibi yanlış girildiğinde setteki gibi kontrol edilmesini istiyoruz o yüzden
        bu name age gibi değişkenleri artık this ile değil set metodu ile çağırırız.
*/

    }
}