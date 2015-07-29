
 abstract class Pieces {
	private Dimension pos;

	private boolean valid;

	Pieces(){
		valid = true;
	}
	
    public abstract boolean movePossible(Dimension dstCoordinates);
    public abstract void move(Dimension dstCoordinates);
    public void setPosition(Dimension dstCoordinates)
    {
    	pos.set(dstCoordinates.getx(), dstCoordinates.gety());
    }
    public abstract void captured(Dimension dstCoordinates);
    public  boolean getValid()
    {
		return valid;
    	
    }
    public void setValid(boolean valid)
    {
		this.valid = valid;
    	
    }
    public Dimension getDimension()
    {
    	return this.pos;
    }
}
