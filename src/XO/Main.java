package XO;

import XO.controller.Game;
import XO.model.Board;
import XO.view.ConsoleView;

/**
 * Main class, main point
 * @author habatoo
 * */
public class Main {

    public static void main(String[] args) {

        final Game game = new Game();
        final ConsoleView consoleView = new ConsoleView(game);
        startGame(consoleView);
    }

    private static void startGame(final ConsoleView consoleView) {
        consoleView.showGameName();
    }
}
