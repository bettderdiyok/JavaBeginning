public class StringClass {
    public static void main(String[] args) {
        String name1 = new String("emre");
        String name2 = new String("emre");

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));

        String abc = "abc";
        String def = "abc";
        System.out.println(abc == def);
    }
}
