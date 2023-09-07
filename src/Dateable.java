import java.util.Scanner;

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
