package advanced_data_structures.hashmapexample;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<String, Integer> phonebook = new HashMap<>();
        phonebook.put("Kevin", 12345);
        phonebook.put("Jill", 98765);
        phonebook.put("Brenda", 123123);
        // Brenda will be overwritten without error
        phonebook.put("Brenda", 22222);
        // null might be a key
        phonebook.put(null, 000);
        if (phonebook.containsKey("Brenda")) {
            phonebook.remove("Brenda");
        }
        phonebook.clear();
        System.out.println(phonebook);

    }

}
