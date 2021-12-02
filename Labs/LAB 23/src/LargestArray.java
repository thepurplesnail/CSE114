public class LargestArray {
    public static void main (String[] args){
        System.out.print(findLargest(new int[] {4,3,19,3,4,3}, 4));
    }
    public static int findLargest(int[] list, int currentIndex) {
        if (currentIndex == 0)
            return list[0];
        else
            return max(list[currentIndex], findLargest(list, currentIndex - 1));
    }

    public static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }
}