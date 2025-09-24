public class StudentExample3 {
    public static void main(String[] args) {
        Studentss o1=new Studentss("Betül", "Ekren", 22, 2);
        System.out.println(o1.age);
        Studentss o2 = new Studentss("Selim", "Derdiyok", 23, 4);
        System.out.println(o2.age);
        o2.age=15;
        System.out.println(o2.age);
    }
}

class Studentss{
    String name;
    String surname;
    int age;
    int schoolClass;
  public  Studentss(String name, String surname, int age, int schoolClass){
       this.name=name;
       this.surname=surname;
       this.age=age;
       this.schoolClass=schoolClass;

   }
}