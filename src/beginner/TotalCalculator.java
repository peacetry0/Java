package beginner;

public class TotalCalculator {

    private static final int START = 1 ;
    private static final int End = 100 ;

    public static void main(String[] args) {

        int total = calculateSumInRange(START,End);

        System.out.println("Total From " + START + "to " + End + ": " + total);



    }
    private static int calculateSumInRange(int start, int end) {

        int total = 0 ;
        for (int i = start; i <= end; i++) {
            total += i;
        }
        return total;
    }

}
