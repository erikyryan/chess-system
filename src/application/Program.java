package application;

import chess.ChessMatch;


public class Program {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}

/*

matrix_row = 8 - chess_row

matrix_column = chess_column - 'a'

'a' - 'a' = 0
'b' - 'a' = 1

*/