
public class Player {

	private King king;
	private Queen queen;
	 Bishop bishops[];
	private Rook rooks[];
	private Knight knights[];
	private Pawn pawns[];
	private String playerName;
	
	

	public Player(String player){
		playerName = player;
		if (player == "w"){
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
	
	public void display()
	{
		if(king.getValid())
		{
			System.out.println(" King -> "+Character.toString((char)(king.getDimension().getx()+'a' - 1))+" - "+king.getDimension().gety());
		}
		else
		{
			System.out.println(" King Dead");

		}
		if(queen.getValid())
		{
			System.out.println(" Queen -> "+Character.toString((char)(queen.getDimension().getx()+'a' - 1))+" - "+queen.getDimension().gety());

		}
		else
		{
			System.out.println(" Queen  Dead");

		}
		int i=0;
		for(Bishop current: bishops)
		{
			if(current.getValid())
			{
				System.out.println(" Bishop"+i+" "+Character.toString((char)(current.getDimension().getx()+'a' - 1))+" - "+current.getDimension().gety());

			}
			else
			{
				System.out.println(" Bishop"+i+" Dead");

			}
			i++;
		}
		i=0;
		for(Rook current: rooks)
		{
			if(current.getValid())
			{
				System.out.println(" Rook"+i+" "+Character.toString((char)(current.getDimension().getx()+'a' - 1))+" - "+current.getDimension().gety());

			}
			else
			{
				System.out.println(" Rook"+i+" "+" Dead");

			}
			i++;
		}
		i=0;
		for(Knight current: knights)
		{
			if(current.getValid())
			{
				System.out.println(" Knight"+i+" "+Character.toString((char)(current.getDimension().getx()+'a' - 1))+" - "+current.getDimension().gety());

			}
			else
			{
				System.out.println(" Knight"+i+" Dead");

			}
			i++;
		}
		i=0;
		for(Pawn current: pawns)
		{
			if(current.getValid())
			{
				System.out.println(" Pawn"+i+" "+Character.toString((char)(current.getDimension().getx()+'a' - 1))+" - "+current.getDimension().gety());

			}
			else
			{
				System.out.println(" Pawn"+i+" Dead");

			}
			i++;
		}
	}
	
	public void setCapture(String playerMove)
	{
		String[] parts = playerMove.split("x");
		Dimension captureDimension = new Dimension(parts[1].charAt(0)-'a'+1, parts[1].charAt(1)-'1'+1);
		
		king.captured(captureDimension);
		queen.captured(captureDimension);
		for (Bishop bhops : bishops) {
			bhops.captured(captureDimension);
		}
		for (Rook rook : rooks) {
			rook.captured(captureDimension);
		}
		for (Knight knight : knights) {
			knight.captured(captureDimension);
		}
		for (Pawn pawn : pawns) {
			pawn.captured(captureDimension);
		}
	}
	public void nextMove(String playerMove){
			
		if(playerMove.equals("O-O")) {
			if ( playerName.equals("w")) {
				king.move(new Dimension(7,1));
				rooks[1].move(new Dimension(6,1));
			} else {
				king.move(new Dimension(7,8));
				rooks[1].move(new Dimension(6,8));
			}
			return;
		}

		if(playerMove.equals("O-O-O")) {
			if ( playerName.equals("w")) {
				king.move(new Dimension(3,1));
				rooks[0].move(new Dimension(4,1));
			} else {
				king.move(new Dimension(3,8));
				rooks[0].move(new Dimension(4,8));
			}
			return;
		}
	
		if(!Character.isUpperCase(playerMove.charAt(0))){
			playerMove = "P" + playerMove;
		}
		char piece = playerMove.charAt(0);
		String position;
		int indexOfX = playerMove.indexOf('x');
		if(indexOfX == -1){
			if(playerMove.length() >= 4){
				position = playerMove.substring(2, 4);
			}
			else{
				position = playerMove.substring(1, 3);
			}
		}
		else{
			position = playerMove.substring(indexOfX+1,indexOfX+3);
		}
		Dimension newPosition = new Dimension(position.charAt(0)-'a'+1,position.charAt(1)-'1'+1);

		Dimension currentPosition = null;
		if(indexOfX != 1 && playerMove.length() >=4){
			char rowOrColumn = playerMove.charAt(1);
						
			if(Character.isAlphabetic(rowOrColumn)){
				currentPosition = new Dimension(rowOrColumn - 'a'+ 1, -1);
			}
			else{
				currentPosition = new Dimension(-1, rowOrColumn - 'a'+ 1);
			}
		}
		
		if(piece == 'P'){
			if(currentPosition != null){
				for(Pawn pawn : pawns){
					if(pawn.getDimension().getx() == currentPosition.getx() || pawn.getDimension().gety() == currentPosition.gety()){
						pawn.move(newPosition);
						break;
					}
				}
			}
			else{
				for(Pawn pawn : pawns){
					if(pawn.movePossible(newPosition)){
						
						pawn.move(newPosition);
						break;
					}
				}
				
			}
			
		}
		if(piece == 'N'){
			if(currentPosition != null){
				for(Knight knight : knights){
					if(knight.getDimension().getx() == currentPosition.getx() || knight.getDimension().gety() == currentPosition.gety()){
						knight.move(newPosition);
						break;
					}
				}
				
			}
			else{
				for(Knight knight : knights){
					if(knight.movePossible(newPosition)){
						knight.move(newPosition);
						break;
					}
				}
				
			}
			
		}
		if(piece == 'K'){
			if(king.movePossible(newPosition)){
				king.move(newPosition);
			}
			
		}
		if(piece == 'Q'){
			if(queen.movePossible(newPosition)){
				queen.move(newPosition);
			}
		}
		if(piece == 'B'){
			if(currentPosition != null){
				for(Bishop bishop : bishops){
					if(bishop.getDimension().getx() == currentPosition.getx() || bishop.getDimension().gety() == currentPosition.gety()){
						bishop.move(newPosition);
						break;
					}
				}
			}
			else{
				for(Bishop bishop : bishops){
					if(bishop.movePossible(newPosition)){
						bishop.move(newPosition);
						break;
					}
				}
			}
		}
		if(piece == 'R'){
			if(currentPosition != null){
				for(Rook rook : rooks){
					if(rook.getDimension().getx() == currentPosition.getx() || rook.getDimension().gety() == currentPosition.gety()){
						rook.move(newPosition);
						break;
					}
				}
				
			}
			else{
				for(Rook rook : rooks){
					if(rook.movePossible(newPosition)){
						rook.move(newPosition);
						break;
					}
				}
				
			}
		}
		
	
			
		
	}

}
