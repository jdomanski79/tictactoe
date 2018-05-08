import java.util.*;

public class App {
	
	public static void clearScreen() {  
	    for (int i = 0; i<=10;i++)
	    	System.out.println();
	} 
	
	
	public static void main(String[] args) {
		Board board = new Board();
		Player player1 = new HumanPlayer("jarek", "x", board);
		Player player2 = new RandomComputerPlayer("FDFD", "o", board);
		
		System.out.println("Witaj " + player1.getName() + "! Zagrajmy!");
		
		do {
			clearScreen();
			System.out.println(board.toString());
			
			do {
				if (board.hasNextMove())
					player1.move();
				
				System.out.println(board.toString());
				
				if (board.hasNextMove())
					player2.move();
				
				System.out.println(board.toString());
					
			} while (board.hasNextMove());
			
			
			System.out.println(board.winningState());
			board.reset();
		} while (true);
		
	}
	
	private static boolean validInput(String in) {
		return (in.equalsIgnoreCase("X") || in.equalsIgnoreCase("o")); 
			
	}
	
	public static String wybierzZnacznik(Scanner input) {
		String choosen;
		System.out.println("Co wybierasz? X czy O?");
		
		do {
			choosen = input.nextLine();
			if (!validInput(choosen)) {
				System.out.println("Wybierz X lub O");
		
			}
		} while (!validInput(choosen));
		
		System.out.println("Œwietnie! Wybra³eœ " + choosen.toUpperCase());
		
		return choosen.toUpperCase();
	}

}
