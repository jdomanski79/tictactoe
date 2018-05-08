import java.util.Random;

public class RandomComputerPlayer extends Player {

	RandomComputerPlayer(String name, String mark, Board board) {
		super(name, mark, board);
	}

	@Override
	public void move() {
		Random r = new Random();
		Object[] possibleMoves = board.getPossibleMoves().toArray();
		
		int move = (int) possibleMoves[r.nextInt(possibleMoves.length)];
		
		board.setCell(move, mark);
	}

}
