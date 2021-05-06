package boardgame;

public class Board {
	
	private int rowns;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rowns, int columns) {
		this.rowns = rowns;
		this.columns = columns;
		pieces = new Piece[rowns][columns];
	}

	public int getRowns() {
		return rowns;
	}

	public void setRowns(int rowns) {
		this.rowns = rowns;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public Piece piece(int rows, int columns){
		return pieces[rows][columns];
	}
	
	public Piece piece(Position positions) {
		return pieces[positions.getRow()][positions.getColumn()];
	}
	
}
