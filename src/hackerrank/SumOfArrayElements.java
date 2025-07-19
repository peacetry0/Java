package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class SumOfArrayElements {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(10)  ;

        System.out.println(simpleArraySum(list));

    }


    public static int simpleArraySum(List<Integer> list){

        int sum = 0;
        for(int i = 0 ; i<list.size() ; i ++){

            sum += list.get(i) ;
        }
        return sum ;
    }
}
