import java.util.Scanner;

public class sumColumns {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the dimensions of an n x m matrix: ");
        int rows = input.nextInt();
        int columns = input.nextInt();
        double[][] m = new double[rows][columns];
        double result = 0;
        System.out.println("Enter the matrix of "+ rows + " x " + columns + ": ");
        for (int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                m[i][j] = input.nextDouble();
            }
        }
        System.out.println("The sums of the columns are: ");
        for (int c = 0; c < columns; c++){
            result = sumColumns(m, c);
            System.out.print(result + " ");
        }

    }
    public static double sumColumns(double[][] m, int c){
        double sum = 0;
        for(int i = 0; i < m.length; i++) {
            sum += m[i][c];
        }
        return sum;
    }
}
