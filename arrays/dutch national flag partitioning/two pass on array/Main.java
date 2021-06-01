import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] ar = {0, 0, 0, 1, 1, 0, 2, 2, 0, 1, 0};
        dutchFlag(ar, 2);
        System.out.println(Arrays.toString(ar));
    }

    /**
     * Time complexity: O(n) but with two iteration
     * Space complexity: O(1), constant space required
     */
    public static void dutchFlag(int[] ar, int pivotIndex) {
        int pivot = ar[pivotIndex];
        int nextSmaller = 0;
        int nextGreater = ar.length - 1;

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < pivot) {
                swap(ar, i, nextSmaller);
                nextSmaller++;
            }
        }

        for (int i = ar.length - 1; i >= 0; i--) {
            if (ar[i] > pivot) {
                swap(ar, i, nextGreater);
                nextGreater--;
            }
        }
    }

    public static void swap(int[] ar, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
}
