import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeMap;

public class UsingTreeMap {
    public static void main(String[] args) {
        TreeMap <String, Integer> treeMap = new TreeMap<>();
        treeMap.put("emre", 456);
        treeMap.put("hasan", 2);
        treeMap.put("ayse", 36);
        treeMap.put("bettt", 6);
        System.out.println(treeMap);
        TreeMap<Square, String> squareStringTreeMap = new TreeMap<>(new Comparator<Square>() {
            @Override
            public int compare(Square o1, Square o2) {
                return Integer.compare(o1.edge, o2.edge);
            }
        });



        Square s1 = new Square(4, "pink");
        Square s2 = new Square(7, "blue");
        squareStringTreeMap.put(s1, "pink square");
        squareStringTreeMap.put(s2, "blue square");
        System.out.println(squareStringTreeMap.entrySet().toString());


        Iterator iterator = treeMap.entrySet().iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());

        }


    }

}

class  Square {
    int edge;
    String color;

    public Square(int edge, String color) {
        this.edge = edge;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + edge +
                ", color='" + color + '\'' +
                '}';
    }
}
