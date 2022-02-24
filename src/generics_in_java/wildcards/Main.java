package generics_in_java.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // List of buildings
        List<Building> buildings = new ArrayList<>();
        buildings.add(new Building());
        buildings.add(new Building());
        printBuildings(buildings);

        // List of offices
        List<Office> offices = new ArrayList<>();
        offices.add(new Office());
        offices.add(new Office());
        printBuildings(offices);

        // List of houses
        List<House> houses = new ArrayList<>();
        houses.add(new House());
        houses.add(new House());
        printBuildings(houses);

        addHouseToList(houses);
        addHouseToList(buildings);

    }

    // use wildcards
    static void printBuildings(List<? extends Building> buildings) {
        System.out.println("Inside printBuildings");
        for (int i = 0; i < buildings.size(); i++) {
            System.out.println(i + 1 + ": " + buildings.get(i).toString());
        }
        System.out.println();
    }

    // we can pass in a list of building to this method with ~super~
    static void addHouseToList(List<? super House> buildings) {
        System.out.println("Inside addHouseToList");
        buildings.add(new House());
        System.out.println();
    }

    // invariables and outvariables

    /*
    In the printBuildings method, we are passing in a list which provides data
    which we use INSIDE the method, so this in an invariable.
     */

    /*
    In the addHouseToList method, we are using the method to give additional data to the list.
    This is an outvariable.
     */

    /*
    Note, that is generally bad idea to use wildcards as return types for a method!
     */
}
