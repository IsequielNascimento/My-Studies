package arrays;

import java.util.Scanner;

public class Ex1_ReverseOrder {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);  
        
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++){
            int number = scan.nextInt();
            numbers[i] = number;
        }
        
        System.out.println("Original order: ");
        int count = 0;
        while (count < numbers.length){
            System.out.print(numbers[count] + " ");
            count++;
        }
        System.out.println("\n Array in reverse order: ");
        for (int i = numbers.length - 1; i >= 0; i--){
            System.out.print(numbers[i] + " ");
        }
    }
}
