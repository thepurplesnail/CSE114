public class reverse {
    public static void main(String[] args){
        int[] abc = {'a','b','c'};
        reverse(abc);
    }
    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];
        for (int i = 0, counter = result.length - 1;
             i < list.length; i++, counter--) {
            result[counter] = list[i];
        }
        return result;
    }

}
