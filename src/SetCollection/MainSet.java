package SetCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Satrio");
        names.add("Sugeng");
        names.addAll(List.of("Siti","Umi", "Kezia", "Sri"));

        System.out.println(names);

        Set<String> hobbies = new LinkedHashSet<>();
        hobbies.add("Games");
        hobbies.add("E-Sport");
        hobbies.add("E-Learning");
        hobbies.add("E-Shopping");

        System.out.println(hobbies);
    }
}
