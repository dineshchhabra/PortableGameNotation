
public class King extends Pieces{

	@Override
	public boolean movePosible(Dimension dstCoordinates) {
		// TODO Auto-generated method stub
		
		if(Math.abs(dstCoordinates.getx()-this.pos.getx())==1 && Math.abs(dstCoordinates.getx()-this.pos.getx())==1)
		{
			return true;
		}
		else if(Math.abs(dstCoordinates.getx()-this.pos.getx())==1 && Math.abs(dstCoordinates.getx()-this.pos.getx())==0)
		{
			return true;
		}
		else if(Math.abs(dstCoordinates.getx()-this.pos.getx())==0 && Math.abs(dstCoordinates.getx()-this.pos.getx())==1)
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
		
		this.pos.set(dstCoordinates.getx(), dstCoordinates.gety());
		
	}

	@Override
	public void setPosition(Dimension dstCoordinates) {
		// TODO Auto-generated method stub
		
	}


}
