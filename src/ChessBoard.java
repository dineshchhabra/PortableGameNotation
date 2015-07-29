
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class ChessBoard {
	// private Player player1, player2;
	 
	 
	 public void updateLocation(String whiteMove, String blackMove) {
		 
	 }
	 
	 public static void main(String[] args){
		 BufferedReader br = null;
		 
			try {
	 
				String sCurrentLine;
	 
				br = new BufferedReader(new FileReader("/home/dinesh/PortableGameNotation/testing.txt"));
	 
				while ((sCurrentLine = br.readLine()) != null) {
					String[] parts = sCurrentLine.split(".");
					String blackWhiteMove[] = parts[1].split(" ");
					
					//System.out.println(blackWhiteMove);
				}
	 
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (br != null)br.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
	 }
}
