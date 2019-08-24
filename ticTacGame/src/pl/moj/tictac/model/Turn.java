package pl.moj.tictac.model;

public enum Turn {

    PLAYER_1(GameBoardFieldState.X, "Player 1"),
    PLAYER_2(GameBoardFieldState.O, "Player 2");

    private GameBoardFieldState sign;
    private String playerName;

    public String getPlayerName() {
        return playerName;
    }



    Turn(GameBoardFieldState sign, String playerName) {
        this.sign = sign;
        this.playerName = playerName;

    }

    public GameBoardFieldState getSign() {
        return sign;
    }
}
