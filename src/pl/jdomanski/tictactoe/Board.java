package pl.jdomanski.tictactoe;
import java.util.HashSet;
import java.util.Set;

public class Board {
	private Marker[] grid = new Marker[9];
	
	public Board(){
		reset();
	}
	
	
	public void printBoard() {
		System.out.println("   A B C");
		System.out.printf("1 |%s|%s|%s|%n", grid[0].getMarker(), grid[1].getMarker(), grid[2].getMarker());
		System.out.println("--------");
		System.out.printf("2 |%s|%s|%s|%n", grid[3].getMarker(), grid[4].getMarker(), grid[5].getMarker());
		System.out.println("--------");
		System.out.printf("3 |%s|%s|%s|%n", grid[6].getMarker(), grid[7].getMarker(), grid[8].getMarker());
		System.out.println();
	}
	
	public boolean submitMove(String move, char player) {
		Column column = null;
		
		for (Column col: Column.values()) {
			if (col.toString().equals(move.substring(0, 1))) {
				column = col;
			}
		}
		
		if (column == null) {
			System.out.println("Kolumna poza zakresem!");
			return false;
		}
		
		int columnIndex = column.getIndex();
		int rowIndex = Integer.parseInt(move.substring(1));
		
		System.out.printf("Column: %d, row: %d", columnIndex, rowIndex);
		
		if (grid[rowIndex * 3 + columnIndex] == Marker.EMPTY) {
			grid[rowIndex * 3 + columnIndex] = Marker.X;
			return true;
		} else return false;
	}
//	public void setCell(int x, String mark) {
//		if (mark.equalsIgnoreCase("x")) 
//			grid[x] = 1;
//		else if (mark.equalsIgnoreCase("o")) 
//			grid[x] = -1;
//		
//		possibleMoves.remove(x);
//	}
//	
//	public int getCell(int x) {
//		return grid[x];
//	}
//	
	public void reset() {
		for (int i = 0; i < grid.length; i++) {
			  grid[i] = Marker.EMPTY;
		}
		
	}
//	
//	public boolean isLegal(int move) {
//		if (possibleMoves.contains(move)) return true;
//		else return false;
//	}
//	
//	@Override
//	public String toString() {
//		String str = "";
//		int r = 0; // row index
//		
//		for (int i : grid) {
//			switch(i) {
//			case 1: 
//				str+= "X";
//				break;
//			case -1: 
//				str += "O";
//				break;
//			default:
//				str += "-";
//			};
//			
//			r++;
//			
//			if (r % 3 == 0)  //checking if end of line
//				str += "\n";
//		}
//		return str;
//	}
//	
//	public int winningState() {
//		// vertical lines
//		if ( Math.abs(grid[0] + grid[3] + grid[6]) == 3 ) return grid[0];			
//		if ( Math.abs(grid[1] + grid[4] + grid[7]) == 3 ) return grid[1];
//		if ( Math.abs(grid[2] + grid[5] + grid[8]) == 3 ) return grid[2];
//		//horizontal
//		if ( Math.abs(grid[0] + grid[1] + grid[2]) == 3 ) return grid[0];
//		if ( Math.abs(grid[3] + grid[4] + grid[5]) == 3 ) return grid[3];
//		if ( Math.abs(grid[6] + grid[7] + grid[8]) == 3 ) return grid[6];
//		//cross 
//		if ( Math.abs(grid[0] + grid[4] + grid[8]) == 3 ) return grid[0];
//		if ( Math.abs(grid[2] + grid[4] + grid[6]) == 3 ) return grid[2];
//				
//		return 0;
//					
//	}
//	
//	public boolean hasNextMove() {
//		if (possibleMoves.size() > 0) return true;
//		else return false;
//	}
	
	public static void main(String[] args) {
		Board board = new Board();
		board.printBoard();
		board.submitMove("A1", "x".charAt(0));
		board.printBoard();
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
