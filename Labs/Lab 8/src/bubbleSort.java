import java.util.Arrays;
public class bubbleSort {
    public static void main(String[] args){
        double[] list = {6.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5};
        double[] result = bubbleSortFxn(list);
        System.out.println(Arrays.toString(result));
    }
    public static double[] bubbleSortFxn(double[] list){
        boolean changed = true;
        double temp;
        do {
            changed = false;
            for (int j = 0; j < list.length - 1; j++)
                if (list[j] > list[j + 1]) {
                    // swap list[j] with list[j + 1];
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    changed = true;
                }
        } while (changed);
        return list;
    }
}

