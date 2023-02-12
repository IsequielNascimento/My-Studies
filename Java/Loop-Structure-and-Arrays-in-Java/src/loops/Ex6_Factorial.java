package loops;

import java.util.Scanner;

public class Ex6_Factorial {
    public static void main( String[] args){

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Which factorial do you want to see? ");
            int number = scan.nextInt();

            int factorial = 1;

            System.out.println("Factorial of " + number + ": ");
            for (int i = number; i > 0; i--){
                factorial *= i;
            }

            System.out.println(factorial);

            System.out.print("Want to see the factorial of another number? (Y/N) ");
            String answer = scan.next();

            if (answer.equalsIgnoreCase("N")){
                break;
            }
        }    
    }
}
