public class BinarySearchRecursive {
    public static void main(String[] args){
        System.out.print(recursiveBinarySearch(new int[]{4,3,19,3,4,3}, 9));
    }

    public static int recursiveBinarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        return recursiveBinarySearch(list, key, low, high);
    }

    public static int recursiveBinarySearch(int[] list, int key,
                                            int low, int high) {
        if (low > high) // The list has been exhausted without a match
            return - 1;
        int mid = (low + high) / 2;
        if (key < list[mid])
            return recursiveBinarySearch(list, key, low, mid - 1);
        else if (key == list[mid])
            return mid;
        else
            return recursiveBinarySearch(list, key, mid + 1, high);
    }
}
