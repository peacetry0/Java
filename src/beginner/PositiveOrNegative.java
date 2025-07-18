package beginner;

import java.util.Scanner;

public class PositiveOrNegative {

    public static void main(String[] args) {

        int number = getInput() ;

        checkNumber(number);
    }

    private static int getInput(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number : " );
        int number = scanner.nextInt();

        return number;
    }
    private static void checkNumber(int number){
        if(number < 0){
            System.out.println("Your number is negative");
        }else if(number > 0){
            System.out.println("Your number is positive");
        }else{
            System.out.println("Your number is zero");
        }
    }
}
