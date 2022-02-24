package advanced_data_structures.generics_in_java.wildcards;

public class Building {

    public int numberOfRooms = 7;

    @Override
    public String toString() {
        return ("building");
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
}
