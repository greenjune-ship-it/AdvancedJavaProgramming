package input_and_output.scannerexample;

import java.util.Scanner;

public class PersonCreator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name, age and phone number:");
        String name = scanner.next();
        int age = scanner.nextInt();
        Long phoneNumber = scanner.nextLong();

        Person person = new Person(name, age, phoneNumber);

    }
}
