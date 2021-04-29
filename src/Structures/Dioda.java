package Structures;

public class Dioda extends Structure{

    private String type;
    public Dioda(int startRow, int startCol, String type) {
        super(startRow, startCol);
        this.type = type;
    }

    @Override
    public int[][] addstruct(int [][] board) {
        int lp = 6; //liczba przewodnikw
        // Sześć przewodników
        for(int i =0; i < lp;i++)
            board[startRow][startCol+i] = 1;

        // robie prostokąt 2x3 i zamieniam na 0 jedno pole w zależności odd typu diody
        for(int j =0; j<2;j++)
            for(int i=-1; i < 2;i++)
                board[startRow+i][startCol+j+lp] = 1;

        if (type.equals(new String("Reversed"))) {
            board[startRow][startCol + lp] = 0;
        }  else {
            board[startRow][startCol + lp+1] = 0;
        }

        // Sześć przewodników
        for(int i =lp+2; i < 2*lp+2;i++)
            board[startRow][startCol+i] = 1;

    return board;

    }
}
