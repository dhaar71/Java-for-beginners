import java.util.Arrays;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] sortedArray = {2, 4, 6, 8, 10, 12, 14, 16};

        int target = 10;
        int target2=100;
        int index = binarySearch(sortedArray, target);
        int index2 = binarySearch(sortedArray, target2);

        if (index != -1) {
            System.out.println("Found " + target + " at index " + index);
        } else {
            System.out.println(target + " not found in the array.");
        }
        if (index2 != -1) {
            System.out.println("Found " + target2 + " at index " + index2);
        } else {
            System.out.println(target2 + " not found in the array.");
        }
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; // Element found
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Element not found
    }
}
