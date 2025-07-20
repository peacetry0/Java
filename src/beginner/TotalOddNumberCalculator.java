package beginner;

import java.util.Scanner;

public class TotalOddNumberCalculator {

    private static final int START = 1 ;

    public static void main(String[] args) {

        int end = getUserInput() ;
        int totalOddSum = calculateOddSumInRange(START,end) ;

        System.out.println("Total of odd numbers from : " + START + " to " + end + " = " + totalOddSum);

    }
    private static Integer getUserInput(){
        Scanner scanner = new Scanner(System.in);

        int input ;

        while (true) {
            System.out.print("Please enter a positive integer as the range end: ");


            if (scanner.hasNextInt()) {

                input = scanner.nextInt();

                if (input >= START) {

                    return input;
                }
            } else {
                scanner.next();

            }
            System.out.println("Invalid input. Try again.");
        }

    }
    private static int calculateOddSumInRange(int start, int end){
        int sum = 0 ;

        for (int i = start; i <= end; i++) {
            if (i % 2 != 0){
                sum += i;
            }
        }
        return sum;
    }

}
