package P2_View;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import P4_DTO.loginDTO;

import javax.swing.JScrollPane;
import java.awt.Cursor;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Btn1_Button5 extends JPanel {
	private JTextField textField;
	private JFrame frame;
	private loginDTO dto;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;

	/**
	 * Create the panel.
	 */
	public Btn1_Button5(JFrame frame, loginDTO dto) {
		this.frame = frame;
		this.dto = dto;
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
		lbl_program_name.setFont(new Font("고양체", Font.PLAIN, 20));
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
		label_1.setFont(new Font("KBIZ한마음고딕 B", Font.PLAIN, 16));
		label_1.setBounds(30, 38, 100, 25);
		Profile_Nickname.add(label_1);

		JPanel btn_1 = new JPanel();
		btn_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_1.setBackground(new Color(255, 255, 255, 20));
		btn_1.setBounds(0, 361, 300, 80);
		LeftLobbyPanel.add(btn_1);
		btn_1.setLayout(null);

		JLabel lbl_btn1 = new JLabel("\uC120\uC218\uAD00\uB9AC");
		lbl_btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPanel Stn1_Button1 = new Btn1_Button1(frame,dto);
				frame.getContentPane().removeAll();
				frame.getContentPane().add(Stn1_Button1);
				frame.revalidate();
				frame.repaint();
			}
		});
		lbl_btn1.setBounds(87, 30, 87, 24);
		lbl_btn1.setFont(new Font("KBIZ한마음고딕 H", Font.PLAIN, 20));
		lbl_btn1.setForeground(new Color(255, 255, 255));
		btn_1.add(lbl_btn1);

		JPanel btn4_deco = new JPanel();
		btn4_deco.setBounds(0, 0, 5, 80);
		btn_1.add(btn4_deco);
		btn4_deco.setBackground(Color.WHITE);

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
		lblNewLabel_1.setIcon(new ImageIcon(Btn1_Button4.class.getResource("/P5_Img/icons8_exit_32px.png")));
		ExitIconPanel.add(lblNewLabel_1, "name_58332631504300");

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(41, 57, 80));
		panel_1.setBounds(74, 0, 226, 80);
		ExitPanel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("\uB098\uAC00\uAE30");
		lblNewLabel_2.setBounds(0, 10, 111, 60);
		lblNewLabel_2.setFont(new Font("KBIZ한마음고딕 H", Font.BOLD, 20));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_2);

		JPanel SearchPanel = new JPanel();
		SearchPanel.setBackground(new Color(41, 57, 80));
		SearchPanel.setBounds(0, 59, 300, 54);
		LeftLobbyPanel.add(SearchPanel);
		SearchPanel.setLayout(null);

		JPanel SearchIconPanel = new JPanel();
		SearchIconPanel.setBounds(12, 10, 32, 32);
		SearchIconPanel.setBackground(new Color(41, 57, 80));
		SearchPanel.add(SearchIconPanel);
		SearchIconPanel.setLayout(null);

		JLabel label = new JLabel("");
		label.setBounds(0, 0, 32, 32);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(Btn1_Button4.class.getResource("/P5_Img/icons8_search_32px.png")));

		SearchIconPanel.add(label);

		JPanel SearchTxtPanel = new JPanel();
		SearchTxtPanel.setBounds(46, 0, 254, 68);
		SearchTxtPanel.setBackground(new Color(41, 57, 80));
		SearchPanel.add(SearchTxtPanel);
		SearchTxtPanel.setLayout(null);

		textField = new JTextField();
		textField.setFont(new Font("KBIZ한마음고딕 H", Font.PLAIN, 14));
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
		lbl_btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPanel Stn2_Button1 = new Btn2_Button1(frame,dto);
				frame.getContentPane().removeAll();
				frame.getContentPane().add(Stn2_Button1);
				frame.revalidate();
				frame.repaint();
			}
		});
		lbl_btn2.setForeground(Color.WHITE);
		lbl_btn2.setFont(new Font("KBIZ한마음고딕 H", Font.PLAIN, 20));
		lbl_btn2.setBounds(87, 30, 87, 24);
		btn_2.add(lbl_btn2);

		JPanel btn_3 = new JPanel();
		btn_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_3.setLayout(null);
		btn_3.setBackground(new Color(41, 57, 80));
		btn_3.setBounds(0, 517, 300, 80);
		LeftLobbyPanel.add(btn_3);

		JLabel lbl_btn3 = new JLabel("\uAD6C\uB2E8\uBAA9\uB85D");
		lbl_btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPanel Stn3_Button1 = new Btn3_Button1(frame,dto);
				frame.getContentPane().removeAll();
				frame.getContentPane().add(Stn3_Button1);
				frame.revalidate();
				frame.repaint();
			}
		});
		lbl_btn3.setForeground(Color.WHITE);
		lbl_btn3.setFont(new Font("KBIZ한마음고딕 H", Font.PLAIN, 20));
		lbl_btn3.setBounds(87, 30, 87, 24);
		btn_3.add(lbl_btn3);

		JPanel btn4 = new JPanel();
		btn4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn4.setLayout(null);
		btn4.setBackground(new Color(41, 57, 80));
		btn4.setBounds(0, 595, 300, 80);
		LeftLobbyPanel.add(btn4);

		JLabel lbl_btn4 = new JLabel("\uAC1C\uC778\uC124\uC815");
		lbl_btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPanel Stn4_Button1 = new Btn4_Button1(frame,dto);
				frame.getContentPane().removeAll();
				frame.getContentPane().add(Stn4_Button1);
				frame.revalidate();
				frame.repaint();
			}
		});
		lbl_btn4.setForeground(Color.WHITE);
		lbl_btn4.setFont(new Font("KBIZ한마음고딕 H", Font.PLAIN, 20));
		lbl_btn4.setBounds(87, 30, 87, 24);
		btn4.add(lbl_btn4);

		JPanel PlayerButtonPanel = new JPanel();
		PlayerButtonPanel.setBackground(new Color(71, 120, 197));
		PlayerButtonPanel.setBounds(280, 0, 1320, 105);
		Lobby_Panel.add(PlayerButtonPanel);
		PlayerButtonPanel.setLayout(null);

		JPanel AllPlayerButton = new JPanel();
		AllPlayerButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		AllPlayerButton.setBackground(new Color(71, 120, 197));
		AllPlayerButton.setBounds(130, 0, 220, 105);
		PlayerButtonPanel.add(AllPlayerButton);
		AllPlayerButton.setLayout(null);

		JLabel lbl_AllPlayerButton = new JLabel("\uC804\uCCB4\uBCF4\uAE30");
		lbl_AllPlayerButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPanel Stn1_Button1 = new Btn1_Button1(frame,dto);
				frame.getContentPane().removeAll();
				frame.getContentPane().add(Stn1_Button1);
				frame.revalidate();
				frame.repaint();
			}
		});
		lbl_AllPlayerButton.setBounds(0, 0, 220, 105);
		lbl_AllPlayerButton.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_AllPlayerButton.setForeground(new Color(255, 255, 255));
		lbl_AllPlayerButton.setFont(new Font("KBIZ한마음고딕 H", Font.PLAIN, 20));
		lbl_AllPlayerButton.setBackground(new Color(255, 255, 255));
		AllPlayerButton.add(lbl_AllPlayerButton);

		JPanel PlayerStatButton = new JPanel();
		PlayerStatButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		PlayerStatButton.setBackground(new Color(71, 120, 197));
		PlayerStatButton.setBounds(350, 0, 220, 105);
		PlayerButtonPanel.add(PlayerStatButton);
		PlayerStatButton.setLayout(null);

		JLabel lbl_PlayerStatButton = new JLabel("\uC120\uC218\uC2A4\uD0EF");
		lbl_PlayerStatButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPanel Stn1_Button2 = new Btn1_Button2(frame,dto);
				frame.getContentPane().removeAll();
				frame.getContentPane().add(Stn1_Button2);
				frame.revalidate();
				frame.repaint();
			}
		});
		lbl_PlayerStatButton.setBounds(0, 0, 220, 105);
		lbl_PlayerStatButton.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_PlayerStatButton.setForeground(Color.WHITE);
		lbl_PlayerStatButton.setFont(new Font("KBIZ한마음고딕 H", Font.PLAIN, 20));
		lbl_PlayerStatButton.setBackground(Color.WHITE);
		PlayerStatButton.add(lbl_PlayerStatButton);

		JPanel PlayerChart = new JPanel();
		PlayerChart.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		PlayerChart.setBackground(new Color(71, 120, 197));
		PlayerChart.setBounds(570, 0, 220, 105);
		PlayerButtonPanel.add(PlayerChart);
		PlayerChart.setLayout(null);

		JLabel lbl_PlayerChart = new JLabel("\uCC28\uD2B8\uBCF4\uAE30");
		lbl_PlayerChart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPanel Stn1_Button3 = new Btn1_Button3(frame,dto);
				frame.getContentPane().removeAll();
				frame.getContentPane().add(Stn1_Button3);
				frame.revalidate();
				frame.repaint();
			}
		});
		lbl_PlayerChart.setBounds(0, 0, 220, 105);
		lbl_PlayerChart.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_PlayerChart.setForeground(Color.WHITE);
		lbl_PlayerChart.setFont(new Font("KBIZ한마음고딕 H", Font.PLAIN, 20));
		lbl_PlayerChart.setBackground(Color.WHITE);
		PlayerChart.add(lbl_PlayerChart);

		JPanel PlayerMemoPanel = new JPanel();
		PlayerMemoPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		PlayerMemoPanel.setBackground(new Color(71, 120, 197));
		PlayerMemoPanel.setBounds(790, 0, 220, 105);
		PlayerButtonPanel.add(PlayerMemoPanel);
		PlayerMemoPanel.setLayout(null);

		JLabel lbl_PlayerMemo = new JLabel("\uD3C9\uAC00\uBA54\uBAA8");
		lbl_PlayerMemo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPanel Stn1_Button4 = new Btn1_Button4(frame, dto);
				frame.getContentPane().removeAll();
				frame.getContentPane().add(Stn1_Button4);
				frame.revalidate();
				frame.repaint();
			}
		});
		lbl_PlayerMemo.setBounds(0, 0, 220, 105);
		PlayerMemoPanel.add(lbl_PlayerMemo);
		lbl_PlayerMemo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_PlayerMemo.setForeground(Color.WHITE);
		lbl_PlayerMemo.setFont(new Font("KBIZ한마음고딕 H", Font.PLAIN, 20));
		lbl_PlayerMemo.setBackground(Color.WHITE);
		
		JPanel SetStatPanel = new JPanel();
		SetStatPanel.setBackground(new Color(255, 255, 255, 60));
		SetStatPanel.setBounds(1010, 0, 220, 105);
		PlayerButtonPanel.add(SetStatPanel);
		SetStatPanel.setLayout(null);
		
		JLabel lbl_SetStat = new JLabel("\uC2A4\uD0EF\uB4F1\uB85D");
		lbl_SetStat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPanel Stn1_Button5 = new Btn1_Button5(frame,dto);
				frame.getContentPane().removeAll();
				frame.getContentPane().add(Stn1_Button5);
				frame.revalidate();
				frame.repaint();
			}
		});
		lbl_SetStat.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_SetStat.setBounds(0, 0, 220, 105);
		lbl_SetStat.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_SetStat.setForeground(Color.WHITE);
		lbl_SetStat.setFont(new Font("KBIZ한마음고딕 H", Font.PLAIN, 20));
		lbl_SetStat.setBackground(Color.WHITE);
		SetStatPanel.add(lbl_SetStat);
		
				JPanel panel = new JPanel();
				panel.setBounds(0, 98, 220, 7);
				SetStatPanel.add(panel);
				
				JPanel panel_2 = new JPanel();
				panel_2.setLayout(null);
				panel_2.setBackground(Color.WHITE);
				panel_2.setBounds(280, 104, 1320, 796);
				Lobby_Panel.add(panel_2);
				
				JPanel panel_3 = new JPanel();
				panel_3.setBounds(90, 50, 180, 180);
				panel_2.add(panel_3);
				panel_3.setLayout(new CardLayout(0, 0));
				
				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setIcon(new ImageIcon(Btn1_Button5.class.getResource("/P5_Img/sample.jpg")));
				panel_3.add(lblNewLabel, "name_17042670660900");
				
				JPanel panel_5 = new JPanel();
				panel_5.setLayout(null);
				panel_5.setBackground(Color.WHITE);
				panel_5.setBounds(345, 50, 468, 230);
				panel_2.add(panel_5);
				
				JLabel label_2 = new JLabel("\uB098\uC774");
				label_2.setForeground(new Color(153, 153, 153));
				label_2.setFont(new Font("만화진흥원체", Font.PLAIN, 16));
				label_2.setBounds(12, 10, 48, 32);
				panel_5.add(label_2);
				
				JLabel label_4 = new JLabel("\uD0A4");
				label_4.setForeground(new Color(153, 153, 153));
				label_4.setFont(new Font("만화진흥원체", Font.PLAIN, 16));
				label_4.setBounds(84, 10, 48, 32);
				panel_5.add(label_4);
				
				JLabel label_6 = new JLabel("\uBAB8\uBB34\uAC8C");
				label_6.setForeground(new Color(153, 153, 153));
				label_6.setFont(new Font("만화진흥원체", Font.PLAIN, 16));
				label_6.setBounds(250, 10, 48, 32);
				panel_5.add(label_6);
				
				JLabel label_8 = new JLabel("\uC67C\uBC1C");
				label_8.setForeground(new Color(153, 153, 153));
				label_8.setFont(new Font("만화진흥원체", Font.PLAIN, 16));
				label_8.setBounds(359, 10, 48, 32);
				panel_5.add(label_8);
				
				JLabel label_9 = new JLabel("\uC624\uB978\uBC1C");
				label_9.setForeground(new Color(153, 153, 153));
				label_9.setFont(new Font("만화진흥원체", Font.PLAIN, 16));
				label_9.setBounds(419, 10, 48, 32);
				panel_5.add(label_9);
				
				JLabel label_12 = new JLabel("\uBD80\uC0C1\uAE30\uAC04");
				label_12.setForeground(new Color(153, 153, 153));
				label_12.setFont(new Font("만화진흥원체", Font.PLAIN, 16));
				label_12.setBounds(12, 158, 60, 32);
				panel_5.add(label_12);
				
				textField_1 = new JTextField();
				textField_1.setForeground(new Color(189, 178, 137));
				textField_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				textField_1.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 35));
				textField_1.setBounds(0, 52, 50, 50);
				panel_5.add(textField_1);
				textField_1.setColumns(10);
				
				textField_2 = new JTextField();
				textField_2.setForeground(new Color(189, 178, 137));
				textField_2.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 35));
				textField_2.setColumns(10);
				textField_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				textField_2.setBounds(72, 52, 73, 50);
				panel_5.add(textField_2);
				
				JLabel lblCm = new JLabel("CM");
				lblCm.setForeground(new Color(189, 178, 137));
				lblCm.setFont(new Font("만화진흥원체", Font.PLAIN, 35));
				lblCm.setBounds(155, 64, 50, 32);
				panel_5.add(lblCm);
				
				textField_3 = new JTextField();
				textField_3.setForeground(new Color(189, 178, 137));
				textField_3.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 35));
				textField_3.setColumns(10);
				textField_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				textField_3.setBounds(248, 52, 50, 50);
				panel_5.add(textField_3);
				
				JLabel lblKg = new JLabel("KG");
				lblKg.setForeground(new Color(189, 178, 137));
				lblKg.setFont(new Font("만화진흥원체", Font.PLAIN, 35));
				lblKg.setBounds(300, 64, 50, 32);
				panel_5.add(lblKg);
				
				textField_4 = new JTextField();
				textField_4.setForeground(new Color(189, 178, 137));
				textField_4.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 35));
				textField_4.setColumns(10);
				textField_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				textField_4.setBounds(359, 52, 35, 50);
				panel_5.add(textField_4);
				
				textField_5 = new JTextField();
				textField_5.setForeground(new Color(189, 178, 137));
				textField_5.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 35));
				textField_5.setColumns(10);
				textField_5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				textField_5.setBounds(419, 52, 35, 50);
				panel_5.add(textField_5);
				
				textField_6 = new JTextField();
				textField_6.setForeground(new Color(0, 0, 0));
				textField_6.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 16));
				textField_6.setColumns(10);
				textField_6.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				textField_6.setBounds(0, 200, 48, 19);
				panel_5.add(textField_6);
				
				JLabel label_3 = new JLabel("\uC77C");
				label_3.setForeground(new Color(0, 0, 0));
				label_3.setFont(new Font("만화진흥원체", Font.PLAIN, 16));
				label_3.setBounds(54, 200, 22, 19);
				panel_5.add(label_3);
				
				textField_7 = new JTextField();
				textField_7.setForeground(Color.BLACK);
				textField_7.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 16));
				textField_7.setColumns(10);
				textField_7.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				textField_7.setBounds(84, 201, 350, 19);
				panel_5.add(textField_7);
				
				JButton button = new JButton("\uBCC0\uACBD");
				button.setForeground(Color.WHITE);
				button.setFont(new Font("KBIZ한마음고딕 B", Font.PLAIN, 16));
				button.setBackground(new Color(71, 120, 197));
				button.setBounds(367, 122, 89, 23);
				panel_5.add(button);
				
				JLabel label_15 = new JLabel("\uC774\uAC15\uC778");
				label_15.setForeground(Color.BLACK);
				label_15.setFont(new Font("만화진흥원체", Font.PLAIN, 25));
				label_15.setBounds(134, 240, 82, 45);
				panel_2.add(label_15);
				
				JLabel label_16 = new JLabel("\uACF5\uACA9\uC218");
				label_16.setForeground(Color.BLACK);
				label_16.setFont(new Font("만화진흥원체", Font.PLAIN, 16));
				label_16.setBounds(144, 287, 41, 19);
				panel_2.add(label_16);
				
				JLabel label_17 = new JLabel("\uC120\uC218 \uC2A4\uD0EF");
				label_17.setForeground(Color.BLACK);
				label_17.setFont(new Font("만화진흥원체", Font.PLAIN, 35));
				label_17.setBounds(90, 337, 139, 45);
				panel_2.add(label_17);
				
				JSeparator separator_1 = new JSeparator();
				separator_1.setForeground(new Color(229, 229, 229));
				separator_1.setBounds(90, 447, 994, 10);
				panel_2.add(separator_1);
				
				JLabel label_18 = new JLabel("\uCD95\uAD6C \uB2A5\uB825");
				label_18.setForeground(Color.BLACK);
				label_18.setFont(new Font("만화진흥원체", Font.PLAIN, 25));
				label_18.setBounds(90, 392, 139, 45);
				panel_2.add(label_18);
				
				JLabel lblm = new JLabel("30M \uB2EC\uB9AC\uAE30");
				lblm.setForeground(new Color(153, 153, 153));
				lblm.setFont(new Font("만화진흥원체", Font.PLAIN, 16));
				lblm.setBounds(125, 522, 91, 32);
				panel_2.add(lblm);
				
				JLabel lblm_1 = new JLabel("15M \uC29B");
				lblm_1.setForeground(new Color(153, 153, 153));
				lblm_1.setFont(new Font("만화진흥원체", Font.PLAIN, 16));
				lblm_1.setBounds(317, 522, 60, 32);
				panel_2.add(lblm_1);
				
				JLabel label_24 = new JLabel("\uD328\uC2A4");
				label_24.setForeground(new Color(153, 153, 153));
				label_24.setFont(new Font("만화진흥원체", Font.PLAIN, 16));
				label_24.setBounds(520, 522, 48, 32);
				panel_2.add(label_24);
				
				JLabel label_26 = new JLabel("\uC9C0\uADF8\uC7AC\uADF8\uB4DC\uB9AC\uBE14");
				label_26.setForeground(new Color(153, 153, 153));
				label_26.setFont(new Font("만화진흥원체", Font.PLAIN, 16));
				label_26.setBounds(665, 522, 105, 32);
				panel_2.add(label_26);
				
				JLabel label_28 = new JLabel("\uC218\uBE44");
				label_28.setForeground(new Color(153, 153, 153));
				label_28.setFont(new Font("만화진흥원체", Font.PLAIN, 16));
				label_28.setBounds(879, 522, 48, 32);
				panel_2.add(label_28);
				
				JLabel label_29 = new JLabel("\uB300\uD68C \uC131\uC801");
				label_29.setForeground(Color.BLACK);
				label_29.setFont(new Font("만화진흥원체", Font.PLAIN, 25));
				label_29.setBounds(90, 581, 139, 45);
				panel_2.add(label_29);
				
				JSeparator separator_2 = new JSeparator();
				separator_2.setForeground(new Color(229, 229, 229));
				separator_2.setBounds(90, 636, 994, 10);
				panel_2.add(separator_2);
				
				JLabel label_31 = new JLabel("\uACE8");
				label_31.setForeground(new Color(153, 153, 153));
				label_31.setFont(new Font("만화진흥원체", Font.PLAIN, 16));
				label_31.setBounds(147, 698, 48, 32);
				panel_2.add(label_31);
				
				JLabel label_33 = new JLabel("\uC5B4\uC2DC\uC2A4\uD2B8");
				label_33.setForeground(new Color(153, 153, 153));
				label_33.setFont(new Font("만화진흥원체", Font.PLAIN, 16));
				label_33.setBounds(317, 698, 60, 32);
				panel_2.add(label_33);
				
				JLabel label_35 = new JLabel("\uC720\uD6A8\uC29B");
				label_35.setForeground(new Color(153, 153, 153));
				label_35.setFont(new Font("만화진흥원체", Font.PLAIN, 16));
				label_35.setBounds(498, 698, 48, 32);
				panel_2.add(label_35);
				
				JLabel label_37 = new JLabel("\uC29B");
				label_37.setForeground(new Color(153, 153, 153));
				label_37.setFont(new Font("만화진흥원체", Font.PLAIN, 16));
				label_37.setBounds(687, 698, 48, 32);
				panel_2.add(label_37);
				
				JLabel label_39 = new JLabel("\uD65C\uB3D9\uB7C9");
				label_39.setForeground(new Color(153, 153, 153));
				label_39.setFont(new Font("만화진흥원체", Font.PLAIN, 16));
				label_39.setBounds(864, 698, 48, 32);
				panel_2.add(label_39);
				
				JButton button_1 = new JButton("\uCD94\uAC00");
				button_1.setForeground(Color.WHITE);
				button_1.setFont(new Font("KBIZ한마음고딕 B", Font.PLAIN, 16));
				button_1.setBackground(new Color(71, 120, 197));
				button_1.setBounds(711, 283, 89, 23);
				panel_2.add(button_1);
				
				JButton button_2 = new JButton("\uC785\uB825");
				button_2.setForeground(Color.WHITE);
				button_2.setFont(new Font("KBIZ한마음고딕 B", Font.PLAIN, 16));
				button_2.setBackground(new Color(71, 120, 197));
				button_2.setBounds(995, 527, 89, 23);
				panel_2.add(button_2);
				
				JButton button_3 = new JButton("\uCD94\uAC00");
				button_3.setForeground(Color.WHITE);
				button_3.setFont(new Font("KBIZ한마음고딕 B", Font.PLAIN, 16));
				button_3.setBackground(new Color(71, 120, 197));
				button_3.setBounds(995, 703, 89, 23);
				panel_2.add(button_3);
				
				textField_8 = new JTextField();
				textField_8.setForeground(new Color(189, 178, 137));
				textField_8.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 35));
				textField_8.setColumns(10);
				textField_8.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				textField_8.setBounds(130, 650, 50, 50);
				panel_2.add(textField_8);
				
				textField_9 = new JTextField();
				textField_9.setForeground(new Color(189, 178, 137));
				textField_9.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 35));
				textField_9.setColumns(10);
				textField_9.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				textField_9.setBounds(317, 650, 50, 50);
				panel_2.add(textField_9);
				
				textField_10 = new JTextField();
				textField_10.setForeground(new Color(189, 178, 137));
				textField_10.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 35));
				textField_10.setColumns(10);
				textField_10.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				textField_10.setBounds(494, 650, 50, 50);
				panel_2.add(textField_10);
				
				textField_11 = new JTextField();
				textField_11.setForeground(new Color(189, 178, 137));
				textField_11.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 35));
				textField_11.setColumns(10);
				textField_11.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				textField_11.setBounds(669, 650, 50, 50);
				panel_2.add(textField_11);
				
				textField_12 = new JTextField();
				textField_12.setForeground(new Color(189, 178, 137));
				textField_12.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 35));
				textField_12.setColumns(10);
				textField_12.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				textField_12.setBounds(862, 650, 50, 50);
				panel_2.add(textField_12);
				
				textField_13 = new JTextField();
				textField_13.setForeground(new Color(189, 178, 137));
				textField_13.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 35));
				textField_13.setColumns(10);
				textField_13.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				textField_13.setBounds(135, 462, 50, 50);
				panel_2.add(textField_13);
				
				JLabel label_5 = new JLabel("\uCD08");
				label_5.setForeground(new Color(189, 178, 137));
				label_5.setFont(new Font("만화진흥원체", Font.PLAIN, 35));
				label_5.setBounds(197, 480, 50, 32);
				panel_2.add(label_5);
				
				textField_14 = new JTextField();
				textField_14.setForeground(new Color(189, 178, 137));
				textField_14.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 35));
				textField_14.setColumns(10);
				textField_14.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				textField_14.setBounds(317, 462, 50, 50);
				panel_2.add(textField_14);
				
				JLabel label_7 = new JLabel("\uC810");
				label_7.setForeground(new Color(189, 178, 137));
				label_7.setFont(new Font("만화진흥원체", Font.PLAIN, 35));
				label_7.setBounds(377, 476, 50, 35);
				panel_2.add(label_7);
				
				textField_15 = new JTextField();
				textField_15.setForeground(new Color(189, 178, 137));
				textField_15.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 35));
				textField_15.setColumns(10);
				textField_15.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				textField_15.setBounds(505, 462, 50, 50);
				panel_2.add(textField_15);
				
				JLabel label_10 = new JLabel("\uC810");
				label_10.setForeground(new Color(189, 178, 137));
				label_10.setFont(new Font("만화진흥원체", Font.PLAIN, 35));
				label_10.setBounds(565, 476, 50, 35);
				panel_2.add(label_10);
				
				textField_16 = new JTextField();
				textField_16.setForeground(new Color(189, 178, 137));
				textField_16.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 35));
				textField_16.setColumns(10);
				textField_16.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				textField_16.setBounds(665, 462, 50, 50);
				panel_2.add(textField_16);
				
				JLabel label_11 = new JLabel("\uC810");
				label_11.setForeground(new Color(189, 178, 137));
				label_11.setFont(new Font("만화진흥원체", Font.PLAIN, 35));
				label_11.setBounds(725, 476, 50, 35);
				panel_2.add(label_11);
				
				textField_17 = new JTextField();
				textField_17.setForeground(new Color(189, 178, 137));
				textField_17.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 35));
				textField_17.setColumns(10);
				textField_17.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				textField_17.setBounds(856, 462, 50, 50);
				panel_2.add(textField_17);
				
				JLabel label_13 = new JLabel("\uC810");
				label_13.setForeground(new Color(189, 178, 137));
				label_13.setFont(new Font("만화진흥원체", Font.PLAIN, 35));
				label_13.setBounds(916, 476, 50, 35);
				panel_2.add(label_13);
				
				JComboBox comboBox = new JComboBox();
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uB300\uD68C\uBA85"}));
				comboBox.setForeground(new Color(0, 0, 0));
				comboBox.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 14));
				comboBox.setBorder(null);
				comboBox.setBackground(new Color(255, 255, 255));
				comboBox.setBounds(232, 596, 211, 25);
				panel_2.add(comboBox);
				
				JLabel label_14 = new JLabel("\uC774\uC801 \uBA85\uB2E8");
				label_14.setForeground(Color.BLACK);
				label_14.setFont(new Font("만화진흥원체", Font.PLAIN, 25));
				label_14.setBounds(930, 50, 300, 45);
				panel_2.add(label_14);
				
				JSeparator separator_3 = new JSeparator();
				separator_3.setForeground(new Color(229, 229, 229));
				separator_3.setBounds(930, 105, 300, 10);
				panel_2.add(separator_3);
				
				JButton button_4 = new JButton("\uCD94\uAC00");
				button_4.setForeground(Color.WHITE);
				button_4.setFont(new Font("KBIZ한마음고딕 B", Font.PLAIN, 16));
				button_4.setBackground(new Color(71, 120, 197));
				button_4.setBounds(930, 125, 89, 23);
				panel_2.add(button_4);

	}
}
