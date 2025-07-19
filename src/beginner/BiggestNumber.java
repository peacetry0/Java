package beginner;

import java.util.Scanner;

public class BiggestNumber {

    public static void main(String[] args) {

        int[] numbers = getNumbers() ;

        int maxNumber = getMax(numbers[0], numbers[1],numbers[2] );
        checkEquality(numbers[0],numbers[1],numbers[2]);

        System.out.println("Maximum number : " + maxNumber ) ;
    }
    private static int[] getNumbers(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter your second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Please enter your third number: ");
        int thirdNumber = scanner.nextInt();

        scanner.close();

        System.out.println("First number: " + firstNumber +  " Second number: " + secondNumber +  " Third number: " + thirdNumber);

        return new int[]{firstNumber,secondNumber,thirdNumber};

    }
    private static int getMax(int firstNumber, int secondNumber,int thirdNumber){

        if (firstNumber > secondNumber && firstNumber > thirdNumber){
            return firstNumber;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            return secondNumber;
        }else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            return thirdNumber;
        }else{
            return  0 ;
        }

    }
    private static void checkEquality(int first, int second, int third) {

        if (first == second && second == third) {

            System.out.println("All three numbers are equal.");

        } else if (first == second && first != third) {

            System.out.println("First and second numbers are equal.");

        } else if (first == third && first != second) {

            System.out.println("First and third numbers are equal.");

        } else if (second == third && second != first) {

            System.out.println("Second and third numbers are equal.");
        }
    }
}
