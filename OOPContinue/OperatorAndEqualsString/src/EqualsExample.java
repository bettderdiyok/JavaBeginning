public class EqualsExample {
    public static void main(String[] args) {
        //String Pool
        String s1 = "Java";
        String s2 = "Java";

        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1.aquals(s2) " + s1.equals(s2));

        //new
        String s3 = new String("Java");
        String s4 = new String("Java");

        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        Person s5 = new Person("Betty");
        Person s6 = new Person("Betty");

        System.out.println(s5 == s6);
        System.out.println(s5.equals(s6));

    }
}

class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
}
