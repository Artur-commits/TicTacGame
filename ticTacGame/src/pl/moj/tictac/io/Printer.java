package pl.moj.tictac.io;

import pl.moj.tictac.model.GameBoard;
import pl.moj.tictac.model.GameBoardFieldState;
import pl.moj.tictac.model.Turn;

public class Printer {

    public void printTurn(Turn turn) {
        if (turn == Turn.PLAYER_1) {
            System.out.println("Gracz jeden (X) wpisz numer wiersza oraz numer kolumny");
        } else {
            System.out.println("Gracz dwa (O) wpisz numer wiersza oraz numer kolumny");
        }
    }

    public void printBoard(GameBoard gameBoard){
        GameBoardFieldState board[][] = gameBoard.getBoard();
        for (int i = 0; i<board.length; i++){
            for (int j = 0; j<board[i].length; j++){
                System.out.print("[" + board[i][j].getState() + "]");
            }
            System.out.println();
        }
    }
}
