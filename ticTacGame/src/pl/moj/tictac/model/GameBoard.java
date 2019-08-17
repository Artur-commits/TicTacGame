package pl.moj.tictac.model;

public class GameBoard {

    private GameBoardFieldState[][] board;

    public GameBoard(){
        this.board = new GameBoardFieldState[3][3];
        fillBoardWithEmptyFields();
    }

    private void fillBoardWithEmptyFields() {
        for(int i=0; i<board.length; i++){
            for (int j = 0; j < board[i].length; j++) {
                board[i][j]=GameBoardFieldState.EMPTY;
            }
        }
    }

    public void setFieldState(Integer columnNo, Integer rowNo, GameBoardFieldState gameBoardFieldState){
        board[columnNo-1][rowNo-1] = gameBoardFieldState;
    }

    public GameBoardFieldState[][] getBoard() {
        return board;
    }
}
