package advanced_data_structures.linkedlistexample;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        // quick for inserting and removing elements in the middle of a list
        LinkedList<String> myList = new LinkedList();
        myList.add("A");
        myList.add("B");
        myList.add(1, "C");
        System.out.println(myList);
        myList.remove("B");
        System.out.println(myList);

    }
}
