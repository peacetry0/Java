package beginner;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateFinder {


    public static void main(String[] args) {

        int[] numbers = getNumber() ;
        findAndPrintDuplicates(numbers);
    }

    private static int[] getNumber(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers will you enter  ");

        int count = scanner.nextInt();

        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            int number ;
            System.out.println("Enter Number  " + (i + 1) + ": ");
            number = scanner.nextInt();

            numbers[i] = number;
        }
        scanner.close();

        return numbers;

    }

    private static void findAndPrintDuplicates(int[] numbers){

        Set<Integer> seen = new HashSet<Integer>();

        Set<Integer> duplicates = new HashSet<>();

        for (int number : numbers) {

            if (!seen.add(number)) {
                duplicates.add(number);
            }
        }
        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found");
        }else{
            System.out.println("Duplicate Number : " + duplicates);
        }


    }


}
