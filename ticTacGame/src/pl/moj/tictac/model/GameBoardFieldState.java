package pl.moj.tictac.model;

public enum GameBoardFieldState {

    X("X"), O("O"), EMPTY(" ");

    private String state;

    GameBoardFieldState(String gameBoard) {
        state = gameBoard;

    }

    public String getState() {
        return state;
    }
}
