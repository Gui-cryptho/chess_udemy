package application;

import boardLayer.Piece;
import chessLayer.ChessPiece;

public class UI {

    public static void printBoard(ChessPiece[][] board){
        ChessPiece aux;
        for(int i = 0;i < board.length;i++){
            System.out.print(8 - i + " ");

            for(int j = 0; j < board.length;j++){
                aux = board[i][j];
                pieceSub(aux);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }

    public static void pieceSub(ChessPiece place){
        if(place == null){
            System.out.print("-");
        }else{
            System.out.print(place);
        }
        System.out.print(" ");
    }
}
