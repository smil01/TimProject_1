package P2_View;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
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

public class Lobby extends JPanel {
	private JTextField textField;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Lobby() {
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
				"유소년축구 성장 관리 프로그램 BETA");
		lbl_program_name.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_program_name.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 15));
		lbl_program_name.setForeground(new Color(255, 255, 255));
		ProgramNamePanel.add(lbl_program_name, "name_53851796879200");
		
		JPanel ProfilePanel = new JPanel();
		ProfilePanel.setBackground(new Color(71, 120, 197));
		ProfilePanel.setBounds(0, 158, 280, 104);
		LeftLobbyPanel.add(ProfilePanel);
		ProfilePanel.setLayout(null);
		
		JPanel Profile_ImagePanel = new JPanel();
		Profile_ImagePanel.setBackground(new Color(84, 125, 206));
		Profile_ImagePanel.setBounds(0, 0, 91, 104);
		ProfilePanel.add(Profile_ImagePanel);
		Profile_ImagePanel.setLayout(new CardLayout(0, 0));
		
		JLabel lbl_profileImg = new JLabel("사진");
		lbl_profileImg.setHorizontalAlignment(SwingConstants.CENTER);
		Profile_ImagePanel.add(lbl_profileImg, "name_54594167799700");
		
		JPanel Profile_Nickname = new JPanel();
		Profile_Nickname.setBackground(new Color(84, 125, 206));
		Profile_Nickname.setBounds(89, 0, 191, 104);
		ProfilePanel.add(Profile_Nickname);
		Profile_Nickname.setLayout(null);
		
		JLabel label_1 = new JLabel("김치현");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		label_1.setBounds(12, 39, 100, 25);
		Profile_Nickname.add(label_1);
		
		JPanel btn_1 = new JPanel();
		btn_1.setBackground(new Color(41, 57, 80));
		btn_1.setBounds(0, 361, 300, 80);
		LeftLobbyPanel.add(btn_1);
		btn_1.setLayout(null);
		
		JLabel lbl_btn1 = new JLabel("선수 관리");
		lbl_btn1.setBounds(87, 30, 87, 24);
		lbl_btn1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lbl_btn1.setForeground(new Color(255, 255, 255));
		btn_1.add(lbl_btn1);
		
		JPanel btn1_deco = new JPanel();
		btn1_deco.setBackground(new Color(255, 255, 255));
		btn1_deco.setBounds(0, 0, 5, 80);
		btn_1.add(btn1_deco);
		
		JPanel ExitPanel = new JPanel();
		ExitPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		ExitPanel.setBackground(new Color(84, 125, 206));
		ExitPanel.setBounds(0, 820, 300, 80);
		LeftLobbyPanel.add(ExitPanel);
		ExitPanel.setLayout(null);
		
		JPanel ExitIconPanel = new JPanel();
		ExitIconPanel.setBackground(new Color(84, 125, 206));
		ExitIconPanel.setBounds(0, 0, 76, 80);
		ExitPanel.add(ExitIconPanel);
		ExitIconPanel.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(Lobby.class.getResource("/P5_Img/icons8_exit_32px.png")));
		ExitIconPanel.add(lblNewLabel_1, "name_58332631504300");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(84, 125, 206));
		panel_1.setBounds(74, 0, 226, 80);
		ExitPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("나가기");
		lblNewLabel_2.setBounds(0, 10, 111, 60);
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
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
		label.setIcon(new ImageIcon(Lobby.class.getResource("/P5_Img/icons8_search_32px.png")));
		
		SearchIconPanel.add(label);
		
		JPanel SearchTxtPanel = new JPanel();
		SearchTxtPanel.setBounds(46, 0, 254, 68);
		SearchTxtPanel.setBackground(new Color(41,57,80));
		SearchPanel.add(SearchTxtPanel);
		SearchTxtPanel.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
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
		btn_2.setLayout(null);
		btn_2.setBackground(new Color(41, 57, 80));
		btn_2.setBounds(0, 439, 300, 80);
		LeftLobbyPanel.add(btn_2);
		
		JLabel lbl_btn2 = new JLabel("구단 관리");
		lbl_btn2.setForeground(Color.WHITE);
		lbl_btn2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lbl_btn2.setBounds(87, 30, 87, 24);
		btn_2.add(lbl_btn2);
		
		JPanel btn2_deco = new JPanel();
		btn2_deco.setBackground(Color.WHITE);
		btn2_deco.setBounds(0, 0, 5, 80);
		btn_2.add(btn2_deco);
		
		JPanel btn_3 = new JPanel();
		btn_3.setLayout(null);
		btn_3.setBackground(new Color(41, 57, 80));
		btn_3.setBounds(0, 517, 300, 80);
		LeftLobbyPanel.add(btn_3);
		
		JLabel lbl_btn3 = new JLabel("이적 관리");
		lbl_btn3.setForeground(Color.WHITE);
		lbl_btn3.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lbl_btn3.setBounds(87, 30, 87, 24);
		btn_3.add(lbl_btn3);
		
		JPanel btn3_deco = new JPanel();
		btn3_deco.setBackground(Color.WHITE);
		btn3_deco.setBounds(0, 0, 5, 80);
		btn_3.add(btn3_deco);
		
		JPanel btn4 = new JPanel();
		btn4.setLayout(null);
		btn4.setBackground(new Color(41, 57, 80));
		btn4.setBounds(0, 595, 300, 80);
		LeftLobbyPanel.add(btn4);
		
		JLabel lbl_btn4 = new JLabel("개인 설정");
		lbl_btn4.setForeground(Color.WHITE);
		lbl_btn4.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lbl_btn4.setBounds(87, 30, 87, 24);
		btn4.add(lbl_btn4);
		
		JPanel btn4_deco = new JPanel();
		btn4_deco.setBackground(Color.WHITE);
		btn4_deco.setBounds(0, 0, 5, 80);
		btn4.add(btn4_deco);
		
		JPanel GudanPanel = new JPanel();
		GudanPanel.setBackground(new Color(71, 120, 197));
		GudanPanel.setBounds(280, 0, 1320, 105);
		Lobby_Panel.add(GudanPanel);
		GudanPanel.setLayout(null);
		
		JPanel LogoPanel = new JPanel();
		LogoPanel.setBackground(new Color(71, 120, 197));
		LogoPanel.setBounds(78, 0, 111, 105);
		GudanPanel.add(LogoPanel);
		LogoPanel.setLayout(new CardLayout(0, 0));
		
		JLabel lbl_logo = new JLabel("");
		lbl_logo.setIcon(new ImageIcon(Lobby.class.getResource("/P5_Img/icons8_uefa_euro_trophy_64px.png")));
		lbl_logo.setHorizontalAlignment(SwingConstants.CENTER);
		LogoPanel.add(lbl_logo, "name_60328911748400");
		
		JPanel GudanName = new JPanel();
		GudanName.setBackground(new Color(71, 120, 197));
		GudanName.setBounds(190, 0, 190, 105);
		GudanPanel.add(GudanName);
		GudanName.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("오형제");
		lblNewLabel.setBounds(32, 30, 75, 34);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		GudanName.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(280, 104, 1320, 796);
		Lobby_Panel.add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.getTableHeader().setBackground(new Color(120, 168, 252)); //컬럼이름 색깔
		table.getTableHeader().setForeground(new Color(255,255,255)); // 컬럼이름 폰트색깔
		table.setSelectionBackground(new Color(232,57,95)); //JTable 선택시 색깔
		table.setRowHeight(50);
		table.setBounds(35, 10, 1189, 738);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(12, 10, 1296, 738);
		panel.add(scrollPane);
		

	}
}
