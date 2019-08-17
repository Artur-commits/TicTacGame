package pl.moj.tictac.bo;

import pl.moj.tictac.model.GameBoard;
import pl.moj.tictac.model.Turn;

public class GameState {

    private GameBoard board = new GameBoard();
    private Turn turn = Turn.PLAYER_1;

    public GameBoard getBoard() {
        return board;
    }

    public Turn getTurn() {
        return turn;
    }

    public void changeTurn() {
        if (turn == Turn.PLAYER_1){
            turn = Turn.PLAYER_2;
        } else turn = Turn.PLAYER_1;


    }

    public void setField(Integer fieldNo, Integer rowNo){
        board.setFieldState(fieldNo, rowNo, turn.getSign());
    }





}
