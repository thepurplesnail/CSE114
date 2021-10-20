public class TestFan {

    public static void main(String[] args){
        Fan fan1 = new Fan(Fan.FAST,10,"yellow",true);
        Fan fan2 = new Fan(Fan.MEDIUM, 5, "blue",false);
        System.out.println("fan 1\n" + fan1.toString());
        System.out.println();
        System.out.println("fan 2\n" + fan2.toString());
    }
}
