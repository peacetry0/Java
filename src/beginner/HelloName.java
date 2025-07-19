package beginner;

import java.util.Scanner;

public class HelloName {

    public static void main(String[] args) {

        String name = getName() ;
        String hello = "Hello"  ;

        System.out.println(hello + " " +   name);

    }

    private static String getName(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");

        String name = scanner.nextLine();

        scanner.close();

        return name;
    }
}
