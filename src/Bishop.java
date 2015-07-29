
public class Bishop extends Pieces {

	Bishop(Dimension initialDimension)
	{
		this.setPosition(initialDimension);
		this.setValid(true);
	}

	@Override
	public boolean movePossible(Dimension dstCoordinates) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void move(Dimension dstCoordinates) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void captured(Dimension dstCoordinates) {
		// TODO Auto-generated method stub
		
	}
}
