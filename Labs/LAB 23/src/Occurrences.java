public class Occurrences {
    public static void main(String[] args){
        System.out.print(count(new char[] {'a','b','c','d','a','a','a'}, 'a'));
    }
    public static int count(char[ ] chars, char ch){
        return count(chars, ch, chars.length - 1);
    }

    public static int count(char[ ] chars, char ch, int high){
        if (high < 0)
            return 0;
        else if (chars[high] == ch)
            return 1 + count(chars, ch, high - 1);
        else
            return count(chars, ch, high - 1);
    }
}