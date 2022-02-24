package intro_to_generics;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {

    public static void main(String[] args) {

        // Example without Generics (the way to tell a compiler what type of object a collection can contain)
        List names = new ArrayList();
        names.add("Kelly");
        String name = (String) names.get(0);
        System.out.println("First name: " + name);
        // Can add integer to List
        names.add(7);
        System.out.println(names.get(1));

        // Example with Generics
        List<String> names2 = new ArrayList();
        names2.add("Kelly");
        String name2 = names2.get(0);
        System.out.println("First name: " + name2);
        // Can not add integer to list of strings: safe way
        //names2.add(7);
    }
}
