package loops;

import java.util.Scanner;

public class Ex5_EvenOdd {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int CountNumber;
        int number;
        int even = 0, odd = 0;

        System.out.println("How many numbers do you want to enter? ");
        CountNumber = scan.nextInt();

        int count = 0;

        do {
            System.out.println("Number: ");
            number = scan.nextInt();

            if (number % 2 == 0){
                even++;
            } else {
                odd++;
            }

            count++;

        } while (count < CountNumber);

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

    }
}
