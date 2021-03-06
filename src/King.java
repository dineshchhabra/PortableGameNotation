
public class King extends Pieces{

	King(Dimension initialDimension)
	{
		this.setPosition(initialDimension);
		this.setValid(true);
	}
	
	@Override
	public boolean movePossible(Dimension dstCoordinates) {
		// TODO Auto-generated method stub
		
		if(!this.getValid())
		{
			return false;
		}
		if(Math.abs(dstCoordinates.getx()-this.getDimension().getx())==1 && Math.abs(dstCoordinates.gety()-this.getDimension().gety())==1)
		{
			return true;
		}
		else if(Math.abs(dstCoordinates.getx()-this.getDimension().getx())==1 && Math.abs(dstCoordinates.gety()-this.getDimension().gety())==0)
		{
			return true;
		}
		else if(Math.abs(dstCoordinates.getx()-this.getDimension().getx())==0 && Math.abs(dstCoordinates.getx()-this.getDimension().gety())==1)
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
		// TODO Auto-generated method stub
		
		setDimension(dstCoordinates);
	}

	@Override
	public void setPosition(Dimension dstCoordinates) {
		// TODO Auto-generated method stub
		setDimension(dstCoordinates);
	}

	@Override
	public void captured(Dimension dstCoordinates) {
		// TODO Auto-generated method stub
		if(dstCoordinates.getx()==this.getDimension().getx() && dstCoordinates.gety()==this.getDimension().gety())
		{
			setValid(false);
		}
	}

	


}
