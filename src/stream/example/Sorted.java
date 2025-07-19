package stream.example;

import java.util.Comparator;
import java.util.List;

public class Sorted {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(5, 3, 8, 1, 4, 9, 2);

        numbers.stream().sorted().forEach(System.out::println);

        List<String> words = List.of("banana", "apple", "grape", "cherry", "orange");

        words.stream().sorted().forEach(System.out::println);
        List<String> names = List.of("Ali", "Zeynep", "Kemal", "Ayşe", "Ahmet");

        names.stream().sorted((a,b)-> a.length()-b.length()).forEach(System.out::println);

        List<String> langs = List.of("Java", "Kotlin", "C", "JavaScript", "Go", "Python");

        langs.stream().sorted((a,b) -> b.length()-a.length() ).forEach(System.out::println);

        List<Integer> numbers2= List.of(12, 3, 8, 5, 22, 14, 6, 1, 18);
        numbers.stream().filter(n->n % 2 == 0 ).sorted(Comparator.reverseOrder()).forEach(System.out::println);


    }
}
