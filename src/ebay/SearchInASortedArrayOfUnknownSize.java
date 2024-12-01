package ebay;


public class SearchInASortedArrayOfUnknownSize {

    public static int search(int[] arr, int target) {

        int start = 0;
        int end = 1;
        int mid=(start=end)/2;

        while (arr[end]<target) {
           start=end;
           end=end*2;
        }

        while (start<=end){
            mid=(start+end)/2;
            if (arr[mid]==target) return mid;
            else if (arr[mid]<target) end=mid-1;
            else if (arr[mid]>target) start=mid+1;
        }
        return mid;
    }

    public static void main(String[] args){
        int[] arr = {0, 3, 5, 9, 12};

        int index = search(arr, 9);
        System.out.println(index);
    }
}
