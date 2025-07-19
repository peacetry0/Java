package stream.example;

import java.util.List;

public class CountFindFirstFindAny {


    public static void main(String[] args) {
        List<String> names = List.of("Ali", "Ayşe", "Mehmet", "Zeynep");

        names.stream().findFirst().ifPresent(System.out::println);

        List<Integer> numbers = List.of(5, 7, 11, 14, 19, 22);

        numbers.stream().filter(n -> n % 2 == 0).findFirst().ifPresent(System.out::println);

        List<String> words = List.of("code", "stream", "filter", "java", "reduce");

        long count = words.stream().filter(n -> n.length() > 5).count();
        System.out.println(count);

        List<String> people = List.of("Ahmet", "Elif", "Kerem", "Derya");

        people.stream().findAny().ifPresent(System.out::println);
    }
}
