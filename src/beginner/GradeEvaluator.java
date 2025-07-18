package beginner;

import java.util.Scanner;

public class GradeEvaluator {


    public static void main(String[] args) {

        int[] grades = getInput() ;
       double average =  calculateAverage(grades) ;

      String letter = letterGrade(average);

        System.out.println("Your average grade is  : " + average);

        System.out.println("Your letter grade is "+ letter);
    }

    private static int[] getInput(){

        Scanner scanner = new Scanner(System.in);

       int[] grades = new int[5] ;

       for (int i = 0; i < grades.length; i++){
           System.out.println("Please enter grade #" + (i + 1) + ": ");
           grades[i] = scanner.nextInt();
       }

        scanner.close();
        return grades;
    }

    private static double calculateAverage(int[] grades){

        int sum = 0;

        for ( int grade : grades ){
            sum += grade;
        }
        return sum / 5.0 ;

    }

    private static String letterGrade(double grade) {

        if (grade >= 90 ){
            return "AA";
        } else if (grade >= 80) {
            return "BA";
        } else if (grade >= 70) {
            return "BB";
        }else if (grade >= 60) {
            return "BC";
        }else {
            return "FF";
        }
    }
}
