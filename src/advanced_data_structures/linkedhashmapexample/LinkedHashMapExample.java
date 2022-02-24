package advanced_data_structures.linkedhashmapexample;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        /*
        Arguments in linked HashMap:
        first = number of entries
        second = load factor. This specifies how full the map can be before it is made bigger. Default = 0.75f.
                 This means that when the map is 75% full, it will increase in size.
        third = bool, which specifies the ordering mode (default: insertion order)
         */
        LinkedHashMap<String, Integer> phonebook = new LinkedHashMap();
        phonebook.put("Kevin", 12345);
        phonebook.put("Jill", 98765);
        phonebook.put("Brenda", 123123);
        phonebook.put("Gary", 22222);

        System.out.println("List of contacts in phonebook:");
        for (Map.Entry<String, Integer> entry : phonebook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
