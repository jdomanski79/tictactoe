package pl.jdomanski.tictactoe;

public abstract class Player {
	private String name;
	String mark;
	Board board;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	Player(String name, String mark, Board board){
		this.name = name;
		this.mark = mark;
		this.board = board;
	}
	
	public abstract void move();
	/**
	 * Checks if board[move] is empty
	 * @param board
	 * @param int move
	 * @return boolean
	 */
	
}
