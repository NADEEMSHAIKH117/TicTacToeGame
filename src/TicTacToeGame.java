
import java.util.Scanner;

enum PlayerNames{
	PLAYER, COMPUTER
}

public class TicTacToeGame {
	private static final char EMPTY = ' ';
	private static final char CHARACTER_X = 'X';
	private static final char CHARACTER_O = 'O';
	private static final int HEADS = 0;

	/**
	 * uc1
	 * @return
	 */
	private static char[] createBoard() {
		char [] ticTacToeBoard = new char[10];
		for(int cellIndex = 1; cellIndex < ticTacToeBoard.length; cellIndex++) 
			ticTacToeBoard[cellIndex] = EMPTY;
		return ticTacToeBoard;
	}

	/**
	 * uc2
	 * @param playerLetter
	 * @return
	 */
	private static char selectLetter(char playerLetter) {
		char computerLetter;
		if(playerLetter == CHARACTER_X)
			computerLetter = CHARACTER_O;
		else
			computerLetter = CHARACTER_X;
		return computerLetter;
	}

	/**
	 * uc3
	 * @param ticTacToeBoard
	 */
	private static void showBoard(char[] ticTacToeBoard) {
		for(int rowIndex = 1; rowIndex <= 7; rowIndex += 3) {
			for(int cellIndex = rowIndex; cellIndex < rowIndex + 3; cellIndex++) {
				System.out.print(ticTacToeBoard[cellIndex]);
				if(cellIndex % 3 != 0)
					System.out.print(" | ");
			}
			System.out.print("\n");
		}
	}

	/**
	 * uc4
	 * @param ticTacToeBoard
	 * @param moveIndex
	 * @return
	 */
	private static int checkFree(char[] ticTacToeBoard, char chosenLetter, String currentPlayer) {
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

	/**
	 * uc5
	 * @param ticTacToeBoard
	 * @param playerLetter
	 * @param moveIndex
	 */
	private static void makeMove(char[] ticTacToeBoard, char playerLetter, int moveIndex) {
		ticTacToeBoard[moveIndex] = playerLetter;
	}
	
	
	public static void main(String[] args) {
		
		

	}

}


