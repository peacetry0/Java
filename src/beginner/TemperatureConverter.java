package beginner;

import java.util.Scanner;

public class TemperatureConverter {


    public static void main(String[] args) {

        double celsius  = getInput();


         convertAndDisplay(celsius);
    }

    private static double getInput(){

        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the temperature in Celsius :  ");

        double value = scanner.nextDouble();

        scanner.close();

        return value ;
    }

    private static void convertAndDisplay(double celsius){

        double fahrenheit = celsius * 1.8 + 32;
        double kelvin = celsius + 273.15;

        System.out.println("Fahrenheit : " + fahrenheit);
        System.out.println("Kelvin : " + kelvin);


    }
}
