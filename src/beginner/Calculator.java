package beginner;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {

        int[] numbers = getInput() ;

        performOperation(numbers[0], numbers[1]);

    }
    private static int[] getInput(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter two number  : ");

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        return new int[]{first, second};
    }

    private static void performOperation(int a ,int b ){

        int sum = a + b;
        int diff = a - b ;
        int product = a * b;
        double quotient = b != 0 ? a / b :Double.NaN  ;

        System.out.println("Sum : " + sum);
        System.out.println("Difference : " + diff);
        System.out.println("Product : " + product);
        System.out.println("Quotient : " + quotient);
    }
}
