package XO;

import XO.controller.Game;
import XO.model.Board;
import XO.view.AdvConsoleView;
import XO.view.ConsoleView;

/**
 * Main class, main point
 * @author habatoo
 * */
public class Main {

    public static void main(String[] args) {

        final Game game = new Game();
        final AdvConsoleView advConsoleView = new AdvConsoleView(game);
        final ConsoleView consoleView = new ConsoleView(game);
        startGame(advConsoleView);
    }

    private static void startGame(final ConsoleView advConsoleView) {
        advConsoleView.showGameName();
    }
}
