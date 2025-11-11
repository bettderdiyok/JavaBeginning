import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class UsingSet {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("betty");
        set1.add("a");
        set1.add("b");
        set1.add("a");
        set1.add("a");
        set1.add("a");
        set1.add("a");
        set1.add("a");
        set1.add(null);
        System.out.println(set1);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("b");
        linkedHashSet.add("b");
        linkedHashSet.add("a");
        linkedHashSet.add("c");
        linkedHashSet.add(null);
        linkedHashSet.add("a");
        System.out.println(linkedHashSet);

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("b");
        treeSet.add("a");
        treeSet.add("a");
        treeSet.add("c");
        treeSet.add("b");
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("65");
        System.out.println(treeSet);
        //TreeSet sıralı olduğu için null koyamazsın

    }
}
