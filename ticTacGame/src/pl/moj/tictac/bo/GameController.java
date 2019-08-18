package pl.moj.tictac.bo;

import pl.moj.tictac.io.Printer;
import pl.moj.tictac.io.Scan;

public class GameController {

    private Printer printer = new Printer();
    private Scan scan = new Scan();
    private GameState gameState = new GameState();
    int runda = 9;

    public void startGame(){
        for (int i =0; i<runda; i++) {
            printer.printTurn(gameState.getTurn());
            printer.printBoard(gameState.getBoard());
            gameState.setField(scan.getFieldNumber(), scan.getFieldNumber());
            printer.printBoard(gameState.getBoard());
            gameState.changeTurn();
        }
        System.out.println("The End");
    }
}
