package substitution_pribciple;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Building building = new Building();
        Office office = new Office();
        build(building);
        build(office);

        // we can add Office objects to the list because office is a subtype of building
        // that's the substitution principle
        List<Building> buildings = new ArrayList<>();
        buildings.add(new Building());
        buildings.add(new Office());
        printBuildings(buildings);

        // incompatible type error: list of offices is not a subclass of list of builidings
        // substitution principle does not apply here
        List<Office> offices = new ArrayList<>();
        offices.add(new Office());
        offices.add(new Office());
        printBuildings(offices);
    }

    static void build(Building building) {
        System.out.println("Constructing a new " + building.toString());
    }

    static void printBuildings(List<Building> buildings) {
        for (int i = 0; i < buildings.size(); i++) {
            System.out.println(i + 1 + ": " + buildings.get(i).toString());
        }
    }
}
