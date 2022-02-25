/*
Lambdas represent the implementation of a functional interface.
Functional interface is an interface that has only one abstract method.
 */

package functional_programming_in_java.functionalinterfaceexample;

@FunctionalInterface
public interface GreetingMessage {

    public abstract void greet(String name);

}
