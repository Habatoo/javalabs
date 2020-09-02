package XO.controller;

import XO.model.Board;
import XO.model.Figure;
import XO.model.Player;

public class GameController {

    private static final String DEFAULT_GAME_NAME = "XO";

    private static final int MAX_COORDINATE = 3;

    private static int MIN_COORDINATE = 0;
    
    private final Board board;

    private final String gameName;


    private Player[] players;

    public GameController(final String gameName, final Player[] players, final Board board) {
        this.players = players;
        this.board = board;
        if (gameName == null || gameName.isEmpty()) {
            this.gameName = "XO";
        } else {
            this.gameName = gameName;
        }
    }

    public String getGameName() {
        return gameName;
    }

    public Player currentPlayer() {
        return null;
    }

    public Board getBoard() {
        return board;
    }

    public boolean move(final int x, final int y) {
        if (checkCoordinate(x) || checkCoordinate(y)) {
            return false;
        }

        // TODO

        return false;
    }

    public Player[] getPlayers() {
        return players;
    }

    private static boolean checkCoordinate(final int coordinate) {
        if (coordinate < MIN_COORDINATE || coordinate > MAX_COORDINATE) {
            return false;
        } return true;
    }
}
