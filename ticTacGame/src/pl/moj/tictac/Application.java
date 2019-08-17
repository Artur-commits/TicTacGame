package pl.moj.tictac;

import pl.moj.tictac.bo.GameController;

public class Application {

    public static void main(String[] args) {

        GameController game = new GameController();
        game.startGame();
    }

}
