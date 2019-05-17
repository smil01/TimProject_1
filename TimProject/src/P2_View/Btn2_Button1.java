package P2_View;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import P3_DAO.GroupsDAO;
import P4_DTO.GroupsDTO;
import P4_DTO.loginDTO;

import javax.swing.JScrollPane;
import java.awt.Cursor;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Component;
import javax.swing.SpringLayout;

public class Btn2_Button1 extends JPanel implements FocusListener {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textname;
	private JTextField textaddress;
	private JTextField texthomepage;
	private JTextField texttel;
	private JFrame frame;
	private loginDTO dto;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private GroupsDAO gdao=new GroupsDAO();
	private GroupsDTO gdto=new GroupsDTO();
	private ArrayList<GroupsDTO> glist;

	/**
	 * Create the panel.
	 */
	public Btn2_Button1(JFrame frame, loginDTO dto) {
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
		lbl_profileImg.setIcon(new ImageIcon(dto.getMember_ResizeImg(100, 100)));
		
		JPanel Profile_Nickname = new JPanel();
		Profile_Nickname.setBackground(new Color(84, 125, 206));
		Profile_Nickname.setBounds(100, 0, 180, 100);
		ProfilePanel.add(Profile_Nickname);
		Profile_Nickname.setLayout(null);

		JLabel lbl_profile_Nickname = new JLabel("\uB2C9\uB124\uC784");
		lbl_profile_Nickname.setForeground(Color.WHITE);
		lbl_profile_Nickname.setFont(new Font("KBIZÇÑ¸¶À½°íµñ B", Font.PLAIN, 16));
		lbl_profile_Nickname.setBounds(30, 38, 100, 25);
		Profile_Nickname.add(lbl_profile_Nickname);
		lbl_profile_Nickname.setText(dto.getMember_Nickname());
		
		JPanel btn_1 = new JPanel();
		btn_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_1.setBackground(new Color(41, 57, 80));
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
		lblNewLabel_1.setIcon(new ImageIcon(Btn2_Button1.class.getResource("/P5_Img/icons8_exit_32px.png")));
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
		label.setIcon(new ImageIcon(Btn2_Button1.class.getResource("/P5_Img/icons8_search_32px.png")));
		
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
		btn_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btn_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_2.setLayout(null);
		btn_2.setBackground(new Color(255,255,255,20));
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
		lbl_btn2.setFont(new Font("KBIZÇÑ¸¶À½°íµñ H", Font.PLAIN, 20));
		lbl_btn2.setBounds(87, 30, 87, 24);
		btn_2.add(lbl_btn2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 0, 5, 80);
		btn_2.add(panel_2);
		
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
		lbl_btn3.setFont(new Font("KBIZÇÑ¸¶À½°íµñ H", Font.PLAIN, 20));
		lbl_btn3.setBounds(87, 30, 87, 24);
		btn_3.add(lbl_btn3);
		
		JPanel btn4 = new JPanel();
		btn4.addMouseListener(new MouseAdapter() {
			
			
		});
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
		lbl_btn4.setFont(new Font("KBIZÇÑ¸¶À½°íµñ H", Font.PLAIN, 20));
		lbl_btn4.setBounds(87, 30, 87, 24);
		btn4.add(lbl_btn4);
		
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
		lbl_logo.setIcon(new ImageIcon(Btn2_Button1.class.getResource("/P5_Img/icons8_uefa_euro_trophy_64px.png")));
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
		panel_3.setBackground(new Color(23,35,51));
		
		textField_1 = new JTextField();
		textField_1.setText("");
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("KBIZÇÑ¸¶À½°íµñ H", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBackground(new Color(23, 35, 51));
		textField_1.setBounds(-48, 84, 0, 0);
		panel_3.add(textField_1);
		
		textname = new JTextField();
		textname.setText("\uBCC0\uACBD\uD560 \uAD6C\uB2E8 \uC774\uB984");
		textname.setForeground(Color.WHITE);
		textname.setFont(new Font("KBIZÇÑ¸¶À½°íµñ B", Font.PLAIN, 14));
		textname.setColumns(10);
		textname.setBorder(null);
		textname.setBackground(new Color(23, 35, 51));
		textname.setBounds(885, 301, 316, 21);
		textname.addFocusListener(this);
		panel_3.add(textname);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(885, 332, 316, 2);
		panel_3.add(separator_1);
		
		JLabel label_2 = new JLabel("\uC774\uBBF8 \uC874\uC7AC\uD558\uB294 \uAD6C\uB2E8\uBA85\uC785\uB2C8\uB2E4.");
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("KBIZÇÑ¸¶À½°íµñ B", Font.PLAIN, 14));
		label_2.setBounds(885, 344, 265, 15);
		panel_3.add(label_2);
		
		textaddress = new JTextField();
		textaddress.setText("\uBCC0\uACBD\uD560 \uAD6C\uB2E8 \uC8FC\uC18C");
		textaddress.setForeground(Color.WHITE);
		textaddress.setFont(new Font("KBIZÇÑ¸¶À½°íµñ B", Font.PLAIN, 14));
		textaddress.setColumns(10);
		textaddress.setBorder(null);
		textaddress.setBackground(new Color(23, 35, 51));
		textaddress.setBounds(885, 369, 316, 21);
		panel_3.add(textaddress);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(885, 400, 316, 2);
		panel_3.add(separator_4);
		
		texthomepage = new JTextField();
		texthomepage.setText("\uBCC0\uACBD\uD560 \uAD6C\uB2E8 \uD648\uD398\uC774\uC9C0 \uC8FC\uC18C");
		texthomepage.setForeground(Color.WHITE);
		texthomepage.setFont(new Font("KBIZÇÑ¸¶À½°íµñ B", Font.PLAIN, 14));
		texthomepage.setColumns(10);
		texthomepage.setBorder(null);
		texthomepage.setBackground(new Color(23, 35, 51));
		texthomepage.setBounds(885, 420, 316, 21);
		panel_3.add(texthomepage);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(885, 451, 316, 2);
		panel_3.add(separator_5);
		
		JLabel label_8 = new JLabel("\uBCC0\uACBD\uD560 \uAD6C\uB2E8 \uC5F0\uB77D\uCC98");
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("KBIZÇÑ¸¶À½°íµñ B", Font.PLAIN, 14));
		label_8.setBounds(885, 515, 292, 15);
		panel_3.add(label_8);
		
