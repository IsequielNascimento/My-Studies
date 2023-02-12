package arrays;

import java.util.Scanner;

public class Ex2_Consonants {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] words = new String[5];

        int consonantsCount = 0;
    

        int count = 0;

        do {
            System.out.println("Word letter: ");
            String word = scan.next();

            if (!(word.equalsIgnoreCase("a") | word.equalsIgnoreCase("e") | word.equalsIgnoreCase("i")
                    | word.equalsIgnoreCase("o") | word.equalsIgnoreCase("u"))) {
                words[count] = word;
                consonantsCount++;
            }
            count++;
        } while (count < words.length);

        System.out.println("Consonants: ");
        for (String word : words) {
            if (word != null){
                System.out.print(word + " ");
            }
        }
        System.out.println("\nConsonants count: " + consonantsCount);
        System.out.println(words.length);
    }
}
