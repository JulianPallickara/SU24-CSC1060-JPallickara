
	public void main(String[] args) {
		char[][] board = new char[3][3];
		char count = '1';
		for(int col = 0; col < 3; col++) {
			for(int row = 0; row < 3; row++) {
				board[col][row] = Char.toString(count);
				count++;
				
			}
		}
		for (int col = 0; col < 3; col++) {
			for(int row = 0; row < 3; row++);
				System.out.print(board[col][col] + " ");
				count++;
		
		}
		System.out.println();
		

		String word = board[0][0] + board[0][1] + board [0][2];
	System.out.println(word);
		
}
	public static void drawBoard(String[][] b) {
		System.out.println(b[0][0] + " * " + b[0][1] + " * ");
		System.out.println(b[1][1] + " * " + b[1][2] + " * " + b[1][3]);
		System.out.println()
		
	}
}

//public class TicTacToe {
//	public static char[][] drawBoard(char[][]board) {
//		for (int col = 0; col < 3; col++) {
//			for(int row = 0; row < 3; row++);
//				System.out.print(board[col][col] + " ");
//				return board[][];
//	}	