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
        String vowel = "([aeiouAEIOU])";
        String consonant = "[^aeiouAEIOU]";
        int numVows = countVow(strArr);
        int count = 0;
        for (int i = 0; i < strArr.length; i++){
            if(i == 0 && strArr[i].matches(vowel)) //if it starts with a vowel
                count++;
            else if (i != 0 && strArr[i].matches("[yY]")) // if it ends with y
                count++;
            else if (i == strArr.length - 1 && strArr[i].matches("[aA]") && strArr[i - 1].matches("[eE]")) // if last two letters ea
                count++;
            else if (i == strArr.length - 1 && strArr[i].matches("[eE]")){  // if it ends with e
                if(numVows == 1)  // if it ends with e and e is the only vowel
                    count++;
                else
                    break; // otherwise e is silent

            } else if (strArr[i].matches("[aAoO]") && strArr[i - 1].matches("[iI]"))  // if ia or io ever appears
                count++;
            else if (strArr[i].matches("[oO]") && strArr[i - 1].matches("[eE]"))  // if eo ever appears
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
    // comet => com-et
    // minute => mi-nute 


    public static StringBuilder[] getSyl(int totalSyl, String[] strArr){
        StringBuilder[] sylArr = new StringBuilder[totalSyl];
        String vowel = "[aeiouAEIOU]";
        String pseudoVowel = "[aeiouyAEIOUY]";
        String consonant = "[^aeiouAEIOU]";
        int pointer = 0;
        for(int i = 0; i < sylArr.length; i++){
            StringBuilder syl = new StringBuilder();
            for(int j = pointer; j < strArr.length; j++){
                if(strArr[j].matches(vowel)){ // if syllable starts with vowel
                	syl.append(strArr[j]);
                	if(j < strArr.length - 2 && (strArr[j+2].matches(pseudoVowel)) ) { // sharp vowel
                        pointer++;
                        break;
                    } else if (strArr[j].matches("[iIeE]") && strArr[j + 1].matches("[aoAO]")){
                	    pointer++;
                	    break;
                    } else if (strArr[j].matches("[aoAO]") && strArr[j - 1].matches("[iIeE]")) {
                	    pointer++;
                        break;
                    } else {
                        while (!strArr[j].matches(consonant) && j < strArr.length - 1)  // keep building syllable until reaches consonant
                            syl.append(strArr[++j]);

                        pointer = j + 1;
                        break;
                    }
                } else {
                	syl.append(strArr[j]);
                    while(!strArr[j].matches(pseudoVowel) && j < strArr.length - 1)
                        syl.append(strArr[++j]);
                    while(strArr[j].matches(pseudoVowel) && j < strArr.length - 1) {
                        syl.append(strArr[++j]);
                    }
                    if(j == strArr.length - 2 && strArr[j + 1].matches("[eE]") && totalSyl == 1 && j < strArr.length - 1){ // add silent e to syllable
                        syl.append(strArr[++j]);
                    }
                    pointer = j + 1;
                    break;
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
