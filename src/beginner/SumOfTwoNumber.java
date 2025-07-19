package beginner;

import java.util.Scanner;

public class SumOfTwoNumber {

    public static void main(String[] args) {

        int[] numbers = getNumbers() ;

        int sum = getSum(numbers[0],numbers[1] );
        double average = getAverage(numbers[0],numbers[1]);


        System.out.println("Sum : " +sum);

        System.out.println("Average : " +average);
    }

    private static int[] getNumbers(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter your second number: ");
        int secondNumber = scanner.nextInt();

        scanner.close();

        System.out.println("First number: " + firstNumber +  " Second number: " + secondNumber);

        return new int[]{firstNumber,secondNumber};

    }
    private static int getSum(int firstNumber, int secondNumber){

        return firstNumber + secondNumber;
    }
    private static double getAverage(int firstNumber, int secondNumber){
        return (firstNumber + secondNumber) /2.0 ;
    }
}
