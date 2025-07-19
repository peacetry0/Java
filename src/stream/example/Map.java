package stream.example;

import java.util.List;

public class Map {

    public static void main(String[] args) {


        List<String> words = List.of("java","stream","code","filter","map") ;
        words.stream().map(w -> w.toUpperCase() ).forEach(System.out::println);

        List<String> names = List.of("Java","Stream","code","filter","C++","C#") ;
        names.stream().map( n -> n.length()).forEach(System.out::println);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.stream().map(n -> n*n).forEach(System.out::println);

        List<String> cities = List.of("Paris","London","Berlin","Rome") ;
        cities.stream().map(c -> c.substring(0,1)).forEach(System.out::println);

        List<Integer> digits = List.of(3,6,9,12,15);
        digits.stream().map(d -> "Number: " + d).forEach(System.out::println);

    }
}
