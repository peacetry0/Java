package beginner;

import java.util.Scanner;

public class ReverseWordsInASentence {

    public static void main(String[] args) {

        String sentence = getSentence()  ;
        String reversedSentence = reverseSentence(sentence) ;

        System.out.println("Sentence : " +sentence );
        System.out.println("Reversed sentence : " +reversedSentence ) ;

    }

    private static String getSentence(){

        Scanner scanner  = new Scanner(System.in);

        System.out.println("Please enter your sentence: " );

        String sentence = scanner.nextLine();

        return sentence;
    }

    private static String reverseSentence(String sentence){

        String[] words = sentence.trim().split(" ");

        StringBuilder reversed = new StringBuilder();

        for (int i = words.length -1 ; i>= 0   ; i--){

            reversed.append(words[i]);

            if ( i != 0 ){
                reversed.append(" ");
            }

        }
        return reversed.toString();
    }
}
