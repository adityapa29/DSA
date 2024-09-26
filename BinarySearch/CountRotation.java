package BinarySearch;

public class CountRotation {
    public static void main(String[] args) {
        int arr[] = new int[] { 15, 18, 2, 3, 6, 12 };
        System.out.println("output : " + solve(arr));
        System.out.println("binarySearch output : " + binarySearch(arr));
        int arr2[] = new int[] { 7, 9, 11, 12, 5 };
        System.out.println("output : " + solve(arr2));
        System.out.println("binarySearch output : " + binarySearch(arr2));
        int arr3[] = new int[] { 7, 9, 11, 12, 15 };
        System.out.println("output : " + solve(arr3));
        System.out.println("binarySearch output : " + binarySearch(arr3));
    }

    public static int solve(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i + 1;
            }
        }
        return 0;
    }

    public static int binarySearch(int[] arr) {
        int start = 0, n = arr.length, end = n - 1;
        if (arr[start] < arr[end])
            return 0;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            int prev = (mid - 1 + n) % n;
            int next = (mid + 1) % n;
            if (arr[prev] > arr[mid] && arr[next] > arr[mid])
                return mid;
            else if (arr[start] > arr[mid])
                end = mid - 1;
            else if (arr[end] < arr[mid])
                start = mid + 1;
        }
        return 0;
    }
}
