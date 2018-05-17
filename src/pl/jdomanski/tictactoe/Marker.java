package pl.jdomanski.tictactoe;

public enum Marker {
	X("X", 1),
	O("O", -1),
	EMPTY("-", 0);

	private String marker;
	private int value;

	private Marker(String marker, int value) {
		this.marker = marker;
		this.value = value;
		// TODO Auto-generated constructor stub
	}

	public String getMarker() {
		return marker;
	}

	public int getValue() {
		return value;
	}
	
}
