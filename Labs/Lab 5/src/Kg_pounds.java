public class Kg_pounds {
    public static void main(String[] args){
        double poundsOut, kilogramsOut;
        int poundsIn = 20;
        int kilogramsIn = 1;
        System.out.println("Kilograms   Pounds   Pounds   Kilograms");
        for(int i = 0; i < 100; i++){
            poundsOut = kilogramsIn * 2.2;
            kilogramsOut = poundsIn/2.2;
            System.out.printf("\n%d %14.1f %6d %12.2f", kilogramsIn, poundsOut, poundsIn, kilogramsOut);
            kilogramsIn += 2;
            poundsIn += 5;
        }
    }
}