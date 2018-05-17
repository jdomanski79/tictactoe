package pl.jdomanski.tictactoe;

import java.util.ArrayDeque;
import java.util.Deque;

public class Players {
	private Deque<Player> players = new ArrayDeque<Player>();
	
	public Players(Player player1, Player player2) {
		players.add(player1);
		players.add(player2);
	}
	
	public Player nextPlayer() {
		Player nextPlayer = players.poll();
		players.add(nextPlayer);
		
		return nextPlayer;
	}
}
