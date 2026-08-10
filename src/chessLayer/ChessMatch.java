package chessLayer;

import boardLayer.Board;
import boardLayer.auxType.Position;
import chessLayer.enums.Color;
import chessLayer.pieces.King;
import chessLayer.pieces.Rook;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        this.board = new Board(8, 8);
        initialSetup();

    }

    public ChessPiece[][] getAuxBoard(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for(int i = 0; i < board.getRows();i++){
            for (int j = 0; j < board.getColumns();j++){
                mat[i][j] = (ChessPiece) board.getPiece(i, j);
            }
        }
        return mat;
    }

    public void initialSetup(){
        board.placePiece(new Rook(board, Color.WHITE), new Position(1, 0));
        board.placePiece(new King(board, Color.WHITE), new Position(0, 4));
    }
}
