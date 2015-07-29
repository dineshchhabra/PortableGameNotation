
 abstract class Pieces {
	private Dimension pos;
	private boolean valid;

	Pieces(){
		valid = true;
	}
	
    public abstract boolean movePosible(Dimension dstCoordinates);
    public abstract void move(Dimension dstCoordinates);
    public abstract void setPosition(Dimension dstCoordinates);
    public abstract void captured(Dimension dstCoordinates);
}
