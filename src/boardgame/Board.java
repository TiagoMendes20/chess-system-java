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
	
	
}
