import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] ar = {0, 0, 0, 1, 1, 0, 2, 2, 0, 1, 0};
        dutchFlag(ar, 3);
        System.out.println(Arrays.toString(ar));
    }

    /**
     * Time complexity: O(n) with only one pass
     * Space complexity: O(1) constant space required
     *
     * Good pseudo code with visualization: https://users.monash.edu/~lloyd/tildeAlgDS/Sort/Flag/ 
     */
    public static void dutchFlag(int[] ar, int pivotIndex) {
        int pivot = ar[pivotIndex];

        int smallEnd = 0;
        int equalEnd = 0;
        int biggerEnd = ar.length - 1;

        while (equalEnd <= biggerEnd) {
            if (ar[equalEnd] < pivot) {
                swap(ar, equalEnd, smallEnd);
                smallEnd++;
                equalEnd++;
            } else if (ar[equalEnd] == pivot) {
                equalEnd++;
            } else {
                swap(ar, equalEnd, biggerEnd);
                biggerEnd--;
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
