import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ChessBoard {
	private Player player1, player2;

	ChessBoard() {
		player1 = new Player("w");
		player2 = new Player("b");
	}

	public void updateLocation(String whiteMove, String blackMove) {

			player1.nextMove(whiteMove);

			if (whiteMove.contains("x")) {
				player2.setCapture(whiteMove);
			}
		
			player2.nextMove(blackMove);

			if (blackMove.contains("x")) {
				player1.setCapture(blackMove);
			}
		
	}

	 public  boolean isEndCondition(String condition)
	 {
		 if(condition.equals("1-0") || condition.equals("0-1") || condition.equals("1/2-1/2"))
		 {
			 return true;
		 }
		return false;
	 }
	 public  String gameResult(String condition)
	 {
		 if(condition.equals("1-0"))
		 { 
			 return "White win";
		 }
		 else if(condition.equals("0-1"))
		 {
			 return "Black win";
		 }
		 
		 return "Match Draw";
	 }
	 public void display() {
		System.out.println(" Player 1 pieces positions:: ");
		player1.display();
		System.out.println(" Player 2 pieces positions:: ");
		player2.display();
	}

	public static void main(String[] args) {

		ChessBoard gameBoard = new ChessBoard();
		BufferedReader br = null;

		try {
			String sCurrentLine;

			br = new BufferedReader(new FileReader("testing.txt"));

			while ((sCurrentLine = br.readLine()) != null) {

				String parts[] = sCurrentLine.split(" ");
			for (int i = 0; i < parts.length; i = i + 3) {
					if(gameBoard.isEndCondition(parts[i+1]))
					{
						System.out.println(gameBoard.gameResult(parts[i+1]));
					}
					else if(!gameBoard.isEndCondition(parts[i+1]) && !gameBoard.isEndCondition(parts[i+2]))
					{
						gameBoard.updateLocation(parts[i + 1], parts[i + 2]);
					}
					else if(!gameBoard.isEndCondition(parts[i+1]) && gameBoard.isEndCondition(parts[i+2]))
					{
						gameBoard.updateLocation(parts[i+1], "");
						System.out.println(gameBoard.gameResult(parts[i+2]));
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

		gameBoard.display();
	}
}
