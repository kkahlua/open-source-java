package hello;
import java.awt.*;
import javax.swing.*;

public class Quiz9 extends JFrame {
	public class CP extends JPanel {
		public CP() {
			setLayout(null);
			JLabel java = new JLabel("Java");
			java.setLocation (50, 100);
			java.setSize(50, 50);
			java.setForeground(Color.green);
			JLabel hello = new JLabel("Hello");
			hello.setLocation (100, 29);
			hello.setSize(50, 50);
			hello.setForeground(Color.blue);
			JLabel love = new JLabel("Love");
			love.setLocation (200, 150);
			love.setSize(50, 50);
			love.setForeground(Color.red);
			add(java);
			add(hello);
			add(love);
		}
	}
	public class NP extends JPanel {
		public NP() {
			setBackground(Color.BLACK);
			setLayout(new FlowLayout());
			add(new JButton("Open"));
			add(new JButton("Read"));
			add(new JButton("Close"));
		}
	}
	public Quiz9() {
		setTitle("Open Challenger 9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(new CP(),BorderLayout.CENTER);
		c.add(new NP(), BorderLayout.NORTH);
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Quiz9();
	}
}