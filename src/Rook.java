
public class Rook extends Pieces{
	
	Rook(Dimension initialDimension)
	{
		setPosition(initialDimension);
		setValid(true);
	}
	@Override
	public boolean movePossible(Dimension dstCoordinates) {
		
		
		if(Math.abs(dstCoordinates.getx()- getDimension().getx())>=1 && Math.abs(dstCoordinates.gety()- getDimension().gety())==0)
		{
			return true;
		}
		else if(Math.abs(dstCoordinates.gety()- getDimension().gety())>=1 && Math.abs(dstCoordinates.getx()- getDimension().getx())==0)
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
			setValid(false);
		}
	}

}
