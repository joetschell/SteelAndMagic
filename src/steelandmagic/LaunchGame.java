package steelandmagic;
import steelandmagic.HomeScreenUI;

public class LaunchGame {
	public static void main(String[] args) {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				HomeScreenUI HSUI = new HomeScreenUI(); //createAndShowGUI();
				HSUI.createAndShowGUI();
			}
		});

	}

}
