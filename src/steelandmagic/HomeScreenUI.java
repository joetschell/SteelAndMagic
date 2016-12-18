package steelandmagic;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HomeScreenUI {

	public void createAndShowGUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Steel and Magic");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		JPanel homeScreen = new JPanel();
		frame.getContentPane().add(homeScreen);
		homeScreen.setLayout(new BoxLayout(homeScreen, BoxLayout.Y_AXIS));
		homeScreen.setPreferredSize(new Dimension(1000, 450));
	}
}
