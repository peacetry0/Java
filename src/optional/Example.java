package optional;

import java.util.Optional;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {

      /* Optional<String> input = Optional.ofNullable(getInput()) ;

        if (input.isPresent()) {

            System.out.println("Input :" + input.get());
        }else{
            System.out.println("Input is nor found : ");
        }


        Optional<String> favoriteColor = Optional.ofNullable(getColor()) ;

        System.out.println("Favorite color :" + favoriteColor.orElse("Blue"));*/

        Optional<String> username = Optional.ofNullable(getUsername()) ;

       String optionalString =  username.map(String::toUpperCase).orElse("Anonim") ;
       System.out.println(optionalString);

    }

    private static String getInput(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter input : ");

         String input = sc.nextLine();

         if (input.isBlank()){
             return null;
         }
        return input;
    }
    private static String getColor(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the favorite color : ");
        String color = scanner.nextLine();

        if (color.isBlank()){
            return null;
        }
        return color;
    }

    private static String getUsername(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your username : ");
        String username = scanner.nextLine();
        if (username.isBlank()){
            return null;
        }
        return username;
    }
}
