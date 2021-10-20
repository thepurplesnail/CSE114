public class MyString1 {
    private char[] stringChars;

    public MyString1(char[] chars) {
        stringChars = chars;
    }

    public char charAt(int index) {
        return stringChars[index];
    }

    public int length() {
        return stringChars.length;
    }

    public MyString1 substring(int begin, int end) {
        char[] substringArray = new char[end - begin];
        for (int i = 0; i < substringArray.length; i++) {
            substringArray[i] = stringChars[i + begin];
        }
        return new MyString1(substringArray);
    }

    public MyString1 toLowerCase() {
        char[] lowercaseArray = new char[stringChars.length];
        for (int i = 0; i < lowercaseArray.length; i++) {
            lowercaseArray[i] = Character.toLowerCase(stringChars[i]);
        }
        return new MyString1(lowercaseArray);
    }

    public boolean equals(MyString1 s){
        boolean equal = false;
        char[] sChars = s.stringChars;
        if (s.length() == this.length()){
            for (int i = 0; i < length(); i++){
                if(sChars[i] == this.stringChars[i])
                    equal = true;
                else{
                    equal = false;
                    break;
                }
            }
        }
        return equal;
    }

    public static MyString1 valueOf(int i){
        int numDigs = 0, num = i, digit;
        while (num > 0){
            num /= 10;
            numDigs++;
        }
        char[] iChars = new char[numDigs];
        for (int j = numDigs - 1; j >= 0; j--){
            digit = i % 10;
            i /= 10;
            iChars[j] = (char) (digit + '0');
        }
        return new MyString1(iChars);
    }

    public MyString1[] split(String s) {
        int sLength = s.length(), counter = 0;
        char[] sArr = new char[sLength];
        for(int i = 0; i < sLength; i++)
            sArr[i] = s.charAt(i);
        MyString1 sMyString1 = new MyString1(sArr);
        
        // finding how many matches of s array in current object array

        for (int i = 0; i < this.length() - sLength + 1; i++) {
            MyString1 newString = this.substring(i, i + sLength);
            if (newString.equals(sMyString1))
                counter++;
        }
        
        // initialize and populate stops array
        
        int[] stops = new int[counter];
        
        int k = 0;
        
        for (int i = 0; i < this.length() - sLength + 1; i++) {
            MyString1 newString = this.substring(i, i + sLength);
            if (newString.equals(sMyString1)) {
                stops[k++] = i;
            }
        }
<<<<<<< Updated upstream
        
        
        MyString1[] splitStrings = new MyString1[counter + 1];
        
        return splitStrings;
=======

        return stops;
>>>>>>> Stashed changes
    }
}