		texttel = new JTextField();
		texttel.setText("\uBCC0\uACBD\uD560 \uAD6C\uB2E8 \uC5F0\uB77D\uCC98\r\n");
		texttel.setForeground(Color.WHITE);
		texttel.setFont(new Font("KBIZÇÑ¸¶À½°íµñ H", Font.PLAIN, 14));
		texttel.setColumns(10);
		texttel.setBorder(null);
		texttel.setBackground(new Color(23, 35, 51));
		texttel.setBounds(885, 476, 316, 21);
		panel_3.add(texttel);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(885, 507, 316, 2);
		panel_3.add(separator_6);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(240,240,240));
		panel_4.setBounds(885, 136, 100, 100);
		panel_3.add(panel_4);
		SpringLayout sl_panel_4 = new SpringLayout();
		panel_4.setLayout(sl_panel_4);
		
		JLabel lbl_image = new JLabel("");
		sl_panel_4.putConstraint(SpringLayout.NORTH, lbl_image, 0, SpringLayout.NORTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.WEST, lbl_image, 0, SpringLayout.WEST, panel_4);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, lbl_image, 100, SpringLayout.NORTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.EAST, lbl_image, 100, SpringLayout.WEST, panel_4);
		panel_4.add(lbl_image);
		
		JButton button_1 = new JButton("\uC0AC\uC9C4\uCC3E\uAE30");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("KBIZÇÑ¸¶À½°íµñ B", Font.PLAIN, 12));
		button_1.setBackground(new Color(71, 120, 197));
		button_1.setBounds(997, 213, 89, 23);
		panel_3.add(button_1);
		
		JButton button_2 = new JButton("\uBCC0\uACBD");
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("KBIZÇÑ¸¶À½°íµñ B", Font.PLAIN, 12));
		button_2.setBackground(new Color(71, 120, 197));
		button_2.setBounds(1121, 553, 80, 35);
		panel_3.add(button_2);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(229, 229, 229));
		separator_2.setBounds(116, 111, 500, 10);
		panel_3.add(separator_2);
		
		JLabel label_3 = new JLabel("\uAD6C\uB2E8\uBAA9\uB85D");
		label_3.setForeground(new Color(255, 255, 255));
		label_3.setFont(new Font("¸¸È­ÁøÈï¿øÃ¼", Font.PLAIN, 25));
		label_3.setBounds(116, 56, 139, 45);
		panel_3.add(label_3);
		
		JPanel panel = new JPanel();
		panel.setFont(new Font("KBIZÇÑ¸¶À½°íµñ M", Font.PLAIN, 14));
		panel.setBounds(116, 171, 500, 200);
		panel_3.add(panel);
		
		table = new JTable();
		table.setFont(new Font("KBIZÇÑ¸¶À½°íµñ M", Font.PLAIN, 14));
		table.setShowVerticalLines(false);
		table.setBorder(null);
		table.setRowHeight(40);
		table.setGridColor(Color.BLACK);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
			},
			new String[] {
				"\uC774\uC801 \uBA85\uB2E8", "\uC774\uB984"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(122);
		table.getColumnModel().getColumn(1).setPreferredWidth(194);
		table.getTableHeader().setBackground(new Color(120, 168, 252));
		table.getTableHeader().setForeground(new Color(255, 255, 255));
		table.setSelectionBackground(new Color(232, 57, 95));
		panel.setLayout(new CardLayout(0, 0));
		table.setBounds(12, 29, 500, 259);
		panel_3.add(table);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setFont(new Font("KBIZÇÑ¸¶À½°íµñ M", Font.PLAIN, 14));
		scrollPane.setBounds(12, 10, 1296, 738);
		panel.add(scrollPane, "name_8186182004900");
		
		table_3 = new JTable();
		table_3.setFont(new Font("KBIZÇÑ¸¶À½°íµñ M", Font.PLAIN, 14));
		table_3.setShowVerticalLines(false);
		table_3.setBorder(null);
		table_3.setRowHeight(40);
		table_3.setGridColor(Color.BLACK);
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
			},
			new String[] {
				"\uC2B9\uC778\uB300\uAE30 \uBA85\uB2E8", "\uC774\uB984"
			}
		));
		table_3.getColumnModel().getColumn(0).setPreferredWidth(149);
		table_3.getColumnModel().getColumn(1).setPreferredWidth(194);
		table_3.getTableHeader().setBackground(new Color(120, 168, 252));
		table_3.getTableHeader().setForeground(new Color(255, 255, 255));
		table_3.setSelectionBackground(new Color(232, 57, 95));
		table_3.setBounds(45, 479, 480, 240);
		panel_3.add(table_3);
		
		JScrollPane scrollPane_1 = new JScrollPane(table_3);
		scrollPane_1.setFont(new Font("KBIZÇÑ¸¶À½°íµñ M", Font.PLAIN, 14));
		scrollPane_1.setBounds(116, 473, 500, 200);
		panel_3.add(scrollPane_1);
		
		JButton button = new JButton("\uC774\uC801 \uC2B9\uC778");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("KBIZÇÑ¸¶À½°íµñ B", Font.PLAIN, 12));
		button.setBackground(new Color(71, 120, 197));
		button.setBounds(644, 475, 80, 35);
		panel_3.add(button);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setForeground(new Color(255, 255, 255));
		separator_3.setBounds(786, 56, 12, 697);
		panel_3.add(separator_3);
		
		
		
		int Group_Code=dto.getGroup_Code();
		
		gdao.selectAllGroups_Groupcode(Group_Code);
	
		
		
		ArrayList<GroupsDTO> list = gdao.selectAllGroups_Groupcode(Group_Code);
			
		
			System.out.println(list.get(0).getGroup_Name());
			System.out.println(list.get(0).getGroup_Address());
			System.out.println(list.get(0).getGroup_HomePage());
			System.out.println(list.get(0).getGroup_Tel());
			
			System.out.println(list.get(0).getGroup_Img_Bytes());
			 BufferedImage image=list.get(0).getGroup_ResizeImg(100, 100);
		
			 
			textname.setText(list.get(0).getGroup_Name());
			textaddress.setText(list.get(0).getGroup_Address());
			texthomepage.setText(list.get(0).getGroup_HomePage());
			texttel.setText(list.get(0).getGroup_Tel());
			lbl_image.setIcon(new ImageIcon(image));
		

	}

	@Override
	public void focusGained(FocusEvent e) {
		if (e.getSource()==textname) {
			textname.setText("");
		}
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}
}
