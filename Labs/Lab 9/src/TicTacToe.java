import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args){
        int xRow, xColumn, yRow, yColumn;
        Scanner input = new Scanner(System.in);
        char[][] board = new char[3][3];
        int turnsLeft = 9;
        while(turnsLeft > 0) {
            System.out.print("Enter row and column of X token: ");
            xRow = input.nextInt() - 1;
            xColumn = input.nextInt() - 1;
            board[xRow][xColumn] = 'X';
            System.out.println("Turns left: " + turnsLeft);
            printBoard(board);
            if(!checkBoard(board))
                break;

            --turnsLeft;
            if (turnsLeft == 0){
                System.out.println("It's a tie");
                break;
            }

            System.out.print("Enter row and column of O token: ");
            yRow = input.nextInt() - 1;
            yColumn = input.nextInt() - 1;
            board[yRow][yColumn] = 'O';
            System.out.println("Turns left: " + turnsLeft);
            printBoard(board);
            if(!checkBoard(board))
                break;

            --turnsLeft;
            if (turnsLeft == 0){
                System.out.println("It's a tie");
                break;
            }

        }

    }

    public static void printBoard(char[][] board){
        for (int row = 0; row < board.length; row++){
            for (int col = 0; col < board[row].length; col++){
                System.out.print(board[row][col] + "\t");
            }
            System.out.println();
        }
    }

    public static boolean checkBoard(char[][] board){
        boolean stillGoing = true;
        for (int i = 0; i < 3; i++){
            if(checkRows(board, i) || checkCol(board, i)) {
                stillGoing = false;
            }
        }
        if(checkDia(board))
            stillGoing = false;

        return stillGoing;
    }

    public static boolean checkRows(char[][] m, int row) {
        boolean threeInARow = false;
        char firstToken = m[row][0];
        int matches = 1;
        if (firstToken == 'X' || firstToken == 'O') {
            for (int col = 1; col < 3; col++) {
                if (m[row][col] == firstToken) {
                    matches++;
                }
            }
        }
        if (matches == 3) {
            threeInARow = true;
        }
        if (threeInARow)
            System.out.println(firstToken + " wins");
        return threeInARow;
    }

    public static boolean checkCol(char[][] m, int col) {
        boolean threeInARow = false;
        char firstToken = m[0][col];
        int matches = 1;
        if (firstToken == 'X' || firstToken == 'O') {
            for (int row = 1; row < 3; row++) {
                if (m[row][col] == firstToken) {
                    matches++;
                }
            }
        }
        if (matches == 3) {
            threeInARow = true;
        }
        if (threeInARow)
            System.out.println(firstToken + " wins");
        return threeInARow;
    }

    public static boolean checkDia(char[][] m){
        boolean threeInARow = false;
        char firstMajorToken = m[0][0], firstMinorToken = m[0][2];
        int matchMaj = 1, matchMin = 1;

        if (firstMajorToken == 'X' || firstMajorToken == 'O'){
            for (int row = 1, col = 1; row < 3; row++, col++){
                if (m[row][col] == firstMajorToken)
                    matchMaj++;
            }
            if (matchMaj == 3){
                threeInARow = true;
                System.out.println(firstMajorToken + " wins");
            }
        }

        if (firstMinorToken == 'X' || firstMinorToken == 'Y'){
            for (int row = 1, col = 1; row < 3; row++, col--){
                if (m[row][col] == firstMinorToken)
                    matchMin++;
            }
            if (matchMin == 3){
                threeInARow = true;
                System.out.println(firstMinorToken + " wins");
            }
        }
        return threeInARow;
    }
}
