public class ArrayUtils {
    public static void main(String[] args){
        int[] arr = randomArray(100, 21);
        print(arr);
        double average = (double) arraySum(arr)/arr.length;  // average is sum returned from arraySum / the array's length
        System.out.println("Average of all entries: " + average);
        int numIndex = findNum(arr, 12);
        if (numIndex != -1)
            System.out.println("Index of 12 in array is: " + numIndex);
        int numMultiples = countMultiplesOf(arr, 7);
        System.out.println("Number of multiples of 7 in array are: "+ numMultiples);
    }
    public static int[] randomArray(int size, int upperbound){
        int[] randArr = new int[size];
        for (int i = 0; i < size; i++){
            randArr[i] = (int) (Math.random() * upperbound);
        }
        return randArr;
    }
    public static void print(int[] arr){
        System.out.println("Array is: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int arraySum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;
    }
    public static int findNum(int[] arr, int num){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == num)
                return i;
        }
        return -1;
    }
    public static int countMultiplesOf(int[] arr, int factor){
        int numMultiples = 0;
        for (int entry : arr){
            if (isMultiple(entry, factor))
                numMultiples++;
        }
        return numMultiples;
    }
    // goes with countMultiples of
    public static boolean isMultiple(int entry, int factor){
        if (entry % factor == 0)
            return true;
        return false;
    }
}
