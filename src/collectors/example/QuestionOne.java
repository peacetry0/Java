package collectors.example;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class QuestionOne {

    public static void main(String[] args) {

        List<String> names = List.of("Ali", "Ayşe", "Mehmet", "Zeynep", "Ali");
        Set<String> uniqueNames = names.stream().collect(Collectors.toSet());
        System.out.println(uniqueNames);

        List<Integer> numbers = List.of(3, 5, 7, 9);
        String joinedNumbers = numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println( joinedNumbers);

        List<String> languages = List.of("Java", "Python", "C++", "Java", "Go", "Python");
        Map<String, Long> languageCount = languages.stream()
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
        System.out.println(languageCount);

        List<String> cities = List.of("Ankara", "Istanbul", "Izmir", "Van");
        Map<Integer, List<String>> citiesByLength = cities.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(citiesByLength);

        List<Integer> values = List.of(10, 15, 20, 25, 30);
        Map<Boolean, List<Integer>> evenOddPartition = values.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(evenOddPartition);
    }
}
