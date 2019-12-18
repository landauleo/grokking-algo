import java.util.Arrays;

/**
 * Date: 2019-07-23
 */
public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 4, 2, 7, 9};
        System.out.print(Arrays.toString(selectionSort(arr)));
    }

    public static int[] selectionSort (int[] numbers){
        int least, temp;

        for (int min = 0; min < numbers.length-1; min++){
            least = min;
            for (int j = min+1; j < numbers.length; j++){
                if (numbers[j] < numbers[least])
                    least = j;
            }

            // Swap the values
            temp = numbers[least];
            numbers[least] = numbers[min];
            numbers[min] = temp;
        }
        return numbers;
    }
}

/*Complexity:
best:
O(1)
worst:
O(n^2)
 */
