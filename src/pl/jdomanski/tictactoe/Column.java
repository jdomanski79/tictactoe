package pl.jdomanski.tictactoe;

public enum Column {
	A (0),
	B (1),
	C (2);
	
	private int index;
	
	private Column (int index) {
		this.index = index;
	}

	public int getIndex() {
		return index;
	}
}
