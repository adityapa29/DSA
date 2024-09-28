package BinarySearch;

public class SearchAlmostSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 1, 3, 4, 6, 5, 8, 7, 10, 9 };
        for(int i=0; i<arr.length; i++) {
            System.out.println("Key "+arr[i]+" ==> "+solve(arr,arr[i]));
        }
    }

    public static int solve(int[] arr,int key) {
        int start = 0, n = arr.length, end = n - 1;
        while(start <= end) {
            int mid = start + ((end - start) / 2);
            int left = Math.max(0,mid-1);
            int right = Math.min(n-1,mid+1);
            if(arr[mid] == key) return mid;
            else if(arr[left] == key) return left; // else if (mid - 1 >= start && arr[mid - 1] == k)
            else if(arr[right] == key) return right; // else if (mid + 1 <= end && arr[mid + 1] == k)
            else if(arr[mid] < key) 
                start = mid + 2;
            else if(arr[mid] > key)
                end = mid - 2;
        }
        return -1;
    }
}
