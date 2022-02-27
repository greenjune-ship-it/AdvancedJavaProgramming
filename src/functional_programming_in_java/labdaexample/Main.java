package functional_programming_in_java.labdaexample;

public class Main {

    public static void main(String[] args) {

        // without lambda: anonymous inner class
        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };
        gm.greet("Bethan");

        // lambdas are a quick and simple way of implementing functional interfaces
        GreetingMessage gm2 = (String name) -> {
            System.out.println("Hello " + name);
        };
        gm2.greet("Bethan");

        MessagePrinter mp = () -> {
            System.out.println("This is a message");
        };
        mp.printMessage();

    }
}
