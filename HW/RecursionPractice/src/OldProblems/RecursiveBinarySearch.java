package OldProblems;

public class RecursiveBinarySearch {
    public static void main(String[] args){}
    public static int recursiveBinarySearch(int[] arr, int key){
        return recursiveBinarySearch(arr, key, 0, arr.length - 1);
    }
    public static int recursiveBinarySearch(int[] arr, int key, int low, int high){
        if (low > high)
            return -1;
        int mid = (low + high)/2;
        if (key == arr[mid])
            return mid;
        else if (key < arr[mid])
            return recursiveBinarySearch(arr, key, low, mid - 1);
        else
            return recursiveBinarySearch(arr, key, mid + 1, high);
    }
}
