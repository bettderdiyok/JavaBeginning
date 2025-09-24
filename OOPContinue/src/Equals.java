import java.util.Objects;

public class Equals {
    public static void main(String[] args) {
        Person p1 = new Person(5, "Betty");
        Person p2 = new Person(5, "Betty");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("p1 and p2 are equals: " + p1.equals(p2) );

        p1.toString();
        p1 = p2;
        System.out.println("p1 and p2 are equals: " + p1.equals(p2) );





    }
}

class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "id : " + id + " name : " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    /*  @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    // default
   */
    /*
    Burada super.equals(obj) dediğin için → Object sınıfının equals() metodunu çağırıyorsun.

Object.equals() default olarak == (referans) karşılaştırması yapar.

Yani p1 ve p2 farklı new ile oluşturulduğu için, adresleri farklı → false döner.
     */
}
