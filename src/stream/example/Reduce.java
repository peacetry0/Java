package stream.example;

import java.util.List;

public class Reduce {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

       Integer sum =  numbers.stream().reduce(0, (a,b) -> a+b);

        System.out.println(sum);

        List<Integer> numbers2 = List.of(1, 2, 3, 4);

        Integer multip = numbers2.stream().reduce(1, (a,b) -> a*b);

        System.out.println(multip);

        List<String> words = List.of("Java", "Stream", "API");
        String join = words.stream().reduce(" ", (a,b) -> a+b);
        System.out.println(join);
    }
}
