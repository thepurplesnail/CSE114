package OldProblems;

public class FilterArr {
    public static void main(String[] args){
        int[] ans = filterArr(new int[] {1,2,4,5,4,3});
        for (int a:ans)
            System.out.print(a + " ");
    }

    public static int[] filterArr(int [] arr){
        int[] newArr = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++){
            boolean contains = false;
            for (int j = 0; j < k; j++)
                if (newArr[j] == arr[i])
                    contains = true;
            if (!contains)
                newArr[k++] = arr[i];
        }

        int[] temp = new int[k];
        for (int i = 0; i < k; i++)
            temp[i] = newArr[i];
        newArr = temp;
        return newArr;
    }
}
