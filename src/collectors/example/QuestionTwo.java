package collectors.example;

import java.util.*;
import java.util.stream.Collectors;

public class QuestionTwo {


    public static void main(String[] args) {

        List<String> colors = List.of("Red", "Green", "Blue", "Red", "Yellow", "Blue");
        Set<String> uniqueColors =  colors.stream().collect(Collectors.toSet());
        System.out.println(uniqueColors);

        List<String> cities = List.of("Istanbul", "Ankara", "Izmir", "Van");
        Map<String, Integer> lengthOfCities = cities.stream()
                .collect(Collectors.toMap(city -> city, city -> city.length()));
        System.out.println(lengthOfCities);

        List<String> langs = List.of("Java", "Python", "C++", "Java", "Go", "Python");
        Map<String, Long> languageCount = langs.stream()
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));

        System.out.println(languageCount);


        List<String> words = List.of("Java", "Stream", "API", "is", "powerful");
        String joinedWords =  words.stream().collect(Collectors.joining(" ")) ;
        System.out.println(joinedWords);

        List<String> names = List.of("Ali", "Ayşe", "Mehmet", "Zeynep", "Ahmet", "Veli");
        Map<Integer,List<String>> lengthOfNames = names.stream().collect(Collectors.groupingBy(String::length)) ;
        System.out.println(lengthOfNames);

        List<Integer> numbers = List.of(10, 15, 20, 25, 30);
        Map<Boolean, List<Integer>> partitionedNumbers = numbers.stream()
                .collect(Collectors.partitioningBy(number -> number % 2 == 0));

        System.out.println("Even and odd numbers: " + partitionedNumbers) ;

        List<String> fruits = List.of("apple", "banana", "cherry", "date");
        List<String> mapFruits =  fruits.stream().collect(Collectors.mapping(String::toUpperCase, Collectors.toList()));
        System.out.println(mapFruits);

        List<Integer> numbers2 = List.of(5, 10, 15, 20, 25);
        IntSummaryStatistics summary =  numbers2.stream().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(summary);

        List<String> names2 = List.of("Ali", "Ayşe", "Mehmet", "Zeynep");
        String longestNameUppercase = names2.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparingInt(String::length)),
                        optionalName -> optionalName.orElse("").toUpperCase()
                ));

        System.out.println("Longest name uppercase: " + longestNameUppercase);

    }
}
