package XO.model;

import java.util.Arrays;

/**
 * Board class, board for any games.
 */
public class Board {

    private static final int SIZE_FIELD = 9;

    private Figure[] figures = new Figure[SIZE_FIELD];

    public void showBord() {
        System.out.println(Arrays.toString(this.figures));
    }

//    public void printBoard() {
//        System.out.printf("%s|%s|%s\n", figure11.getFigure(), figure12.getFigure(), figure13.getFigure());
//        System.out.println("-----");
//        System.out.printf("%s|%s|%s\n", figure21.getFigure(), figure22.getFigure(), figure23.getFigure());
//        System.out.println("-----");
//        System.out.printf("%s|%s|%s\n", figure31.getFigure(), figure32.getFigure(), figure33.getFigure());
//        System.out.println("-----");
//    }
}
