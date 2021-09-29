public class NumberSystems {
    public static int baseX2decimal(int base, String s){
        char sEntry;
        char[] entryTypes = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int sVal = 0, dec = 0, counter = 0;
        for(int i = s.length()-1; i >= 0; i--){
            sEntry = s.charAt(i);
            for(int j = 0; j < entryTypes.length; j++){
                if (sEntry == entryTypes[j])
                    sVal = j;
            }
            dec += sVal * Math.pow(base, counter);
            counter++;
        }
        return dec;
    }

    public static String decimal2BaseX(int base, int dec){
        int entry;
        String[] entryArr = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String val;
        String revNum = "", num = "";

        while (dec > 0){
            entry = dec % base;
            if (entry > 9)
                val = entryArr[entry - 10];
            else
                val = String.valueOf(entry);
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

        System.out.println(decimal2binary(10)); // 1010

        System.out.println(decimal2hex(161)); // A1

        System.out.println(binary2decimal("1010")); // 10

        System.out.println(baseX2decimal(16, "A1"));
    }

}
