
public class Player {
<<<<<<< HEAD
	private King king;
	private Queen queen;
	private Bishop bishops[];
	private Rook rooks[];
	private Knight knights[];
	private Pawn pawns[];

	public Player(char player){
		if (player == 'w'){
			king = new King("d1");
			queen = new Queen("e1");
			bishops = new Bishop[2];
			bishops[0] = new Bishop("c1");
			bishops[1] = new Bishop("f1");
			rooks = new Rook[2];
			rooks[0] = new Rook("a1");
			rooks[1] = new Rook("h1");
			knights = new Knight[2];
			knights[0] = new Knight("b1");
			knights[1] = new Knight("g1");
			pawns = new Pawn[8];
			pawns[0] = new Pawn("a2");
			pawns[1] = new Pawn("b2");
			pawns[2] = new Pawn("c2");
			pawns[3] = new Pawn("d2");
			pawns[4] = new Pawn("e2");
			pawns[5] = new Pawn("f2");
			pawns[6] = new Pawn("g2");
			pawns[7] = new Pawn("h2");
		}
		else{
			king = new King("d8");
			queen = new Queen("e8");
			bishops = new Bishop[2];
			bishops[0] = new Bishop("c8");
			bishops[1] = new Bishop("f8");
			rooks = new Rook[2];
			rooks[0] = new Rook("a8");
			rooks[1] = new Rook("h8");
			knights = new Knight[2];
			knights[0] = new Knight("b8");
			knights[1] = new Knight("g8");
			pawns = new Pawn[8];
			pawns[0] = new Pawn("a7");
			pawns[1] = new Pawn("b7");
			pawns[2] = new Pawn("c7");
			pawns[3] = new Pawn("d7");
			pawns[4] = new Pawn("e7");
			pawns[5] = new Pawn("f7");
			pawns[6] = new Pawn("g7");
			pawns[7] = new Pawn("h7");
		}
	}
	public void nextMove(String move){
		
	}
=======
<<<<<<< HEAD

=======
	King king Queen queen Bishop bishop[2] Rook rook[2] Knight knight[2]; Pawn pawn[8];

	  Constructor - Update initial position
	  nextMove( move)
>>>>>>> 2b0449ec19efa7fe644aec4050070bff540404a9
>>>>>>> origin/master
}
