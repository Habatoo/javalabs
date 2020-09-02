package XO;

import XO.controller.GameController;
import XO.model.Board;
import XO.model.Player;
import XO.view.AdvConsoleView;
import XO.view.ConsoleView;
import XO.model.Figure;
import XO.view.MenuView;

import java.awt.*;
import java.util.ServiceConfigurationError;

/**
 * Main class, main point
 * @author habatoo
 * */
public class Main {

    public static void main(String[] args) {

//        testBoard();
//        testFigure();
//        testGameController();
//        testPlayer();

        MenuView menuView = new MenuView();
        menuView.showMenuWithResult();

//        Board board = new Board();
//        board.initArray();
//        board.showBord();
//
//        final GameController gameController = new GameController("XO", null, null);
//        gameController.move(-2, -2);
//        final AdvConsoleView advConsoleView = new AdvConsoleView(game);
//        final ConsoleView consoleView = new ConsoleView(game);
//        startGame(advConsoleView);
    }

    private static void testFigure() {
        final String figureName = "A";
        final Figure figure = new Figure(figureName);
        if (!figure.getFigure().equals(figureName)) {
            throw new RuntimeException("Figure test failure");
        }
    }

    private static void testPlayer() {
        final String playerName = "Stas";
        final Figure playerFigure = new Figure("A");
        final Player player = new Player(playerName, playerFigure);
        if (!player.getFigure().equals(playerFigure) || !player.getName().equals(playerName)) {
            throw new RuntimeException("Player test failure");
        }
    }

    private static void testBoard() {
        final Board board = new Board();
    }

    private static void testGameController() {
        final String gameName = "XO";
        final GameController gameController = new GameController(gameName, null, null);
        if (!gameController.getGameName().equals(gameName)) {
            throw new RuntimeException("GameController test failure");
        }
        gameController.move(0, 0);
        gameController.currentPlayer();
    }

    private static void startGame(final ConsoleView consoleView) {
        consoleView.showGameName();
        consoleView.showPlayerName();
    }
}
