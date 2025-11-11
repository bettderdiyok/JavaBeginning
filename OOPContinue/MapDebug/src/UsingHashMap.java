import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class UsingHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(16, 0.75f);
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75F);
        map.put("emre", 1);
        map.put("fb", 2);
        map.put(null, 123456);
        map.put("Ea", 3);

        Iterator iterator = map.keySet().iterator();
        Iterator iterator1 = map.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());

        }
        iterator1.remove();
        System.out.println(map);

        linkedHashMap.put("bett", 567);
        linkedHashMap.put(null, 2);
        linkedHashMap.put("hasan", 7);
        linkedHashMap.put("ali", 23456);

        System.out.println(linkedHashMap);
        Iterator linkedHashIterator = linkedHashMap.entrySet().iterator();
        while (linkedHashIterator.hasNext()) {
            System.out.println(linkedHashIterator.next());
        }


    }
}
