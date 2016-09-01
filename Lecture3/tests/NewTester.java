import static org.junit.Assert.*;

import org.junit.Test;

public class NewTester {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSetLocation() {
		MutableCar theCar= new MutableCar(1.0,2.0,Color.BLUE);
		theCar.setPosition(3.0,  5.0);
		assertTrue("X Position incorrect", theCar.getXPos()==3.0);
		assertTrue("Y Position incorrect", theCar.getYPos()==5.0);
	}

}
