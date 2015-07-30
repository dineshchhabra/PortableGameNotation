public class Bishop extends Pieces{
	
	
	Bishop(Dimension initialDimension)
	{
		setPosition(initialDimension);
		setValid(true);
	}
	
	@Override
	public boolean movePossible(Dimension dstCoordinates) {
		
		if(Math.abs(dstCoordinates.getx()-getDimension().getx()) == Math.abs(dstCoordinates.gety()-getDimension().gety()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public void move(Dimension dstCoordinates) {
		
		getDimension().set(dstCoordinates.getx(), dstCoordinates.gety());
		
	}

	@Override
	public void setPosition(Dimension dstCoordinates) {
		setDimension(dstCoordinates);
	}
	@Override
	 public void captured(Dimension dstCoordinates){
		if(getDimension().getx() == dstCoordinates.getx() && getDimension().gety() == dstCoordinates.gety()){
			this.setValid(false);
		}
	}

}
