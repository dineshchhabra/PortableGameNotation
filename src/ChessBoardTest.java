import static org.junit.Assert.*;

import org.junit.Test;


public class ChessBoardTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		ChessBoard testObject = new ChessBoard();
		assertEquals(false,testObject.isEndCondition("O-O"));
		assertEquals(true,testObject.isEndCondition("1-0"));
		assertEquals(true,testObject.isEndCondition("0-1"));
		assertEquals(true,testObject.isEndCondition("1/2-1/2"));
	}

}
