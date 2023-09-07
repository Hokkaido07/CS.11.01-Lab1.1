import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        int age;
        int pages;
        Scanner scanner = new Scanner(System.in);
        //asks user for age
        System.out.println("Please enter your age: ");
        age = scanner.nextInt();
        pages = 100 - age;
        // Prints results
        System.out.println("At the age of " + age + ", you should read " + pages + " pages before giving up on a book.");


    }
}
