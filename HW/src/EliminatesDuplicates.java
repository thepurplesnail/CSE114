public class EliminatesDuplicates {
    public static void main (String[] args){
        int[] results = eliminatesDuplicates("apple");
        System.out.print("Incidence: ");
        for (int i = 0; i < results.length; i++){
            System.out.print(results[i]);
        }
    }
  public static int[] eliminatesDuplicates(String str){
        String newStr = "";
        char[] strArr = new char[str.length()];
        int[] incidence = new int[str.length()];
        for (int i = 0; i < str.length(); i++){
            strArr[i] = str.charAt(i);
        }
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == strArr[i]){
                incidence[i]++;
            }
        }

        return incidence;
    }
}
