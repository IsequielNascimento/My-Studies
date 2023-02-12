package loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Ex3_MajorAndMedium {
    public static void main( String[] args){

        Scanner scan = new Scanner(System.in);

        int number;
        int major = 0;
        int medium = 0;

        int count = 0;

        do{
            System.out.println("Number: ");
            number = scan.nextInt();

            if (number > major){
                major = number;
            }

            medium += number;

            count++;

        } while (count < 5);

            System.out.print("Major: " + major + " ");
            System.out.print("Medium: " + medium/5);
        }

    }

