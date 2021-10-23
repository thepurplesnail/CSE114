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

    public boolean equals(MyString1 s) {
        boolean equal = false;
        char[] sChars = s.stringChars;
        if (s.length() == this.length()) {
            for (int i = 0; i < length(); i++) {
                if (sChars[i] == this.stringChars[i])
                    equal = true;
                else {
                    equal = false;
                    break;
                }
            }
        }
        return equal;
    }

    public static MyString1 valueOf(int i) {
        int numDigs = 0, num = i, digit;
        while (num > 0) {
            num /= 10;
            numDigs++;
        }
        char[] iChars = new char[numDigs];
        for (int j = numDigs - 1; j >= 0; j--) {
            digit = i % 10;
            i /= 10;
            iChars[j] = (char) (digit + '0');
        }
        return new MyString1(iChars);
    }

    public MyString1[] split(String s) {
        int matches = 0, stopsIndex = 0;
        char[] splitterArr = new char[s.length()];

        for(int i = 0; i < s.length(); i++)
            splitterArr[i] = s.charAt(i);
        MyString1 splitter = new MyString1(splitterArr);

        // finding how many matches of s array in current object array

        for (int i = 0; i < this.length() - s.length() + 1; i++) {
            MyString1 subString = this.substring(i, i + s.length());
            if (subString.equals(splitter))
                matches++;
        }

        // initialize and populate stops[]

        int[] stops = new int[matches];

        int k = 0;

        for (int i = 0; i < this.length() - s.length() + 1; i++) {
            MyString1 subString = this.substring(i, i + s.length());
            if (subString.equals(splitter)) {
                stops[k++] = i;
            }
        }

        // populate splitted[]

        MyString1[] splitted = new MyString1[matches];
        for (int splittedIndex = 0; splittedIndex < splitted.length; splittedIndex++){
            int i = stops[stopsIndex];
            int h;
            if (stopsIndex == 0)
                h = 0;
            else
                h = stops[stopsIndex - 1] + s.length();
            splitted[splittedIndex] = this.substring(h, i);
            stopsIndex++;
        }

        // if this doesn't end with s

        if ((stops[stopsIndex - 1] + s.length()) < this.length()){
            MyString1[] temp = new MyString1[matches + 1];
            for (int i = 0; i < temp.length - 1; i++){
                temp[i] = splitted[i];
            }

            int i = this.length();
            int h = stops[stopsIndex - 1] + s.length();

            temp[matches] = this.substring(h, i);
            splitted = temp;

        }

        return splitted;
    }
}