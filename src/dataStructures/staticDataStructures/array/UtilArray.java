package dataStructures.staticDataStructures.array;

import java.util.Arrays;

public class UtilArray {

    public static void main(String[] args) {

       /* int[] array = {11,22,34,34,55,68,67,82,94,100,0};
        int[] array2 = {11,22,34,34,55,68,67,82,94,100,0};
        int[] copy = Arrays.copyOf(array,array.length);
        Arrays.fill(copy,0);
        Arrays.sort(array);
        Arrays.sort(array2);
        int index = Arrays.binarySearch(array,67);
        boolean isEquals =  Arrays.equals(array,array2);
        System.out.println("Indeks of array : " + index);
        System.out.println(Arrays.toString(array));
        System.out.println("Copy Array : " + Arrays.toString(copy));
        System.out.println(Arrays.toString(array2));
        System.out.println("Are they equal ? " + isEquals);*/

       /* int[] array = {1,2,3,4,5} ;
        System.out.println("Original Array : " + Arrays.toString(array));

        int[] copyArray = Arrays.copyOf(array,array.length + 3) ;

        Arrays.fill(copyArray,5,8,99);

        System.out.println("Copy Array : " + Arrays.toString(copyArray));*/

        int[] array = {4,7,1,9,3} ;

        Arrays.sort(array);

        System.out.println("Sorted Array : " + Arrays.toString(array));

        //Sorted Array : [1, 3, 4, 7, 9]
        int[] reversedArray = new int[array.length];

        for (int i =0 ; i< array.length ;  i++) {

            reversedArray[i] = array[array.length - 1 - i];
        }
        System.out.println("Reversed Array : " + Arrays.toString(reversedArray));



    }
}
