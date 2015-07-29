
public class Pawn extends Pieces{

	Pawn(Dimension initialDiemension)
	{
		this.setPosition(initialDiemension);
	}
	@Override
	public boolean movePosible(Dimension dstCoordinates) {
		// TODO Auto-generated method stub
		if(!this.getValid())
		{
			return false;
		}
		if(Math.abs(dstCoordinates.gety()-this.getDimension().gety()) == 1)
		{
			return true;
		}
		return false;
	}
	
	public boolean movePosible(Dimension dstCoordinates,boolean obstacle) {
		// TODO Auto-generated method stub
		if(!this.getValid())
		{
			return false;
		}
		if((Math.abs(dstCoordinates.gety()-this.getDimension().gety()) == 1) && !obstacle)
		{
			return true;
		}
		else if((Math.abs(dstCoordinates.gety()-this.getDimension().gety()) == 1) && (Math.abs(dstCoordinates.getx()-this.getDimension().getx()) == 1) && obstacle)
		{
			return true;
		}
		return false;
	}
	
	@Override
	public void move(Dimension dstCoordinates) {
		// TODO Auto-generated method stub
		
		this.setPosition(dstCoordinates);
		
	}

	@Override
	public void captured(Dimension dstCoordinates) {
		// TODO Auto-generated method stub
		this.setValid(false);
	}

}
