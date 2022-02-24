package generic_methods;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {

    // Generic methods allow to create a new type parameter just for that method
    // Add flexibility about the type of objects can be passed in the method

    static Character[] charArray = {'h', 'e', 'l', 'l', 'o'};
    static Integer[] intArray = {1, 2, 3, 4, 5};
    static Boolean[] boolArray = {true, false, true};

    // using objects means that we lose type safety
//    public static List arrayToList(Object[] array, List<Object> list) {
//        for (Object object : array) {
//            list.add(object);
//        }
//        return list;
//    }

    // create generic method
    // T is a variable in local scope, just means that type should be the same
    public static <T> List<T> arrayToList(T[] array, List<T> list) {
        for (T object : array) {
            list.add(object);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());
    }
}
