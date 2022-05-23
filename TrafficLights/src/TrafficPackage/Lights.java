package TrafficPackage;
import java.awt.*;
import javax.swing.*;

public class Lights {
	public static void Draw() {
		JFrame window = new JFrame("Traffic Lights");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(150, 00);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setBackground(Color.BLACK);
		window.setVisible(true);
		window.add(panel);
	}
	public static void main(String[] args) {
		Draw();
	}
}
	
