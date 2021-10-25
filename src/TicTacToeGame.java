import java.util.Scanner;

public class TicTacToeGame {
	public static final char EMPTY= ' ';
	public static final char CHARACTER_X = 'X';
	public static final char CHARACTER_O = 'O';
	
	
	public static char[] createBoard() {
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
	
	public static void showBord(char[] ticTacToeBoard) {
	for(int rowIndex = 1; rowIndex<= 7; rowIndex +=3) {
		for(int cellIndex = rowIndex; cellIndex < rowIndex+3; cellIndex++) {
			System.out.print(ticTacToeBoard[cellIndex]);
			if(cellIndex % 3 !=0)
				System.out.print(" | ");
		}
		System.out.print("\n");
		
	}
	}
	
	public static int checkFree(char[] ticTacToeBoard, char chosenLetter, String currentPlayer) {
		Scanner takeInput = new Scanner(System.in);
		int moveIndex;
		boolean emptyStatus;
		do {
			System.out.println("Enter index to place letter " + chosenLetter + " for " + currentPlayer);
			moveIndex = takeInput.nextInt();
			if(ticTacToeBoard[moveIndex] == EMPTY) {
				emptyStatus = true;
				System.out.println("Index available");
			}
			else {
				emptyStatus = false;
				System.out.println("Index not available");
			}
		} while(emptyStatus == false);
		return moveIndex;
	}


	public static void main(String[] args) {
		

	}

}
