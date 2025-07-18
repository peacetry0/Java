package beginner;

import java.util.Scanner;

public class SumUpToN {

    public static void main(String[] args) {

        int number = getInput() ;
        int sum = sumUpToN(number) ;

        System.out.println("Sum up to n  " + sum) ;
        System.out.println("Your number is : "   + number ) ;


    }

    private static int getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number : ");

        int number = sc.nextInt();
        return number;
    }

    private static int sumUpToN(int number) {

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
}
