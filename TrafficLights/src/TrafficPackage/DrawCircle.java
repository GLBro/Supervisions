package TrafficPackage;
import java.awt.*;
import javax.swing.*;
public class DrawCircle extends JPanel {
	public void paint(Graphics g){
		g.setColor(Color.RED);
		g.drawOval(25, 0, 100, 100);  
		g.setColor(Color.YELLOW);
		g.drawOval(25, 100, 100, 100);  
		g.setColor(Color.GREEN);
		g.drawOval(25, 200, 100, 100);  
	 }
	public static void main(String[] args) {
	    JFrame f = new JFrame("Draw a circle");
	    f.getContentPane().add(new DrawCircle());
	    f.setSize(150, 300);
	    f.setVisible(true);
	    f.setResizable(false);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
	