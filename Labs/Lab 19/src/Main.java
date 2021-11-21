public class Main {
    public static void main(String[] args) {
        // Prompt the user to enter a password
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a string for password: ");
        String s = input.nextLine();
        if (isValidPassword(s)) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }

    public static boolean isValidPassword(String s){
        int numDigs = 0;
        if (s.length() < 8)
            return false;
        String[] sArr = s.split("");
        for (int i = 0; i < sArr.length; i++){
            if (!sArr[i].matches("[\\w]") && !sArr[i].matches("[\\d]")){
                return false;
            }
            if (sArr[i].matches("[\\d]")){
                numDigs++;
            }
        }
        if (numDigs >= 2)
            return true;
        return false;
    }

}
