package stream.example;

import java.util.List;

public class MapFilter {

    public static void main(String[] args) {

        List<String> words = List.of("java","stream","code","filter","map") ;

        words.stream().filter(w -> w.length() > 5 ).map(w -> w.toUpperCase()).forEach(System.out::println);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5,6,7,8,9,10);
        numbers.stream().filter(n -> n % 2 != 0).map(n -> n * n).forEach(System.out::println);

        List<String> names = List.of("java","stream","code","filter","map","Ahmet","Ayse") ;

        names.stream().filter(n -> n.startsWith("A")).map(n -> n.toLowerCase()).forEach(System.out::println);

        List<Integer> values = List.of(100, 221, 342, 412, 2145,64,72,85,97,100);
        values.stream().filter(v -> v > 100).map(v -> "Hight : " +v).forEach(System.out::println);

        List<String> animals = List.of("Dog","cat","eagle","cow","fish");

        animals.stream().filter(a -> a.length()> 3 ).map(a -> a.substring(0,1).toUpperCase() + a.substring(1)).forEach(System.out::println);





    }
}
