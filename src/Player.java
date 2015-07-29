
public class Player {

	private King king;
	private Queen queen;
	private Bishop bishops[];
	private Rook rooks[];
	private Knight knights[];
	private Pawn pawns[];

	public Player(char player){
		if (player == 'w'){
			king = new King(new Dimension('d' - 'a' +1,1));
			queen = new Queen(new Dimension('e' - 'a' +1,1));
			bishops = new Bishop[2];
			bishops[0] = new Bishop(new Dimension('c' - 'a' +1,1));
			bishops[1] = new Bishop(new Dimension('f' - 'a' +1,1));
			rooks = new Rook[2];
			rooks[0] = new Rook(new Dimension('a' - 'a' +1,1));
			rooks[1] = new Rook(new Dimension('h' - 'a' +1,1));
			knights = new Knight[2];
			knights[0] = new Knight(new Dimension('b' - 'a' +1,1));
			knights[1] = new Knight(new Dimension('g' - 'a' +1,1));
			pawns = new Pawn[8];
			pawns[0] = new Pawn(new Dimension('a' - 'a' +1,2));
			pawns[1] = new Pawn(new Dimension('b' - 'a' +1,2));
			pawns[2] = new Pawn(new Dimension('c' - 'a' +1,2));
			pawns[3] = new Pawn(new Dimension('d' - 'a' +1,2));
			pawns[4] = new Pawn(new Dimension('e' - 'a' +1,2));
			pawns[5] = new Pawn(new Dimension('f' - 'a' +1,2));
			pawns[6] = new Pawn(new Dimension('g' - 'a' +1,2));
			pawns[7] = new Pawn(new Dimension('h' - 'a' +1,2));
		}
		else{
			king = new King(new Dimension('d' - 'a' +1,8));
			queen = new Queen(new Dimension('e' - 'a' +1,8));
			bishops = new Bishop[2];
			bishops[0] = new Bishop(new Dimension('c' - 'a' +1,8));
			bishops[1] = new Bishop(new Dimension('f' - 'a' +1,8));
			rooks = new Rook[2];
			rooks[0] = new Rook(new Dimension('a' - 'a' +1,8));
			rooks[1] = new Rook(new Dimension('h' - 'a' +1,8));
			knights = new Knight[2];
			knights[0] = new Knight(new Dimension('b' - 'a' +1,8));
			knights[1] = new Knight(new Dimension('g' - 'a' +1,8));
			pawns = new Pawn[8];
			pawns[0] = new Pawn(new Dimension('a' - 'a' +1,7));
			pawns[1] = new Pawn(new Dimension('b' - 'a' +1,7));
			pawns[2] = new Pawn(new Dimension('c' - 'a' +1,7));
			pawns[3] = new Pawn(new Dimension('d' - 'a' +1,7));
			pawns[4] = new Pawn(new Dimension('e' - 'a' +1,7));
			pawns[5] = new Pawn(new Dimension('f' - 'a' +1,7));
			pawns[6] = new Pawn(new Dimension('g' - 'a' +1,7));
			pawns[7] = new Pawn(new Dimension('h' - 'a' +1,7));
		}
	}
	public void nextMove(String move){
		//char piece = 'p';
		//if(Character.isUpperCase(move.charAt(0))){
		char piece = move.charAt(0);
		String position;
		int indexOfX = move.indexOf('x');
		if(indexOfX == -1){
			position = move.substring(1, 2);
		}
		else{
			position = move.substring(indexOfX+1,indexOfX+2);
		}
		if(piece == 'P'){
			for(int i=0;i<pawns.length;i++){
				if(pawns[i].movePossible(position)){
					pawns[i].move(position);
					break;
				}
			}
		}
		if(piece == 'N'){
			for(int i=0;i<knights.length;i++){
				if(knights[i].movePossible(position)){
					knights[i].move(position);
					break;
				}
			}
		}
		if(piece == 'K'){
			king.move(position);
		}
		if(piece == 'Q'){
			queen.move(position);
		}
		if(piece == 'B'){
			for(int i=0;i<bishops.length;i++){
				if(bishops[i].movePossible(position)){
					bishops[i].move(position);
					break;
				}
			}
		}
		if(piece == 'R'){
			for(int i=0;i<rooks.length;i++){
				if(rooks[i].movePossible(position)){
					rooks[i].move(position);
					break;
				}
			}
		}
		//}
			
		
	}

}
