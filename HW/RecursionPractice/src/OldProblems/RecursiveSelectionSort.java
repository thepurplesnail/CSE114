package OldProblems;

public class RecursiveSelectionSort {
    public static void main(String[] args){
        int[] arr = new int[] {2,1,4,1,2,3};
        recursiveSelectionSort(arr);
        for (int a : arr)
            System.out.print(a + " ");
    }
    public static void recursiveSelectionSort(int[] arr){
        recursiveSelectionSort(arr, 0, arr.length - 1);
    }
    public static void recursiveSelectionSort(int[] arr, int low, int high){
        if (low < high){
            int min = arr[low];
            int minIndex = low;
            for (int i = low + 1; i <= high; i++){
                if (arr[i] < min){
                    min = arr[i];
                    minIndex = i;
                }
            }
            arr[minIndex] = arr[low];
            arr[low] = min;
            recursiveSelectionSort(arr, low + 1, high);
        }
    }
}
