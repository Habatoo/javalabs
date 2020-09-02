package XO.view;

import XO.controller.GameController;

public class AdvConsoleView extends ConsoleView{

    public AdvConsoleView(final GameController game) {
        super(game);
    }

    @Override
    public void showGameName() {
        System.out.println("***");
        System.out.println(gameController.getGameName());
    }

}
