package beginner;

import java.util.Scanner;

public class NumberAnalyzer {


    public static void main(String[] args) {

        int number = getInput() ;

        System.out.println("The number is : " + oddOrEven(number));

        int sum = calculateSum(number);
        int product = calculateProduct(number);

        printResults(sum, product);

    }

    private static int getInput(){

        Scanner scanner =new Scanner(System.in);

        System.out.println("Please enter number : ");

        int number = scanner.nextInt();

        scanner.close();

        return number ;


    }

    private static String oddOrEven(int number ){

        if (number % 2 == 0){
            return "Even";
        }else {
            return "Odd";
        }
    }

    private static int calculateSum(int number){

        int sum = 0 ;
        for (int i = 1 ; i <= number ; i++){

            sum = sum + i ;

        }
        return sum ;
    }
    private static int calculateProduct(int number){
        int product = 1 ;
        for (int i = 1 ; i <= number ; i++){

            product *= i ;
        }
        return product ;
    }

    private static void printResults(int sum ,int product){
        System.out.println("The sum is : " + sum + " and the product is : " + product);
    }
}
