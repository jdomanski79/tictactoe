package pl.jdomanski.tictactoe;

public abstract class Player {
	private String name;
	char marker;
	Board board;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

		Player(String name, char marker, Board board){
		this.name = name;
		this.marker = marker;
		this.board = board;
	}
	
	public char getMarker() {
		return marker;
	}

	public void setMarker (char marker) {
		this.marker = marker;
	}
	
	public abstract void move();
	/**
	 * Checks if board[move] is empty
	 * @param board
	 * @param int move
	 * @return boolean
	 */

	
	
}
