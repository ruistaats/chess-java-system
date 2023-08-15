package boardgame;

public class Board {
	private int rows; // quantidade de linhas
	private int columns; // quantidade de colunas
	private Piece[][] pieces; // matriz de peças para tabuleiro
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
		// vai ser instanciada com a quantidade de linhas e colunas informadas na classe "chessMatch"
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	// icluindo metodos
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	// recria com sobrecarga do metodo anterior //usando "Position position"
	public Piece piece (Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	// Adicionando pecas ao tabuleiro
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()]= piece;
		piece.position = position;
	}
	
	
}
