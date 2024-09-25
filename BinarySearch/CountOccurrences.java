/*
 Given a sorted array of n elements, possibly with duplicates, find the number of occurrences of the target element.
 */
package BinarySearch;

public class CountOccurrences {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 5, 5, 5, 7, 8, 8};
        int target = 5;
        
        int firstIdx = binarySearch(arr, target, true);
        int lastIdx = binarySearch(arr, target, false);

        if(firstIdx == -1 || lastIdx == -1) 
            System.out.println("Count : "+0);
        else 
            System.out.println("Count : "+(lastIdx-firstIdx+1));
    }

    private static int binarySearch(int[] arr, int target, boolean firstOcc) {
        int start = 0, end = arr.length - 1, index = -1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] == target) {
                index = mid;
                if (firstOcc)
                    end = mid - 1;
                else
                    start = mid + 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return index;
    }
}