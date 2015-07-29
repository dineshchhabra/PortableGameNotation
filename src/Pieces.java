
 abstract class Pieces {
	private Dimension pos;

	private boolean valid;

	Pieces(){
		valid = true;
	}
	
    public abstract boolean movePosible(Dimension dstCoordinates);
    public abstract void move(Dimension dstCoordinates);
    public void setPosition(Dimension dstCoordinates)
    {
    	pos.set(dstCoordinates.getx(), dstCoordinates.gety());
    }
    public abstract void captured(Dimension dstCoordinates);
    public  boolean getValid()
    {
		return vaild;
    	
    }
    public void setValid(boolean valid)
    {
		this.vaild = valid;
    	
    }
    public Dimension getDimension()
    {
    	return this.pos;
    }
}
