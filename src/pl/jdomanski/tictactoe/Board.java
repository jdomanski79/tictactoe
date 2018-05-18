package pl.jdomanski.tictactoe;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Board {
	private char[] grid = new char[9];
	private Map<String, Integer> letterToIndex = new HashMap<String, Integer>();
	
	public Board(){
		letterToIndex.put("a", 0);
		letterToIndex.put("b", 1);
		letterToIndex.put("c", 2);
		reset();
	}
	
	
	public void printBoard() {
		System.out.println("   A B C");
		System.out.printf("1 |%s|%s|%s|%n", grid[0], grid[1], grid[2]);
		System.out.printf("2 |%s|%s|%s|%n", grid[3], grid[4], grid[5]);
		System.out.printf("3 |%s|%s|%s|%n", grid[6], grid[7], grid[8]);
		System.out.println();
	}
	
	public boolean submitMove(String move, char player) {
		
		// take first sign and convert it to lowercase char
		char columnLetter = move.substring(0,1).toLowerCase().charAt(0);
		
		int columnIndex = (int) columnLetter - 97;
		int rowIndex = Integer.parseInt(move.substring(1));
		
		// check if indexes are valid
		if (columnIndex > 2 || rowIndex > 2) return false;
		
		
		if (grid[rowIndex * 3 + columnIndex] == " ".charAt(0) ) {
			grid[rowIndex * 3 + columnIndex] = player;
			return true;
		} else 
			return false;
	}
	
	public void reset() {
		for (int i = 0; i < grid.length; i++) {
			  grid[i] = " ".charAt(0);
		}
		
	}

	public boolean isWinner(char marker) {
		int winningCombination = marker + marker + marker; 
		// vertical lines
		return ( 
		//vertical lines
			(grid[0] + grid[3] + grid[6]) == winningCombination || 			
		    (grid[1] + grid[4] + grid[7]) == winningCombination ||
		 	(grid[2] + grid[5] + grid[8]) == winningCombination ||
		//horizontal
		 	(grid[0] + grid[1] + grid[2]) == winningCombination ||
		 	(grid[3] + grid[4] + grid[5]) == winningCombination ||
		 	(grid[6] + grid[7] + grid[8]) == winningCombination ||
		//cross 
		 	(grid[0] + grid[4] + grid[8]) == winningCombination ||
		 	(grid[2] + grid[4] + grid[6]) == winningCombination 
		 );
					
	}
//	
//	public boolean hasNextMove() {
//		if (possibleMoves.size() > 0) return true;
//		else return false;
//	}
	
	public static void main(String[] args) {
		Board board = new Board();
		board.printBoard();
		if (board.submitMove("C1", "x".charAt(0)))
			board.printBoard();
		else System.out.println("Poda inne dane!");
//		System.out.println(board.toString());
//		board.setCell(1,  "x");
//		board.setCell(2,  "x");
//		board.setCell(3,  "x");
//		System.out.println(board.toString());
//		System.out.println("won? " + board.winningState());
//		board.reset();
//		System.out.println(board.toString());
//		
//		System.out.println("Next move? "  + board.hasNextMove());
		

	}

}
