package wildcards;

public class House extends Building {

    public int numberOfRooms = 10;

    @Override
    public String toString() {
        return ("house");
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms() {
        this.numberOfRooms = numberOfRooms;
    }

}
