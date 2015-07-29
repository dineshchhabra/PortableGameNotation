# PortableGameNotation
Class Design ---------------------------

class Dimension
	int x, y coordinates
	set()
	get()
	

class Pieces 
	  Dimension pos;
 	  virtual boolean movePosible(dstCoordinates) =0;
	  virtual void move(dstCoordinates)=0	
	  virtual void setPosition() =0		


classes - King, Rook, Bishop, Queen, Knight, Pawn extends Pieces	
	  Dimension pos;
 	  boolean movePosible(dstCoordinates)
	  void move(dstCoordinates)	
	  void setPosition() 		
	
 
class Player
      King king
      Queen queen
      Bishop bishop[2]
      Rook rook[2]
      Knight knight[2];
      Pawn pawn[8];
      
      Constructor - Update initial position
      nextMove( move)
      		
   
       	 
		

class chessboard
	Player player1, player2;
	updateLocation(texFilePath)
	
