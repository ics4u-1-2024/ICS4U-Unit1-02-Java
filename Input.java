/*
* The Input program allows terminal input from keyboard.
*
* @author  Mr Coxall
* @version 1.0
* @since   2020-01-01
*/

import java.util.Scanner;

/**
* This is the standard terminal input from keyboard program.
*/
final class Input {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private Input() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // create a scanner object to get input
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hey there " + name);

        System.out.print("What is your age? ");
        String ageString = scanner.nextLine();
        int ageNumber = Integer.parseInt(ageString);
        ageNumber = ageNumber - 10;
        System.out.println("Age is > " + ageNumber);

        scanner.close();
        System.out.println("\nDone.");
    }
}
