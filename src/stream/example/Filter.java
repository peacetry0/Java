package stream.example;

import java.util.List;

public class Filter {


    public static void main(String[] args) {

        List<String> words = List.of("Java","C++","unity","C#","Ruby","Python");

        words.stream().filter(w -> w.startsWith("C")).forEach(System.out::println);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12);

       List<Integer> evenNumbers =  numbers.stream().filter(n -> n % 2 == 0).toList() ;

        System.out.println(evenNumbers);

        List<String> animals = List.of("Dog","Elephant","Cat","Horse","Rabbit");
        animals.stream().filter(animal -> animal.length()> 5 ).forEach(System.out::println);

        List<Integer> values = List.of(10, 22, 33, 45, 56, 86, 77, 68, 99,110,121,142);
        values.stream().filter(value -> value > 50 ).forEach(System.out::println);

        List<String> words2 = List.of("Hello", "world","Java","Stream","Code","Fİlter") ;

        words2.stream().filter(w -> w.equals(w.toLowerCase())).forEach(System.out::println);


    }
}
