package P2_View;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Cursor;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Btn4_Button1 extends JPanel implements FocusListener {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Create the panel.
	 */
	public Btn4_Button1() {
		setLayout(new CardLayout(0, 0));

		JPanel Lobby_Panel = new JPanel();
		add(Lobby_Panel, "name_858723623119300");
		Lobby_Panel.setLayout(null);

		JPanel LeftLobbyPanel = new JPanel();
		LeftLobbyPanel.setBackground(new Color(41, 57, 80));
		LeftLobbyPanel.setBounds(0, 0, 280, 900);
		Lobby_Panel.add(LeftLobbyPanel);
		LeftLobbyPanel.setLayout(null);

		JPanel ProgramNamePanel = new JPanel();
		ProgramNamePanel.setBackground(new Color(41, 57, 80));
		ProgramNamePanel.setBounds(0, 0, 280, 34);
		LeftLobbyPanel.add(ProgramNamePanel);
		ProgramNamePanel.setLayout(new CardLayout(0, 0));

		JLabel lbl_program_name = new JLabel(
				"\uC720\uC18C\uB144\uCD95\uAD6C \uC131\uC7A5\uAD00\uB9AC \uD504\uB85C\uADF8\uB7A8");
		lbl_program_name.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_program_name.setFont(new Font("°í¾çÃ¼", Font.PLAIN, 20));
		lbl_program_name.setForeground(new Color(255, 255, 255));
		ProgramNamePanel.add(lbl_program_name, "name_53851796879200");
		
		JPanel ProfilePanel = new JPanel();
		ProfilePanel.setBackground(new Color(71, 120, 197));
		ProfilePanel.setBounds(0, 158, 280, 100);
		LeftLobbyPanel.add(ProfilePanel);
		ProfilePanel.setLayout(null);

		JPanel Profile_ImagePanel = new JPanel();
		Profile_ImagePanel.setBackground(new Color(84, 125, 206));
		Profile_ImagePanel.setBounds(0, 0, 100, 100);
		ProfilePanel.add(Profile_ImagePanel);
		Profile_ImagePanel.setLayout(new CardLayout(0, 0));

		JLabel lbl_profileImg = new JLabel("\uD504\uB85C\uD544\uC0AC\uC9C4");
		lbl_profileImg.setHorizontalAlignment(SwingConstants.CENTER);
		Profile_ImagePanel.add(lbl_profileImg, "name_54594167799700");

		JPanel Profile_Nickname = new JPanel();
		Profile_Nickname.setBackground(new Color(84, 125, 206));
		Profile_Nickname.setBounds(100, 0, 180, 100);
		ProfilePanel.add(Profile_Nickname);
		Profile_Nickname.setLayout(null);

		JLabel label_1 = new JLabel("\uB2C9\uB124\uC784");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("KBIZÇÑ¸¶À½°íµñ B", Font.PLAIN, 16));
		label_1.setBounds(30, 38, 100, 25);
		Profile_Nickname.add(label_1);
		
		JPanel btn_1 = new JPanel();
		btn_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_1.setBackground(new Color(41, 57, 80));
		btn_1.setBounds(0, 361, 300, 80);
		LeftLobbyPanel.add(btn_1);
		btn_1.setLayout(null);
		
		JLabel lbl_btn1 = new JLabel("\uC120\uC218\uAD00\uB9AC");
		lbl_btn1.setBounds(87, 30, 87, 24);
		lbl_btn1.setFont(new Font("KBIZÇÑ¸¶À½°íµñ H", Font.PLAIN, 20));
		lbl_btn1.setForeground(new Color(255, 255, 255));
		btn_1.add(lbl_btn1);
		
		JPanel ExitPanel = new JPanel();
		ExitPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ExitPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		ExitPanel.setBackground(new Color(41, 57, 80));
		ExitPanel.setBounds(0, 820, 300, 80);
		LeftLobbyPanel.add(ExitPanel);
		ExitPanel.setLayout(null);
		
		JPanel ExitIconPanel = new JPanel();
		ExitIconPanel.setBackground(new Color(41, 57, 80));
		ExitIconPanel.setBounds(0, 0, 76, 80);
		ExitPanel.add(ExitIconPanel);
		ExitIconPanel.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(Btn4_Button1.class.getResource("/P5_Img/icons8_exit_32px.png")));
		ExitIconPanel.add(lblNewLabel_1, "name_58332631504300");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(41, 57, 80));
		panel_1.setBounds(74, 0, 226, 80);
		ExitPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("\uB098\uAC00\uAE30");
		lblNewLabel_2.setBounds(0, 10, 111, 60);
		lblNewLabel_2.setFont(new Font("KBIZÇÑ¸¶À½°íµñ B", Font.BOLD, 20));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_2);
		
		JPanel SearchPanel = new JPanel();
		SearchPanel.setBackground(new Color(41,57,80));
		SearchPanel.setBounds(0, 59, 300, 54);
		LeftLobbyPanel.add(SearchPanel);
		SearchPanel.setLayout(null);
		
		JPanel SearchIconPanel = new JPanel();
		SearchIconPanel.setBounds(12, 10, 32, 32);
		SearchIconPanel.setBackground(new Color(41,57,80));
		SearchPanel.add(SearchIconPanel);
		SearchIconPanel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 32, 32);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(Btn4_Button1.class.getResource("/P5_Img/icons8_search_32px.png")));
		
		SearchIconPanel.add(label);
		
		JPanel SearchTxtPanel = new JPanel();
		SearchTxtPanel.setBounds(46, 0, 254, 68);
		SearchTxtPanel.setBackground(new Color(41,57,80));
		SearchPanel.add(SearchTxtPanel);
		SearchTxtPanel.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("KBIZÇÑ¸¶À½°íµñ B", Font.PLAIN, 14));
		textField.setForeground(new Color(255, 255, 255));
		textField.setBorder(null);
		textField.setBackground(new Color(41, 57, 80));
		textField.setBounds(12, 10, 210, 28);
		SearchTxtPanel.add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 255, 255));
		separator.setBounds(12, 49, 210, 2);
		SearchTxtPanel.add(separator);
		
		JPanel btn_2 = new JPanel();
		btn_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_2.setLayout(null);
		btn_2.setBackground(new Color(41, 57, 80));
		btn_2.setBounds(0, 439, 300, 80);
		LeftLobbyPanel.add(btn_2);
		
		JLabel lbl_btn2 = new JLabel("\uAD6C\uB2E8\uAD00\uB9AC");
		lbl_btn2.setForeground(Color.WHITE);
		lbl_btn2.setFont(new Font("KBIZÇÑ¸¶À½°íµñ H", Font.PLAIN, 20));
		lbl_btn2.setBounds(87, 30, 87, 24);
		btn_2.add(lbl_btn2);
		
		JPanel btn_3 = new JPanel();
		btn_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_3.setLayout(null);
		btn_3.setBackground(new Color(41, 57, 80));
		btn_3.setBounds(0, 517, 300, 80);
		LeftLobbyPanel.add(btn_3);
		
		JLabel lbl_btn3 = new JLabel("\uC774\uC801\uAD00\uB9AC");
		lbl_btn3.setForeground(Color.WHITE);
		lbl_btn3.setFont(new Font("KBIZÇÑ¸¶À½°íµñ H", Font.PLAIN, 20));
		lbl_btn3.setBounds(87, 30, 87, 24);
		btn_3.add(lbl_btn3);
		
		JPanel btn4 = new JPanel();
		btn4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn4.setLayout(null);
		btn4.setBackground(new Color(255,255,255,20));
		btn4.setBounds(0, 595, 300, 80);
		LeftLobbyPanel.add(btn4);
		
		JLabel lbl_btn4 = new JLabel("\uAC1C\uC778\uC124\uC815");
		lbl_btn4.setForeground(Color.WHITE);
		lbl_btn4.setFont(new Font("KBIZÇÑ¸¶À½°íµñ H", Font.PLAIN, 20));
		lbl_btn4.setBounds(87, 30, 87, 24);
		btn4.add(lbl_btn4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 5, 80);
		btn4.add(panel_2);
		panel_2.setBackground(Color.WHITE);
		
		JPanel GudanPanel = new JPanel();
		GudanPanel.setBackground(new Color(71, 120, 197));
		GudanPanel.setBounds(280, 0, 1320, 105);
		Lobby_Panel.add(GudanPanel);
		GudanPanel.setLayout(null);
		
		JPanel LogoPanel = new JPanel();
		LogoPanel.setBackground(new Color(71, 120, 197));
		LogoPanel.setBounds(42, 0, 111, 105);
		GudanPanel.add(LogoPanel);
		LogoPanel.setLayout(new CardLayout(0, 0));
		
		JLabel lbl_logo = new JLabel("");
		lbl_logo.setIcon(new ImageIcon(Btn4_Button1.class.getResource("/P5_Img/icons8_uefa_euro_trophy_64px.png")));
		lbl_logo.setHorizontalAlignment(SwingConstants.CENTER);
		LogoPanel.add(lbl_logo, "name_60328911748400");
		
		JPanel GudanName = new JPanel();
		GudanName.setBackground(new Color(71, 120, 197));
		GudanName.setBounds(153, 0, 118, 105);
		GudanPanel.add(GudanName);
		GudanName.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC6CC\uB9AC\uC5B4\uC988");
		lblNewLabel.setBounds(0, 31, 146, 34);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("KBIZÇÑ¸¶À½°íµñ H", Font.PLAIN, 25));
		GudanName.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(280, 104, 1320, 796);
		Lobby_Panel.add(panel_3);
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(255, 255, 255));
		
		textField_1 = new JTextField();
		textField_1.setText("");
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBackground(new Color(23, 35, 51));
		textField_1.setBounds(0, 0, 0, 0);
		panel_3.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("\uC774\uBA54\uC77C\uC8FC\uC18C");
		textField_2.setForeground(Color.WHITE);
		textField_2.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBackground(new Color(23, 35, 51));
		textField_2.setBounds(77, 231, 316, 21);
		textField_2.addFocusListener(this);
		panel_3.add(textField_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(77, 262, 316, 2);
		panel_3.add(separator_1);
		
		JLabel label_2 = new JLabel("\uC774\uBBF8 \uC874\uC7AC\uD558\uB294 \uC774\uBA54\uC77C\uC785\uB2C8\uB2E4.");
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		label_2.setBounds(77, 274, 265, 15);
		panel_3.add(label_2);
		
		JLabel label_3 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		label_3.setBounds(77, 311, 75, 15);
		panel_3.add(label_3);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.WHITE);
		passwordField.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		passwordField.setBorder(null);
		passwordField.setBackground(new Color(23, 35, 51));
		passwordField.setBounds(77, 307, 316, 21);
		panel_3.add(passwordField);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(77, 338, 316, 2);
		panel_3.add(separator_2);
		
		JLabel label_4 = new JLabel("\uBE44\uBC00\uBC88\uD638\uB294 8\uC790\uB9AC \uC774\uC0C1\uC774\uC5B4\uC57C\uD569\uB2C8\uB2E4.");
		label_4.setForeground(Color.RED);
		label_4.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		label_4.setBounds(77, 350, 265, 15);
		panel_3.add(label_4);
		
		JLabel label_5 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		label_5.setBounds(77, 389, 102, 15);
		panel_3.add(label_5);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setForeground(Color.WHITE);
		passwordField_1.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		passwordField_1.setBorder(null);
		passwordField_1.setBackground(new Color(23, 35, 51));
		passwordField_1.setBounds(77, 385, 316, 21);
		panel_3.add(passwordField_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(77, 416, 316, 2);
		panel_3.add(separator_3);
		
		JLabel label_6 = new JLabel("\uBE44\uBC00\uBC88\uD638\uAC00 \uC77C\uCE58\uD558\uC9C0 \uC54A\uC2B5\uB2C8\uB2E4");
		label_6.setForeground(Color.RED);
		label_6.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		label_6.setBounds(77, 428, 265, 15);
		panel_3.add(label_6);
		
		textField_3 = new JTextField();
		textField_3.setText("\uB2C9\uB124\uC784");
		textField_3.setForeground(Color.WHITE);
		textField_3.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBorder(null);
		textField_3.setBackground(new Color(23, 35, 51));
		textField_3.setBounds(77, 469, 316, 21);
		panel_3.add(textField_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(77, 500, 316, 2);
		panel_3.add(separator_4);
		
		JLabel label_7 = new JLabel("\uC774\uBBF8 \uC874\uC7AC\uD558\uB294 \uB2C9\uB124\uC784\uC785\uB2C8\uB2E4");
		label_7.setForeground(Color.RED);
		label_7.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		label_7.setBounds(77, 512, 265, 15);
		panel_3.add(label_7);
		
		textField_4 = new JTextField();
		textField_4.setText("\uC8FC\uC18C");
		textField_4.setForeground(Color.WHITE);
		textField_4.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		textField_4.setColumns(10);
		textField_4.setBorder(null);
		textField_4.setBackground(new Color(23, 35, 51));
		textField_4.setBounds(77, 549, 316, 21);
		panel_3.add(textField_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(77, 580, 316, 2);
		panel_3.add(separator_5);
		
		JLabel label_8 = new JLabel("\uC5F0\uB77D\uCC98");
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		label_8.setBounds(77, 609, 75, 15);
		panel_3.add(label_8);
		
		textField_5 = new JTextField();
		textField_5.setForeground(Color.WHITE);
		textField_5.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		textField_5.setColumns(10);
		textField_5.setBorder(null);
		textField_5.setBackground(new Color(23, 35, 51));
		textField_5.setBounds(77, 605, 316, 21);
		panel_3.add(textField_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(77, 636, 316, 2);
		panel_3.add(separator_6);
		
		textField_6 = new JTextField();
		textField_6.setText("\uAD6C\uB2E8");
		textField_6.setForeground(Color.WHITE);
		textField_6.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		textField_6.setColumns(10);
		textField_6.setBorder(null);
		textField_6.setBackground(new Color(23, 35, 51));
		textField_6.setBounds(77, 678, 316, 21);
		panel_3.add(textField_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(77, 709, 316, 2);
		panel_3.add(separator_7);
		
		JButton button = new JButton("\uAD6C\uB2E8\uCC3E\uAE30");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
		button.setBackground(new Color(71, 120, 197));
		button.setBounds(405, 676, 89, 23);
		panel_3.add(button);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(240,240,240));
		panel_4.setBounds(77, 66, 100, 100);
		panel_3.add(panel_4);
		
		JButton button_1 = new JButton("\uC0AC\uC9C4\uCC3E\uAE30");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
		button_1.setBackground(new Color(71, 120, 197));
		button_1.setBounds(189, 143, 89, 23);
		panel_3.add(button_1);
		
		JButton button_2 = new JButton("\uD655\uC778");
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
		button_2.setBackground(new Color(71, 120, 197));
		button_2.setBounds(77, 761, 80, 35);
		panel_3.add(button_2);
		
		JButton button_3 = new JButton("\uCDE8\uC18C");
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
		button_3.setBackground(new Color(71, 120, 197));
		button_3.setBounds(231, 761, 80, 35);
		panel_3.add(button_3);
		

	}

	@Override
	public void focusGained(FocusEvent e) {
		if (e.getSource()==textField_2) {
			textField_2.setText("");
		}
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}
}
