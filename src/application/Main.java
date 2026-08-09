package application;

import chessLayer.ChessMatch;

public class Main {
    public static void main(String[] args) {

        ChessMatch match = new ChessMatch();
        UI.printBoard(match.getAuxBoard());

    }
}