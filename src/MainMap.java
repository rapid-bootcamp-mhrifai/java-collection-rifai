import java.util.*;

public class MainMap {
    public static void main(String[] args) {
        //HashMap
        Map<String,String> map = new HashMap<>();
        map.put("firstName","Eko");
        map.put("middleName","Kurniawan");
        map.put("lastName","Khannedy");

        System.out.println(map.get("firstName"));
        System.out.println(map.get("middleName"));
        System.out.println(map.get("lastName"));
        System.out.println();

        //Weak HashMap
        Map<Integer,Integer> map1 = new WeakHashMap<>();
        for (int i = 0; i < 1000000; i++) {
            map1.put(i,i);
        }
        System.gc();
        System.out.println(map1.size());
        System.out.println();

        //Identity HashMap
        String key1 = "name.first";
        String name = "name";
        String first = "first";
        String key2 = name + "." + first;
        Map<String, String> map2 = new IdentityHashMap<>();
        map2.put(key1, "Eko Kurniawan");
        map2.put(key2, "Eko Kurniawan");

        System.out.println(map2);
        System.out.println(map2.size());
        System.out.println();

        //Linked HashMap
        Map<String,String> map3 = new LinkedHashMap<>();
        map3.put("Eko","Eko");
        map3.put("Kurniawan","Kurniawan");
        map3.put("Khannedy","Khannedy");

        for (var key: map3.keySet()) {
            System.out.println(key);
        }
        System.out.println();

        //EnumMap
        EnumMap<Level, String> map4 = new EnumMap<>(Level.class);
        map4.put(Level.FREE,"Gratis");
        map4.put(Level.STANDARD, "Bayar");
        map4.put(Level.PREMIUM, "Bayar");
        map4.put(Level.PLATINUM, "Bayar");

        System.out.println(map4.get(Level.FREE));
        System.out.println(map4.get(Level.STANDARD));
        System.out.println(map4.get(Level.PREMIUM));
        System.out.println(map4.get(Level.PLATINUM));
    }

    public static enum Level {
        FREE, STANDARD, PREMIUM, PLATINUM;
    }
}