package pl.jdomanski.tictactoe;

import java.util.*;

public class App {
	
	public static void clearScreen() {  
	    for (int i = 0; i<=10;i++)
	    	System.out.println();
	} 
	
	
	public static void main(String[] args) {
		Board board = new Board();
		Players players = new Players(
				new HumanPlayer("jarek", "x", board),
				new RandomComputerPlayer("FDFD", "o", board));
		Player currentPlayer = null;
		
		
		System.out.println("Witaj! Zagrajmy!");
		
		do {
			clearScreen();
			System.out.println(board.toString());
			
			do {
				// get current player
				currentPlayer = players.nextPlayer();
				
				//display current player name
				System.out.println("Teraz kolej gracza " + currentPlayer.getName());
				
				// player move
				currentPlayer.move();
				
				//display board
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
