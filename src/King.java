
public class King extends Pieces{

	@Override
	public boolean movePosible(Dimension dstCoordinates) {
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
		
		this.getDimension().set(dstCoordinates.getx(), dstCoordinates.gety());
		
	}

	@Override
	public void setPosition(Dimension dstCoordinates) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void captured(Dimension dstCoordinates) {
		// TODO Auto-generated method stub
		if(dstCoordinates.getx()==this.getDimension().getx() && dstCoordinates.gety()==this.getDimension().gety())
		{
			this.setValid(false);
		}
	}

	


}
