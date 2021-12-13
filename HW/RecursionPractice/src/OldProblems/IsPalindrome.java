package OldProblems;

public class IsPalindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome("racecar"));
    }

    public static boolean isPalindrome(String str){
        return isPalindrome(str, 0, str.length() - 1);
    }

    public static boolean isPalindrome(String str, int a, int b){
        if (b <= a)
            return true;
        if (str.charAt(a) != str.charAt(b))
            return false;
        else
            return isPalindrome(str, a + 1, b - 1);
    }
}