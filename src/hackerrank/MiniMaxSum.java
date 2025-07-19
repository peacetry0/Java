package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class MiniMaxSum {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);


        calculateMinMaxSum(list);
    }

    public static void calculateMinMaxSum(List<Integer> list){

        long totalSum = 0 ;

        for (Integer number : list){
            totalSum += number;
        }

        long min = Long.MAX_VALUE ;
        long max = Integer.MIN_VALUE;

        for (Integer number : list){

            long currentSum = totalSum - number;

            if (currentSum < min){
                min = currentSum;
            }
            if (currentSum > max){
                max = currentSum;
            }

        }

        System.out.println(min + " " + max);

    }
}
