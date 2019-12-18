import java.util.Arrays;

/**
 * Date: 2019-12-18
 */

public class CocktailSort {

    private static int[] cocktailSort(int array[]) {
        boolean swapped = true;
        int start = 0;
        int end = array.length;

        while (swapped) {

            swapped = false;

            for (int i = start; i < end - 1; ++i) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped)
                break;

            swapped = false;

            end = end - 1;

            for (int i = end - 1; i >= start; i--) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }

            start = start + 1;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8, 0, 2};
        System.out.println(Arrays.toString(cocktailSort(arr)));
    }

}