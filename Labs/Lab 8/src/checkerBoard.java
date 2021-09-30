public class checkerBoard {
    public static void main(String[] args){
        int[][] m = new int [8][8];
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                m[i][j] = (int) (Math.random() * 2);
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < 8; i++){
            checkRows(m, i);
            checkColumns(m, i);
        }

        checkDiagonals(m);
    }
    public static void checkRows(int[][] m, int row) {
        boolean same = true;
        int firstNum = m[row][0];
        for (int j = 0; j < 8; j++) {
            if (m[row][j] != firstNum) {
                same = false;
                break;
            }
        }
        if (same)
            System.out.println("All " + firstNum + "s in row " + (row + 1));
    }

    public static void checkColumns(int[][] m, int col){
        int firstNum = m[0][col];
        boolean same = true;
        for(int i = 0; i < 8; i++){
            if (m[i][col] != firstNum) {
                same = false;
                break;
            }
        } if (same)
            System.out.print("All " + firstNum + "s in column " + (col + 1));
    }
    public static void checkDiagonals(int[][] m){
            int firstNum = m[0][0];
            boolean sameMajor = true, sameMinor = true;
            for (int i = 0, j = 0; i < 8; i++, j++) {
                if (m[i][j] != firstNum) {
                    sameMajor = false;
                    break;
                }
            }
            for (int i = 7, j = 0; i >= 0; i--, j++) {
                if (m[i][j] != firstNum) {
                    sameMinor = false;
                    break;
                }
            }
            if (sameMajor) {
                System.out.println("All " + firstNum + "s in major diagonal");
            }
            if (sameMinor) {
                System.out.println("All " + firstNum + "s in major diagonal");
            }
        }
    }