public class NumberSystems {
    public static int baseX2decimal(int base, String s){
        char sEntry;
        int sVal = 0, dec = 0, counter = 0;
        for(int i = s.length()-1; i >= 0; i--){
            sEntry = s.charAt(i);
            switch(sEntry){
                case 'A':
                    sVal = 10;
                    break;
                case 'B':
                    sVal = 11;
                    break;
                case 'C':
                    sVal = 12;
                    break;
                case 'D':
                    sVal = 13;
                    break;
                case 'E':
                    sVal = 14;
                    break;
                case 'F':
                    sVal = 15;
                    break;
                case 'G':
                    sVal = 16;
                    break;
                case 'H':
                    sVal = 17;
                    break;
                case 'I':
                    sVal = 18;
                    break;
                case 'J':
                    sVal = 19;
                    break;
                case 'K':
                    sVal = 20;
                    break;
                case 'L':
                    sVal = 21;
                    break;
                case 'M':
                    sVal = 22;
                    break;
                case 'N':
                    sVal = 23;
                    break;
                case 'O':
                    sVal = 24;
                    break;
                case 'P':
                    sVal = 25;
                    break;
                case 'Q':
                    sVal = 26;
                    break;
                case 'R':
                    sVal = 27;
                    break;
                case 'S':
                    sVal = 28;
                    break;
                case 'T':
                    sVal = 29;
                    break;
                case 'U':
                    sVal = 30;
                    break;
                case 'V':
                    sVal = 31;
                    break;
                case 'W':
                    sVal = 32;
                    break;
                case 'X':
                    sVal = 33;
                    break;
                case 'Y':
                    sVal = 34;
                    break;
                case 'Z':
                    sVal = 35;
                    break;
                default:
                    sVal = Integer.parseInt(String.valueOf(sEntry));
            }
            dec += sVal * Math.pow(base,counter);
            counter++;
        }
        return dec;
    }

    public static String decimal2BaseX(int base, int dec){
        int entry;
        String val;
        String revNum = "", num = "";

        while (dec > 0){
            entry = dec % base;
            switch(entry){
                case 10:
                    val = "A";
                    break;
                case 11:
                    val = "B";
                    break;
                case 12:
                    val = "C";
                    break;
                case 13:
                    val = "D";
                    break;
                case 14:
                    val = "E";
                    break;
                case 15:
                    val = "F";
                    break;
                case 16:
                    val = "G";
                    break;
                case 17:
                    val = "H";
                    break;
                case 18:
                    val = "I";
                    break;
                case 19:
                    val = "J";
                    break;
                case 20:
                    val = "K";
                    break;
                case 21:
                    val = "L";
                    break;
                case 22:
                    val = "M";
                    break;
                case 23:
                    val = "N";
                    break;
                case 24:
                    val = "O";
                    break;
                case 25:
                    val = "P";
                    break;
                case 26:
                    val = "Q";
                    break;
                case 27:
                    val = "R";
                    break;
                case 28:
                    val = "S";
                    break;
                case 29:
                    val = "T";
                    break;
                case 30:
                    val = "U";
                    break;
                case 31:
                    val = "V";
                    break;
                case 32:
                    val = "W";
                    break;
                case 33:
                    val = "X";
                    break;
                case 34:
                    val = "Y";
                    break;
                case 35:
                    val = "Z";
                    break;
                default:
                    val = String.valueOf(entry);
            }
            revNum += val;
            dec /= base;
        }
        for(int i = revNum.length() - 1; i >= 0; i--){
            num += revNum.charAt(i);
        }
        return num;
    }



    public static int hexadecimal2decimal(String hex){
        return baseX2decimal(16, hex);
    }

    public static String decimal2binary(int n){
        return decimal2BaseX(2,n);
    }

    public static String decimal2hex(int n){
        return decimal2BaseX(16, n);
    }

    public static int binary2decimal(String b){
        return baseX2decimal(2,b);
    }

    public static void main(String[] args) {

        System.out.println(hexadecimal2decimal("A1")); // 161

        //System.out.println(decimal2binary(10)); // 1010

        //System.out.println(decimal2hex(161)); // A1

        //System.out.println(binary2decimal("1010")); // 10

    }

}
