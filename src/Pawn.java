
public class Pawn extends Pieces{

	int stepCount;
	Pawn(Dimension initialDiemension)
	{
		this.setPosition(initialDiemension);
		stepCount=0;
	}
	@Override
	public boolean movePossible(Dimension dstCoordinates) {
		
		// TODO Auto-generated method stub
		//System.out.println(" Possible-> "+this.getValid()+" "+dstCoordinates.getx());
		if(!this.getValid())
		{
			return false;
		}

		if(stepCount==0 && Math.abs(dstCoordinates.gety()-this.getDimension().gety()) == 2 && dstCoordinates.getx() == this.getDimension().getx())

		{
			stepCount++;
			return true;
		}
		if(Math.abs(dstCoordinates.gety()-this.getDimension().gety()) == 1 && dstCoordinates.getx() == this.getDimension().getx())
		{
			stepCount++;
			return true;
		}
		
		return false;
	}
	
	public boolean movePossible(Dimension dstCoordinates,boolean obstacle) {
		// TODO Auto-generated method stub
		if(!this.getValid())
		{
			return false;
		}
		if(stepCount==0 && Math.abs(dstCoordinates.gety()-this.getDimension().gety()) == 2)
		{
			return true;
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
		this.getDimension().set(dstCoordinates.getx(),dstCoordinates.gety());
		
	}

	@Override
	public void setPosition(Dimension dstCoordinates) {
		
		this.setDimension(dstCoordinates);
	}
	
	@Override
	public void captured(Dimension dstCoordinates) {
		// TODO Auto-generated method stub
		if(this.getDimension().getx()==dstCoordinates.getx() && this.getDimension().gety()==dstCoordinates.gety())
		{
			this.setValid(false);
		}
		
	}

}
