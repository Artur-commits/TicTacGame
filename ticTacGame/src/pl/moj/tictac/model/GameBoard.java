package pl.moj.tictac.model;

public class GameBoard {

    private GameBoardFieldState[][] board;

    public GameBoard() {
        this.board = new GameBoardFieldState[3][3];
        fillBoardWithEmptyFields();
    }

    private void fillBoardWithEmptyFields() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = GameBoardFieldState.EMPTY;
            }
        }
    }

    public void setFieldState(Integer columnNo, Integer rowNo, GameBoardFieldState gameBoardFieldState) {
        board[columnNo - 1][rowNo - 1] = gameBoardFieldState;
    }

    public GameBoardFieldState[][] getBoard() {
        return board;
    }

    public boolean isRowMatchFieldState(GameBoardFieldState gameBoardFieldState) {
        Boolean isRowMatchFieldState = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != gameBoardFieldState) {
                    isRowMatchFieldState = false;
                }
            }
            if (isRowMatchFieldState) {
                return true;
            } else isRowMatchFieldState = true;

        }
        return false;
    }

    public boolean isColMatchFieldState(GameBoardFieldState gameBoardFieldState) {
        Boolean isColMatchFieldState = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i] != gameBoardFieldState) {
                    isColMatchFieldState = false;
                }
            }
            if (isColMatchFieldState) {
                return true;
            } else isColMatchFieldState = true;
        }

        return false;
    }


}
