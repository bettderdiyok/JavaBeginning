package listInterface;

import java.util.HashMap;
import java.util.Map;

public class UsingHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> licensePlates = new HashMap<>();
        licensePlates.put(1, "Adana");
        licensePlates.put(34, "İstanbul");
        licensePlates.put(16, "Bursa");
        licensePlates.put(35, "İzmir");
        licensePlates.put(06,"Ankara");
        licensePlates.put(06, "asasasa");
        licensePlates.put(null, "asdasdas");

        HashMap<Integer, String> backupLicencePlates = new HashMap<>();

        System.out.println(backupLicencePlates.size());
        backupLicencePlates.putAll(licensePlates);
        System.out.println(backupLicencePlates);
        System.out.println(licensePlates);
        System.out.println(licensePlates.get(34));
        System.out.println(licensePlates.size());
        System.out.println(licensePlates.isEmpty());
        System.out.println(licensePlates.get(null));
        System.out.println(licensePlates.containsKey(34));

        for (Integer key : licensePlates.keySet()){
            System.out.println("Key : " + key);
        }

        for (String value : licensePlates.values()) {
            System.out.println("VAlue : " + value);
        }

      for(Map.Entry<Integer, String> entry : licensePlates.entrySet()){
          System.out.println("key: " + entry.getKey() + " - Value : " + entry.getValue());

      }
    }
}
