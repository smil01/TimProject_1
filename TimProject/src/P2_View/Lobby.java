package P2_View;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.CardLayout;
import java.awt.Color;

public class Lobby extends JPanel {

	/**
	 * Create the panel.
	 */
	public Lobby() {
		setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, "name_858723623119300");
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(23, 35, 51));
		panel_1.setBounds(0, 0, 339, 900);
		panel.add(panel_1);

	}
}
