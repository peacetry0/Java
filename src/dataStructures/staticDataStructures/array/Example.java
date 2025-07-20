package dataStructures.staticDataStructures.array;

import java.util.Arrays;

public class Example {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        for (int i = 0; i < numbers.length; i++) {

            System.out.println("Elements Of Array  : " + numbers[i] + " index " + i  );

        }

        for (Integer i :  numbers){
            System.out.println( "Elements of Array : " + i  + "index "   );
        }
        System.out.println("Length Of Array : " + numbers.length);


        Object[] objects = {1,"String",null,3.14,true};

        System.out.println(Arrays.toString(objects));

    }
}
