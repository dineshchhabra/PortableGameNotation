
 abstract class Pieces {
	Dimension pos;

    public abstract boolean movePosible(Dimension dstCoordinates);
    public abstract void move(Dimension dstCoordinates);
    public abstract void setPosition(Dimension dstCoordinates);
}
