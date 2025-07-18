package beginner;

import java.util.Scanner;

public class WordLength {

    public static void main(String[] args) {

        String word = getWord() ;

        System.out.println("Your word is : " + word + " Length of word  : "  + word.length()) ;

    }

    private static String getWord(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word");
        String word = scanner.nextLine() ;
        return word ;

    }
}
