import java.awt.Graphics;
import javax.swing.JComponent;

public class MyComponent extends JComponent {
	
	private static final long serialVersionUID = 1L;
	
	static int counter = 0;
	
	public void paintComponent (Graphics g) {
		
		Car bottomRightCar = new Car(getWidth()-60,getHeight()-30);
		
		Car topLeftCar = new Car(0,0);
		
		Car topRightCar = new Car(getWidth()-60,0);
		
		Car bottomLeftCar = new Car(0,getHeight()-30);
		
		bottomRightCar.draw(g);
		bottomLeftCar.draw(g);
		topRightCar.draw(g);
		topLeftCar.draw(g);
		
		
		System.out.println(counter++);
	}
}
