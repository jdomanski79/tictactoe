public abstract class Player {
	protected String name;
	protected String mark;
	protected Board board;
	
	
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
