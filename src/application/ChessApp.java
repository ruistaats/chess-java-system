package application;
//import boardgame.Board;
import chess.ChessMatch;
public class ChessApp {

	public static void main(String[] args) {
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.GetPieces());
		
	}

}
