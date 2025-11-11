

import java.util.TreeMap;
import java.util.TreeSet;

public class SortSetSortMapInterface {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("3");
        treeSet.add("4");

        System.out.println(treeSet.comparator());
        System.out.println(treeMap.comparator());
        TreeSet<String> newTreeSet = (TreeSet<String>) treeSet.subSet("2", "4");
        System.out.println(newTreeSet);

        treeMap.put("1",1);
        treeMap.put("2",2);
        treeMap.put("3",3);
        treeMap.put("4",4);

        System.out.println(treeMap.subMap("2", "4"));
    }
}
