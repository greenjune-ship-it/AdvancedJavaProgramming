package functional_programming_in_java.methodreferencesexample;

public class Main {

    public static void main(String[] args) {

        Square s = new Square(4);

        // why are we taking about reference if we can just do it like this??
        System.out.println(s.calculateArea());

        // complicated code
//        Shapes shapes = (Square square) -> {
//            return square.calculateArea();
//        };

        // simplify with reference
        Shapes shapes = Square::calculateArea;

        System.out.println("Area: " + shapes.getArea(s));

    }
}
