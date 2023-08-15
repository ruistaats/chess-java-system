package boardgame;

public class Piece {
	protected Position position; // a peça vai precisar de uma posição
	private Board board; 		 // a peça precisa de um tabuleiro
	public Piece(Board board) {
		this.board = board;
		position = null;// esta referencia é apenas didática
	}
	// somente pecas de dentro da classe podem acessar este tabuleiro
	// setBoard foi apagado e getBoard deixou de ser public para "protected"
	protected Board getBoard() {
		return board;
	}	
}
