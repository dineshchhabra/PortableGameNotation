public class Bishop extends Pieces{
	
	
	Bishop(Dimension initialDimension)
	{
		this.setPosition(initialDimension);
		this.setValid(true);
	}
	
	@Override
	public boolean movePossible(Dimension dstCoordinates) {
		
		
		if(Math.abs(dstCoordinates.getx()-this.getDimension().getx()) == Math.abs(dstCoordinates.gety()-this.getDimension().gety()))
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
		
		this.getDimension().set(dstCoordinates.getx(), dstCoordinates.gety());
		
	}

	@Override
	public void setPosition(Dimension dstCoordinates) {
		this.setPosition(dstCoordinates);
	}
	@Override
	 public void captured(Dimension dstCoordinates){
		if(this.getDimension().getx() == dstCoordinates.getx() && this.getDimension().gety() == dstCoordinates.gety()){
			this.setValid(false);
		}
	}

}
