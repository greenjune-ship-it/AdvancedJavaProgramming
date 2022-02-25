package functional_programming_in_java.functionalinterfaceexample;

public class Main {

    public static void main(String[] args) {

        GreetingMessage gm = new GreetingMessage() {

            @Override
            public void greet (String name) {
                //  throw new UnsupportedOperationException("Not supported yet.");
                System.out.println("Hello " + name);
            }

        };

        gm.greet("Bethan");

    }

}
