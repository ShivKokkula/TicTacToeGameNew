package TicTacToeGameNew;

public class TicTacToeGameNew {
	
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

}
