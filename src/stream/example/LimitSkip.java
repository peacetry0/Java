package stream.example;

import java.util.List;

public class LimitSkip {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(10, 20, 30, 40, 50, 60, 70);

        numbers.stream().limit(4).forEach(System.out::println);

        List<String> fruits = List.of("Apple", "Banana", "Cherry", "Date", "Fig");

        fruits.stream().limit(3).forEach(System.out::println);


        List<Integer> values = List.of(5, 10, 15, 20, 25);
        values.stream().skip(1).forEach(System.out::println);

        List<String> cities = List.of("Paris", "London", "Berlin", "Rome", "Madrid");

        cities.stream().skip(1).limit(3).forEach(System.out::println);


        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);

        nums.stream().skip(2).limit(2).forEach(System.out::println);
    }
}
