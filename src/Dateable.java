import java.util.Scanner;

/*
This code provides a user with the minimum age a person should be to be considered "dateable" according to the folks tale
Author: Alexis C.
Date: 09-08-2023
Credit: Thanks to Jim Cohoon at The University of Virginia
 */

public class Dateable {

    public static void main(String[] args) {
        // defining variables
        int age;
        int dateableAge;
        Scanner scanner = new Scanner(System.in);
        //Asks user for input of age
        System.out.println("Please Enter Your Age:");
         age = scanner.nextInt();
         dateableAge = 7 + (age/2);
         // Prints out results based on user input
        System.out.println("At "+ age + " you can date somebody who is at least " + dateableAge + " years old.");
    }
}
