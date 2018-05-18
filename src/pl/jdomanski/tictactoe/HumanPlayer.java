package pl.jdomanski.tictactoe;
import java.util.Scanner;

public class HumanPlayer extends Player {
	private Scanner input = new Scanner(System.in);
	
	public HumanPlayer( String name, char mark, Board board){
		super(name, mark, board);
		
	}
	
	@Override
	public void move() {
		int move =  -1;
		
		System.out.println("Ruszaj!");
		
		while (!board.isLegal(move)) {
			try {
				move = Integer.valueOf(input.nextLine());
				
			} catch( NumberFormatException e) {
				//move = null;
			}
			
			if (!board.isLegal(move) ) {
				System.out.println("Podaj w�a�ciwy numer");
			}
			
		}
		// check for exeptions
		board.setCell(move, mark);
		//input.close();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board board = new Board();
		HumanPlayer player = new HumanPlayer("Jarek", "x", board);
		System.out.println("Tw�j ruch: ");
		
		//do {
			player.move();
			System.out.println(board.toString());
		//} while(true);
		
		

	}

}
