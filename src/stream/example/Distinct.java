package stream.example;

import java.util.List;

public class Distinct {

    public static void main(String[] args) {

        List<String> langs = List.of("java","c++","c++","Rust","Rust") ;

        langs.stream().distinct().forEach(System.out::println);

        List<Integer> nums = List.of(1, 2, 2, 3, 4, 4, 5, 1);

        nums.stream().distinct().map(n-> n * n ).forEach(System.out::println);


        List<String> words = List.of("code", "java", "code", "game", "play", "java", "code");

        words.stream().filter(w -> w.length() == 4).distinct().forEach(System.out::println);

        List<String> names = List.of("Ali", "Ayse", "Ahmet", "Veli", "Vedat", "Ali", "Ayse");

        names.stream().map(n -> n.substring(0,1)).distinct().forEach(System.out::println);
    //    names.stream().fi

        List<String> langs2 = List.of("Java", "C++", "Java", "Rust", "Go", "Rust");

        langs2.stream().distinct().map(l->"Language : " + l).forEach(System.out::println);

    }
}
