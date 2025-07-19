package stream.example;

import java.util.List;

public class MaxMin {

    public static void main(String[] args) {


        List<Integer> numbers = List.of(13, 4, 26, 9, 18, 7);

        numbers.stream().max(Integer::compareTo).ifPresent(System.out::println);

        List<Integer> numbers2 = List.of(17, 22, 8, 15, 30, 5);

        numbers2.stream().filter(n -> n % 2 == 0 ).min(Integer::compareTo).ifPresent(System.out::println);

        List<String> cities = List.of("Istanbul", "Ankara", "Izmir", "Van", "Mersin");

        cities.stream().min((a,b) -> a.length() - b.length()).ifPresent(System.out::println);

        List<String> words = List.of("code", "programming", "stream", "java", "example");

        words.stream().filter(w -> w.length()>5).max((a,b) -> a.length() - b.length()).ifPresent(System.out::println);
    }
}
