/**
 * Date: 2019-06-30
 */
public class Recursion {
    public static void main(String[] args) {
        System.out.println(getFactorial(9));
    }

    public static int getFactorial(int n) {
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        return n * getFactorial(n-1);
    }
}

/*Complexity:
best:
O(1)
worst:
O(n) = 1 + O(n-1), when n > 1
 */
