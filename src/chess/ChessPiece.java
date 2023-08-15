package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	// setter foi excluído para impedir a alteraçao da cor da peça
	public Color getColor() {
		return color;
	}

}
