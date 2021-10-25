
public class TicTacToeGame {
	public static final char EMPTY= ' ';
	
	
	private static char[] createBoard() {
		char [] ticTacToeBoard = new char[10];
		for(int cellIndex = 1; cellIndex < ticTacToeBoard.length; cellIndex++) 
			ticTacToeBoard[cellIndex] = EMPTY;
		return ticTacToeBoard;
	}


	public static void main(String[] args) {
		

	}

}
