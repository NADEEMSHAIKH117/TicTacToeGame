
public class TicTacToeGame {
	public static final char EMPTY= ' ';
	public static final char CHARACTER_X = 'X';
	public static final char CHARACTER_O = 'O';
	
	
	private static char[] createBoard() {
		char [] ticTacToeBoard = new char[10];
		for(int cellIndex = 1; cellIndex < ticTacToeBoard.length; cellIndex++) 
			ticTacToeBoard[cellIndex] = EMPTY;
		return ticTacToeBoard;
	}
	
	public static char selectLetter(char playerLetter) {
		char computerLetter;
		if(playerLetter == CHARACTER_X)
			computerLetter = CHARACTER_O;
		else
			computerLetter = CHARACTER_X;
		return computerLetter;
	}


	public static void main(String[] args) {
		

	}

}
