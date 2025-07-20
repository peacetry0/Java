package searchAlgorithms;

public class BinarySearch {

    public static void main(String[] args) {

        int[] array = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 7;

        int result = binarySearch(array, target);

        if (result == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at index: " + result +  " target is :" + target);
        }
    }


    private static Integer binarySearch(int[] array,int target){

        int low = 0 ;
        int high = array.length - 1;

        while (low <= high){

            int mid = low + ((high - low)/2);

            if(array[mid] == target){

                return mid;

            }else if(array[mid] < target){

                low = mid + 1;

            }else if(array[mid] > target){

                high = mid - 1;
            }
        }
        return -1;


    }
}
