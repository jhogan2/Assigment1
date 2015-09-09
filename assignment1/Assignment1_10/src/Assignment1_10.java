import javax.swing.JApplet;
import java.awt.Graphics;

public class Assignment1_10 extends JApplet {
	public void paint(Graphics canvas){
		canvas.fillOval(90, 90, 25, 25);
		canvas.drawOval(77, 75, 50, 50);
		canvas.drawArc(70, 25, 65, 50, 0, -180);
		canvas.drawArc(12, 75, 65, 50, 90, -180);
		canvas.drawArc(128, 74, 65, 50, 90, 180);
		canvas.drawArc(70, 125, 65, 50, 0, 180);
	}

}
