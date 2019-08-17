package pl.moj.tictac.model;

public enum Turn {

    PLAYER_1(GameBoardFieldState.X), PLAYER_2(GameBoardFieldState.O);

    private GameBoardFieldState sign;

    Turn(GameBoardFieldState sign) {
        this.sign = sign;

    }

    public GameBoardFieldState getSign() {
        return sign;
    }
}
