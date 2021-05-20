package TicTacToeGame;

import java.util.Scanner;

public class TicTacToeGame {

	public static void main(String[] args) {

		System.out.println("Welcome to Tic-Tac-Toe Game !!!");
		
		board();
		getUserChoice();

	}
	
	public static void board() {
		
		char board[] = new char[10];
		
		for(int i=0; i<=10; i++) {
			board[i] = ' ';
	     }
		
	}
	
	public static void getUserChoice() {
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please choose from X or O");
		
		char userChoice = userInput.next().charAt(0);
		char compChoice;
		if (userChoice == 'X')
			compChoice = 'O';
		else
			compChoice = 'X';
		
		System.out.println("User is: " + userChoice + "computer is" + compChoice);
	}
	
	

}
