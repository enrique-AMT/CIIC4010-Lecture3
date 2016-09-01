import static org.junit.Assert.*;

import java.awt.color.*;

import org.junit.Test;

public class MutableCarTests {

	@Test
	
	public void testConstructor() {
		MutableCar theCar= new MutableCar(1.0,2.0, color.BLUE);
		theCar=null;
		assertNotNull("Reference is null", theCar);
		assertTrue("X Position incorrect", theCar.getXPos()==1.0);
	
	}

}
