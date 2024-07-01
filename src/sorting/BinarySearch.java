package sorting;

public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(obj.binaryIterative(a, 7));
        System.out.println(obj.binaryRecursive(a, 7, 0, a.length - 1));

    }

    private int binaryRecursive(int[] a, int key, int low, int high) {
        if (low > high || key < a[low] || key > a[high])
            return -1;

        int mid = (low + high) / 2;

        if (a[mid] == key) {
            return mid;
        }
        if (key > a[mid]) {
            return binaryRecursive(a, key, mid + 1, high);
        }
        return binaryRecursive(a, key, low, mid - 1);


    }

    private int binaryIterative(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;

    }

}
