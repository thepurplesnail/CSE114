import java.util.Arrays;
public class TestMyString1 {
    public static void main(String[] args){
        MyString1 string1 = new MyString1(new char[]{'L','e','m','o','n',' ','o','n',' ','j','u','i','c','e','o','n'});
        MyString1 string2 = new MyString1(new char[]{'L','e','m','o','n',' ','j','u','i','c','e'});
        String string5 = "Lemon juice";

        System.out.println(string1.charAt(4)); // => n
        System.out.println(string1.length()); // => 11

        MyString1 substring = string1.substring(2,5);
        for (int i = 0; i < substring.length(); i++)
            System.out.print(substring.charAt(i));  // => mon
        System.out.println();

        MyString1 lowerString = string1.toLowerCase();
        for (int i = 0; i < lowerString.length(); i++)
            System.out.print(lowerString.charAt(i)); // => lemon juice
        System.out.println();

        System.out.println(string1.equals(string2)); // => true

        MyString1 string3 = MyString1.valueOf(123);
        for (int i = 0; i < string3.length(); i++)
            System.out.print(string3.charAt(i)); // => 123
        System.out.println();

        MyString1[] ans = string2.split("on"); // => lem juice
        for(MyString1 a:ans){
            for(int i = 0; i < a.length(); i++){
                System.out.print(a.charAt(i));
            }
        }

        System.out.println();
        for (String a:string5.split("on")) // => lem juice
            System.out.print(a);

    }
}
