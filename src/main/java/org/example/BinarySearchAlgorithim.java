package org.example;

public class BinarySearchAlgorithim {

    /**
     * Performs recursive binary search on a sorted array.
     *
     * @param arr    The sorted array to search
     * @param left   Left index of the current search range
     * @param right  Right index of the current search range
     * @param target The value to find
     * @return Index of target if found, otherwise -1
     */
    public static int binarySearch(int[] arr, int left, int right, int target) {
        if (left > right) {
            // Base case: target not found
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            // Found target at mid
            return mid;
        } else if (arr[mid] > target) {
            // Search left half
            return binarySearch(arr, left, mid - 1, target);
        } else {
            // Search right half
            return binarySearch(arr, mid + 1, right, target);
        }
    }

    public static void main(String[] args) {
        // Sample sorted array
        int[] numbers = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        int target = 7;
        int result = binarySearch(numbers, 0, numbers.length - 1, target);

        if (result == -1) {
            System.out.println("Target " + target + " not found in the array.");
        } else {
            System.out.println("Target " + target + " found at index: " + result);
        }
    }
}