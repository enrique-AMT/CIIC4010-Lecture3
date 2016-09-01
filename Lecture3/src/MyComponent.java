import java.awt.Graphics;
import javax.swing.JComponent;

public class MyComponent extends JComponent {
	
	private static final long serialVersionUID = 1L;
	
	static int counter = 0;
	
	public void paintComponent (Graphics g) {
		
		MutableCar bottomRightCar = new MutableCar(getWidth()-60,getHeight()-30);
		
//		MutableCar topLeftCar = new MutableCar(0,0);
//		
//		MutableCar topRightCar = new MutableCar(getWidth()-60,0);
//		
//		MutableCar bottomLeftCar = new MutableCar(0,getHeight()-30);
		
		bottomRightCar.draw(g);
		bottomRightCar.setPosition(0,getHeight()-30);
		bottomRightCar.draw(g);
		
		bottomRightCar.setPosition(getWidth()-60,0);
		bottomRightCar.draw(g);
		
		bottomRightCar.setPosition(0,0);
		bottomRightCar.draw(g);
		
		System.out.println(counter++);
	}
}
