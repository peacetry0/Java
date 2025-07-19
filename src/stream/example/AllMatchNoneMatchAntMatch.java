package stream.example;

import java.util.List;

public class AllMatchNoneMatchAntMatch {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 3, 5, 7, 8);

        boolean hasEvenNumber = numbers.stream().anyMatch(n -> n % 2 == 0);

        System.out.println("Is there at least one even number? " + hasEvenNumber);

        List<String> names = List.of("Anna", "Liam", "Noah", "Emma");

        boolean allLongerThanFour = names.stream().allMatch(n -> n.length() > 4);

        System.out.println("Are all names longer than 4 characters? " + allLongerThanFour);

        List<Integer> values = List.of(0, 1, 2, 3, 4, 5);

        boolean hasNoNegative = values.stream().noneMatch(n -> n < 0);

        System.out.println("Are there no negative numbers? " + hasNoNegative);

        List<String> phrases = List.of("I love Java", "Python is cool", "JavaScript");

        boolean containsJava = phrases.stream().anyMatch(p -> p.contains("Java"));

        System.out.println("Does at least one phrase contain 'Java'? " + containsJava);

        List<Integer> digits = List.of(3, 7, 9, 10, -1);

        boolean allPositive = digits.stream().allMatch(n -> n > 0);

        System.out.println("Are all numbers positive? " + allPositive);


    }
}
