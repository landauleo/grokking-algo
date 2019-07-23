/**
 * User: Anna Nosova
 * Date: 2019-06-30
 */
public class BinarySearch {

    private static int startBinarySearch(int[] sortedArray, int desired) {
        int low = 0;
        int high = sortedArray.length - 1;
        int index = Integer.MAX_VALUE;

        while (low < high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] < desired) {
                low = mid + 1;
            } else if (sortedArray[mid] > desired) {
                high = mid - 1;
            } else if (sortedArray[mid] == desired) {
                index = mid;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 9, 14};

        System.out.println(startBinarySearch(arr, 9));
    }
}
