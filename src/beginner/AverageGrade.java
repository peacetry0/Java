package beginner;

import java.util.Scanner;

public class AverageGrade {

    public static void main(String[] args) {

        double[] grades = getInput() ;

        double average = calculateAverage(grades) ;

        System.out.println("Your average grade is "+ average);
    }

    private static double[] getInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first grade : ");
        double first = scanner.nextInt();
        System.out.println("Please enter second grade : ");
        double second = scanner.nextInt();
        System.out.println("Please enter third grade : ");
        double third = scanner.nextInt();

        scanner.close();

        return new double[]{first,second,third};
    }

    private static double calculateAverage(double[] grades){

        return  ((grades[0]+grades[1]+grades[2]) / 3) ;

    }
}
