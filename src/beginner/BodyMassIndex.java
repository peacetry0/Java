package beginner;

import java.util.Scanner;

public class BodyMassIndex {


    public static void main(String[] args) {

        double[] measurements = getInput() ;
        double height = measurements[0] ;
        double weight = measurements[1] ;

        double bmi  = calculateBMI(height,weight);

        String type = weightType(bmi) ;

        System.out.println("Your BMI is : " + bmi);
        System.out.println("Weight Status : " + type);
    }

    private static double[] getInput(){

        Scanner scanner =new Scanner(System.in);

        System.out.println("Please enter the height(in centimeters ) : ");
        double height = scanner.nextDouble();

        System.out.println("Please enter the weight(in kilograms) : ");
        double weight = scanner.nextDouble();

       scanner.close();

       return new double[]{height,weight} ;

    }

    private static double calculateBMI(double height,double weight){


        return  weight / (height * height);


    }
    private static String  weightType(double bmi){

        if (bmi<18.5){
            return "Underweight";
        }else if (bmi>=18.5 && bmi<24.9){
            return "Normal weight";
        }else if (bmi>=24.9 && bmi<29.9){
            return "Overweight";
        }else{
            return "Obese";
        }
    }

}
