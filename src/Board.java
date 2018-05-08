import java.util.HashSet;
import java.util.Set;

public class Board {
	private int[] grid = new int[9];
	private Set<Integer> possibleMoves = new HashSet<>(); 
	
	public Set<Integer> getPossibleMoves() {
		return possibleMoves;
	}

	public Board(){
		reset();
	}
	
	public void setCell(int x, String mark) {
		if (mark.equalsIgnoreCase("x")) 
			grid[x] = 1;
		else if (mark.equalsIgnoreCase("o")) 
			grid[x] = -1;
		
		possibleMoves.remove(x);
	}
	
	public int getCell(int x) {
		return grid[x];
	}
	
	public void reset() {
		for (int i = 0; i < grid.length; i++) {
			  grid[i] = 0;
			  possibleMoves.add(i);
		}
		
	}
	
	public boolean isLegal(int move) {
		if (possibleMoves.contains(move)) return true;
		else return false;
	}
	
	@Override
	public String toString() {
		String str = "";
		int r = 0; // row index
		
		for (int i : grid) {
			switch(i) {
			case 1: 
				str+= "X";
				break;
			case -1: 
				str += "O";
				break;
			default:
				str += "-";
			};
			
			r++;
			
			if (r % 3 == 0)  //checking if end of line
				str += "\n";
		}
		return str;
	}
	
	public int winningState() {
		// vertical lines
		if ( Math.abs(grid[0] + grid[3] + grid[6]) == 3 ) return grid[0];			
		if ( Math.abs(grid[1] + grid[4] + grid[7]) == 3 ) return grid[1];
		if ( Math.abs(grid[2] + grid[5] + grid[8]) == 3 ) return grid[2];
		//horizontal
		if ( Math.abs(grid[0] + grid[1] + grid[2]) == 3 ) return grid[0];
		if ( Math.abs(grid[3] + grid[4] + grid[5]) == 3 ) return grid[3];
		if ( Math.abs(grid[6] + grid[7] + grid[8]) == 3 ) return grid[6];
		//cross 
		if ( Math.abs(grid[0] + grid[4] + grid[8]) == 3 ) return grid[0];
		if ( Math.abs(grid[2] + grid[4] + grid[6]) == 3 ) return grid[2];
				
		return 0;
					
	}
	
	public boolean hasNextMove() {
		if (possibleMoves.size() > 0) return true;
		else return false;
	}
	
	public static void main(String[] args) {
		Board board = new Board();
		
		System.out.println(board.toString());
		board.setCell(1,  "x");
		board.setCell(2,  "x");
		board.setCell(3,  "x");
		System.out.println(board.toString());
		System.out.println("won? " + board.winningState());
		board.reset();
		System.out.println(board.toString());
		
		System.out.println("Next move? "  + board.hasNextMove());
		

	}

}
