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

    public void split(String s) {
        int sLength = s.length();
        for (int i = 0; i < this.length() - s.length() + 1; i++) {
            String str = "";
            for (int j = i; j < sLength + i; j++) {
                str += stringChars[j];
            }
        }

    }

}