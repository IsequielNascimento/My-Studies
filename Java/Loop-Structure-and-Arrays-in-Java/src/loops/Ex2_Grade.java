package loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

public class Ex2_Grade {
    public static void main( String[] args){
        Scanner scan = new Scanner(System.in);

        int grade; 

        System.out.println("Grade: ");
        grade = scan.nextInt();

        while (grade < 0 | grade > 10){
            System.out.println("Invalid grade. Try again: ");
            
            grade = scan.nextInt();
        }


    }
}
