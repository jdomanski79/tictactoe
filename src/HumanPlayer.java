import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class HumanPlayer extends Player {
	private Scanner input = new Scanner(System.in);
	
	HumanPlayer( String name, String mark, Board board){
		super(name, mark, board);
		
	}
	
	@Override
	public void move() {
		Integer move =  null;
		
		System.out.println("Ruszaj!");
		
		while (move == null) {
			try {
				move = Integer.valueOf(input.nextLine());
				
				if (move < 0 || move > 8) 
					move = null;
				
			} catch( NumberFormatException e) {
				//move = null;
			}
			
			if (move == null ) {
				System.out.println("Podaj liczbê od 0 - 8");
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
		System.out.println("Twój ruch: ");
		
		//do {
			player.move();
			System.out.println(board.toString());
		//} while(true);
		
		

	}

}
