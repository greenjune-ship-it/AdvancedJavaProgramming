package functional_programming_in_java.methodreferencesexample;

public class Square {

    int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public int calculateArea() {
        return sideLength * sideLength;
    }

}
