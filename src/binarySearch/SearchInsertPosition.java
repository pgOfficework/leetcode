package binarySearch;

public class SearchInsertPosition {
    private int binaryRecursive(int[] a, int key, int low, int high) {
        if (key < a[low])
            return low;
        if (key > a[low])
            return high + 1;

        int mid = (low + high) / 2;

        if (a[mid] == key) {
            return mid;
        }
        if (key > a[mid]) {
            return binaryRecursive(a, key, mid + 1, high);
        } else if ((key < a[mid])) {
            return binaryRecursive(a, key, low, mid - 1);
        }
        return mid;

    }

    private int binaryIterative(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                low = mid + 1;
            } else if (a[mid] > key) {
                high = mid - 1;
            }
        }

        return mid;

    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 6};
        SearchInsertPosition obj = new SearchInsertPosition();

        System.out.println(obj.binaryRecursive(a, 5, 0, a.length - 1));
        System.out.println(obj.binaryIterative(a, 5));
    }
}