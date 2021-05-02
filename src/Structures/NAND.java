package Structures;

public class NAND extends Structure{

    public NAND(int startCol, int startRow) {
        super(startCol, startRow);
    }

    @Override
    public void addstruct(int[][] board) {
        int lp =9;
        for (int j=0; j < 11; j+=10)
            for (int i=0; i < lp; i++)
                board[startRow+j][startCol+i] = 1;
        // staram się wykożystać symetryczność NAND

        for(int j = -1; j < 2; j+=2 ) {
            board[startRow + 5][startCol + 4] = 1;
            board[startRow + 5 + j][startCol + 5] = 1;
            board[startRow + 5 + j][startCol + 6] = 1;
            board[startRow + 5][startCol + 7] = 1;
            board[startRow + 5 + j][startCol + 8] = 1;
            board[startRow + 5 + 3*j][startCol + 8] = 1;
            board[startRow + 5 + 2*j][startCol + 9] = 1;
            board[startRow + 5 + 3*j][startCol + 9] = 1;
            board[startRow + 5 + 4*j][startCol + 9] = 1;
            board[startRow + 5 + j][startCol + 10] = 1;
            board[startRow + 5 + 3*j][startCol + 10] = 1;
            board[startRow + 5 + j][startCol + 11] = 1;
            board[startRow + 5 + 2*j][startCol + 12] = 1;
            board[startRow + 5 + 3*j][startCol + 13] = 1;
            board[startRow + 5][startCol + 14] = 1;
            board[startRow + 5 + j][startCol + 14] = 1;
            board[startRow + 5 + 3*j][startCol + 14] = 1;
            board[startRow + 5 + j][startCol + 15] = 1;
            board[startRow + 5 + 2*j][startCol + 15] = 1;
            board[startRow + 5 + j][startCol + 16] = 1;
            for (int i = 17; i < 20; i++)
                board[startRow+5][startCol+i] = 1;





        }
    }
}
