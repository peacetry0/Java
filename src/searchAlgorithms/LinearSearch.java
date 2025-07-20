package searchAlgorithms;

public class LinearSearch {

    public static void main(String[] args) {

        int[] array = {1,2,3,5,7,98,9,2,125,45,39,85,43,32};
        int target = 125 ;

        int result = linearSearch(array, target);

        if (result == -1) {

            System.out.println("Target not found");
        }else{
            System.out.println("Target found at index :" + result + "target is :" + target);
        }
    }


    private static Integer linearSearch(int[] array,int target){

        for (int i = 0; i<array.length; i++){
            if (array[i] == target){
                return i;
            }
        }
        return -1 ;
    }
}
