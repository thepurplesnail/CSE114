//count and print the syllables in a string
import java.util.Scanner;
public class Syllables {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String myString = input.nextLine();
        String[] wordArr = myString.split(" "); // split the words in myString
        int totalSyl = 0;
        for (String word:wordArr){
            String[] letterArr = word.split(""); // split the letters in each word
            int numSylls = countSyl(letterArr);
            StringBuilder[] sylArr = getSyl(numSylls,letterArr);

            for(StringBuilder syl:sylArr){
                System.out.println(syl);
            }

            totalSyl += numSylls;

        }
        System.out.print("Number of syllables entered: " + totalSyl);

    }

    public static int countSyl(String[] strArr){
        String[] sylArr;
        String vowel = "([aeiou]|[AEIOU])";
        String consonant = "[^aeiouAEIOU]";
        int numVows = countVow(strArr);
        int count = 0;
        for (int i = 0; i < strArr.length; i++){
            if(i == 0 && strArr[i].matches(vowel)) //if it starts with a vowel
                count++;
            else if (i == strArr.length - 1 && strArr[i].matches("y")) // if it ends with y
                count++;
            else if (i == strArr.length - 1 && strArr[i].matches("a") && strArr[i - 1].matches("e")) // if last two letters ea
                count++;
            else if (i == strArr.length - 1 && strArr[i].matches("e")){  // if it ends with e
                if(numVows == 1)  // if it ends with e and e is the only vowel
                    count++;
                else
                    break; // otherwise e is silent

            } else if (strArr[i].matches("a") && strArr[i - 1].matches("i"))  // if ia ever appears
                count++;
            else if (strArr[i].matches(vowel) && strArr[i - 1].matches(consonant))
                count++;
        }
        return count;
    }

    // utah => u-tah
    // apple => ap-ple
    // utopia => u-to-pi-a
    // beautiful => beau-ti-ful
    // umbrella => um-brel-la
    // animal => an-i-mal
    // iowa => i-o-wa
    // asymmetrical => a-sym-met-ri-cal
    // trumpet => trum-pet
    // tuba => tu-ba
    // outcome => out-come
    // opposite => op-pos-ite
    //


    public static StringBuilder[] getSyl(int totalSyl, String[] strArr){
        StringBuilder[] sylArr = new StringBuilder[totalSyl];
        String vowel = "[aeiouAEIOU]";
        String consonant = "[^aeiouAEIOU ]";
        int pointer = 0;
        for(int i = 0; i < sylArr.length; i++){
            StringBuilder syl = new StringBuilder();
            for(int j = pointer; j < strArr.length; j++){
                if(j == 0 && strArr[j].matches("vowel")){
                    if(strArr[j+2].matches(vowel)) {
                        syl.append(strArr[j]);
                        pointer++;
                    }
                    else {
                        while (!strArr[++j].matches("consonant")) {
                            syl.append(strArr[j]);
                        }
                        pointer += j + 1;
                    }
                }
            }
            sylArr[i] = syl;
        }
        return sylArr;
    }

    public static int countVow(String[] strArr){
        int count = 0;
        for (String el:strArr){
            if(el.matches("([aeiou]|[AEIOU])")){
                count++;
            }
        }
        return count;
    }

}
