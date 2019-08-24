package pl.moj.tictac.io;

import pl.moj.tictac.model.GameBoard;
import pl.moj.tictac.model.GameBoardFieldState;
import pl.moj.tictac.model.Turn;

public class Printer {

    public void printTurn(Turn turn) {
        System.out.println(String.format("%s write row and column number", turn.getPlayerName()));
    }

    public void printWinner(Turn turn) {
        System.out.println(String.format("The winner is %s (%s)", turn.getPlayerName(), turn.getSign()));
    }


    public void printBoard(GameBoard gameBoard) {
        GameBoardFieldState board[][] = gameBoard.getBoard();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print("[" + board[i][j].getState() + "]");
            }
            System.out.println();
        }
    }

    public void printEnd() {
        System.out.println("The end");
    }
}
