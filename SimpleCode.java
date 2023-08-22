import java.util.Scanner;

public class SimpleCode {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String answer;

        System.out.println("Hello Broooooo");
        System.out.println("Which is better, cat or dog?");
        answer = in.nextLine();

        // Creating instances of cat and dog
        animal c = new cat();
        animal d = new dog();

        try {
            // Check the user's answer and call the appropriate sound method
            if (answer.equals("cat")) {
                c.sound(); // Calls the overridden sound method in cat class
            } else if (answer.equals("dog")) {
                d.sound(); // Calls the overridden sound method in dog class
            }
        } catch (Exception ex) {
            System.out.println("ERROEEERR BROOOOO"); // Catch and handle any exceptions
        }
    }

    // Superclass representing an animal
    public static class animal {
        public void sound() {
            System.out.println("Animal makes many sounds");
        }
    }

    // Subclass representing a cat
    public static class cat extends animal {
        @Override
        public void sound() {
            System.out.println("Cat sound is meow");
        }
    }

    // Subclass representing a dog
    public static class dog extends animal {
        @Override
        public void sound() {
            System.out.println("Dog sound is woof");
        }
    }
}
