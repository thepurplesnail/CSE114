public class EliminateDuplicates {
    public static void main(String[] args){
        System.out.println(eliminateDuplicates("abracadabra")); // returns abrcd

        System.out.println(eliminateDuplicates("Stony Brook University")); // returns Stony BrkUives

        System.out.println(eliminateDuplicates("This is a test sentence."));

        System.out.println(eliminateDuplicates("Another test case"));

        System.out.println(eliminateDuplicates("Running out of ideas"));
    }
    public static String eliminateDuplicates(String str){
        String newString = "";
        int[] incidence = new int[str.length()];
        for (int i = 0; i < str.length(); i++){
            for (int j = i; j >= 0; j--){
                if (str.charAt(i) == str.charAt(j))
                    incidence[i]++;
            }
        }
        for (int i = 0; i < str.length(); i++){
            if (incidence[i] == 1){
                newString += str.charAt(i);
            }
        }
        return newString;
    }
}

