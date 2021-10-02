import java.util.Arrays;
public class InterleaveArrays {
    public static void main(String[] args){

        int[] result1 = interleaveArrays(new int[]{1,3,5}, new int[]{2,4,6}); // returns [1, 2, 3, 4, 5, 6]
        System.out.println("New array is: " + Arrays.toString(result1));

        int[] result2 = interleaveArrays(new int[]{10,20,30,40,50,60,70,80}, new int[]{2,4,6,8}); // returns [10, 2, 20, 4, 30, 6, 40, 8, 50, 60, 70, 80]
        System.out.println("New array is: " + Arrays.toString(result2));

        int[] result3 = interleaveArrays(new int[]{1,3,5}, new int[]{2,4,6,8,10}); // returns [1, 2, 3, 4, 5, 6, 8, 10]
        System.out.println("New array is: " + Arrays.toString(result3));

        int[] result4 = interleaveArrays(new int[]{1,3,5,7,9}, new int[]{2,4,6}); // returns [1, 2, 3, 4, 5, 6, 7, 9]
        System.out.println("New array is: " + Arrays.toString(result4));

        int[] result5 = interleaveArrays(new int[]{1}, new int[]{2,4,6,8,10}); // returns [1, 2, 4, 6, 8, 10]
        System.out.println("New array is: " + Arrays.toString(result5));


    }

    public static int[] interleaveArrays(int[] arr1, int[] arr2){

        int[] shortArr, longArr;
        if (arr1.length > arr2.length) {
            shortArr = arr2;
            longArr = arr1;
        } else {
            shortArr = arr1;
            longArr = arr2;
        }

        int[] newArr = new int[arr1.length + arr2.length];

        for (int i = 0, j = 0, k = 1; i < shortArr.length; i++, j += 2, k +=2){
            newArr[j] = arr1[i];
            newArr[k] = arr2[i];
        }

        for (int i = shortArr.length, j = 2 * shortArr.length; i < longArr.length; i++, j++){
            newArr[j] = longArr[i];
        }
        return newArr;
    }



}