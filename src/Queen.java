
public class Queen extends Pieces{
	
	Queen(Dimension initialDimension)
	{
		this.setPosition(initialDimension);
		this.setValid(true);
	}
	@Override
	public boolean movePossible(Dimension dstCoordinates) {
		
		
		if(Math.abs(dstCoordinates.getx()-this.getDimension().getx())>=1 && Math.abs(dstCoordinates.gety()-this.getDimension().gety())==0)
		{
			return true;
		}
		else if(Math.abs(dstCoordinates.gety()-this.getDimension().gety())>=1 && Math.abs(dstCoordinates.getx()-this.getDimension().getx())==0)
		{
			return true;
		}
		else if(Math.abs(dstCoordinates.getx()-this.getDimension().getx())== Math.abs(dstCoordinates.gety()-this.getDimension().gety()))
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
		
		this.setDimension(dstCoordinates);
	}
	@Override
	 public void captured(Dimension dstCoordinates){
		if(this.getDimension().getx() == dstCoordinates.getx() && this.getDimension().gety() == dstCoordinates.gety()){
			this.setValid(false);
		}
	}
	

}
