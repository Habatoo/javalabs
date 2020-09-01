package XO.view;

import XO.controller.GameController;

public class ConsoleView {

    protected final GameController game;

    public ConsoleView(final GameController game) {
        this.game = game;
    }

    public void showGameName() {
        System.out.println(game.getGameName());
    }

    public void showPlayerName() {
        System.out.println(game.getPlayers());
    }
}
