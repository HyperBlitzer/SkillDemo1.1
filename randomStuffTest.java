import static org.junit.Assert.*;
import org.junit.*;

public class randomStuffTest {
	@Test 
	public void testMultiplyNumbers(){
		assertEquals(9, randomStuff.multiplyNumbers(3,3));
	}
}
