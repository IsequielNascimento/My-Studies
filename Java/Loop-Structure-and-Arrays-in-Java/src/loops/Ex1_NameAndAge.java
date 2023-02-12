package loops;

import java.util.Scanner;

public class Ex1_NameAndAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        int age;

        while (true) {
            System.out.print("Enter your name: ");
            name = scan.next();

            System.out.print("Enter your age: "); 
            age = scan.nextInt();

            if (age < 0 && age < 100) {
                System.out.print("Invalid age. Try again.");
              
            }

            System.out.print("You want to continue? (y/n): ");
            String answer = scan.next();

            if (answer.equalsIgnoreCase("n")) {
                break;
            }
        }
     
}
}
