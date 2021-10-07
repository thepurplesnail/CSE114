import java.util.Scanner;
import java.util.Arrays;
public class MultiplyMatrices {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first 3 x 3 matrix: ");
        double[][] matrixA = new double[3][3], matrixB = new double[3][3];
        for (int row = 0; row < 3; row++){
            for (int col = 0; col < 3; col++)
                matrixA[row][col] = input.nextDouble();
        }
        System.out.println("Enter your next 3 x 3 matrix: ");
        for (int row = 0; row < 3; row++){
            for (int col = 0; col < 3; col++)
                matrixB[row][col] = input.nextDouble();
        }
        double[][] product = multiplyMatrices(matrixA,matrixB);

        //print product matrix
        for (int row = 0; row < 3; row++){
            for (int col = 0; col < 3; col++){
                System.out.print(product[row][col] + " ");
            }
            System.out.println();
        }

    }

    public static double[][] multiplyMatrices(double[][] a, double[][] b){
        double[][] c = new double[3][3];
        for (int i = 0; i < 3; i++){
            for(int row = 0; row < 3; row++){
                for(int col = 0; col < 3; col++){
                    c[row][i] += a[row][col] * b[col][i];
                }
            }
        }

        return c;
    }
}
