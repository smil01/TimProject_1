package P2_View;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

import P3_DAO.SignUpDAO;
import P3_DAO.testDAO;
import P4_DTO.GroupsDTO;
import P4_DTO.SignUpDTO;
import P7_Util.AddressToLocalCode;
import P7_Util.Emailcheck;
import P7_Util.fileExtension;
import P7_Util.passwordCheck;
import oracle.core.lmx.LmxRepConversion;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpringLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class SignUpWindow extends JPanel implements FocusListener {
	private JTextField txt_id;
	private JPasswordField pwField;
	private JPasswordField pwField_re;
	private JTextField txt_nickname;
	private JTextField textField;
	public JPanel picture_panel;
	JLabel lbl_pw;
	JLabel lbl_pw_re;
	private JTextField txt_address;
	private JTextField txt_tel;
	public String jPath;
	JLabel lbl_tel;
	private JLabel lbl_icon;
	private JTextField textField_1;
	public SignUpDAO dao = new SignUpDAO();
	public JLabel lbl_id_check;
	public JFrame frame;
	public JLabel lbl_pw_check;
	public JLabel lbl_pw_re_check ;
	public int MembershipType_index;
	public JLabel lbl_nickname_check ;
	public GroupsDTO result = new GroupsDTO();

	/**
	 * Create the panel.
	 */

	public SignUpWindow(JFrame frame) {
		this.frame = frame;
		
		setLayout(new CardLayout(0, 0));

		JPanel panel = new JPanel();
		add(panel, "name_849222918453700");
		panel.setLayout(null);

		JPanel panel_back_left = new JPanel();
		panel_back_left.setBounds(0, 0, 548, 900);
		panel.add(panel_back_left);
		panel_back_left.setBackground(new Color(23, 35, 51));
		panel_back_left.setLayout(null);

		textField = new JTextField();
		textField.setText("");
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBackground(new Color(23, 35, 51));
		textField.setBounds(0, 0, 0, 0);
		panel_back_left.add(textField);

		txt_id = new JTextField();
		txt_id.setBorder(null);
		txt_id.setText("\uC774\uBA54\uC77C\uC8FC\uC18C(\uC544\uC774\uB514)");
		txt_id.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 14));
		txt_id.setForeground(new Color(255, 255, 255));
		txt_id.setBackground(new Color(23, 35, 51));
		txt_id.setBounds(77, 231, 316, 21);
		txt_id.addFocusListener(this);
		panel_back_left.add(txt_id);
		txt_id.setColumns(10);

		JSeparator id_separator = new JSeparator();
		id_separator.setBounds(77, 262, 316, 2);
		panel_back_left.add(id_separator);

		lbl_id_check = new JLabel("\uD544\uC218 \uC785\uB825 \uC694\uC18C \uC785\uB2C8\uB2E4.");
		lbl_id_check.setForeground(new Color(255, 0, 0));
		lbl_id_check.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 14));
		lbl_id_check.setBounds(77, 274, 265, 15);
		panel_back_left.add(lbl_id_check);

		lbl_pw = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lbl_pw.setForeground(Color.WHITE);
		lbl_pw.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 14));
		lbl_pw.setBounds(77, 311, 75, 15);
		panel_back_left.add(lbl_pw);

		pwField = new JPasswordField();
		pwField.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 14));
		pwField.setBorder(null);
		pwField.setForeground(Color.WHITE);
		pwField.setBackground(new Color(23, 35, 51));
		pwField.setBounds(77, 307, 316, 21);
		pwField.addFocusListener(this);
		panel_back_left.add(pwField);

		JSeparator pw_separator = new JSeparator();
		pw_separator.setBounds(77, 338, 316, 2);
		panel_back_left.add(pw_separator);

		 lbl_pw_check = new JLabel(
				"\uBE44\uBC00\uBC88\uD638\uB294 8\uC790\uB9AC \uC774\uC0C1\uC774\uC5B4\uC57C\uD569\uB2C8\uB2E4.");
		lbl_pw_check.setForeground(Color.RED);
		lbl_pw_check.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 14));
		lbl_pw_check.setBounds(77, 350, 265, 15);
		panel_back_left.add(lbl_pw_check);

		lbl_pw_re = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		lbl_pw_re.setForeground(Color.WHITE);
		lbl_pw_re.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 14));
		lbl_pw_re.setBounds(77, 389, 102, 15);
		panel_back_left.add(lbl_pw_re);

		pwField_re = new JPasswordField();
		pwField_re.setForeground(Color.WHITE);
		pwField_re.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 14));
		pwField_re.setBorder(null);
		pwField_re.setBackground(new Color(23, 35, 51));
		pwField_re.setBounds(77, 385, 316, 21);
		pwField_re.addFocusListener(this);
		panel_back_left.add(pwField_re);

		JSeparator pw_re_separator = new JSeparator();
		pw_re_separator.setBounds(77, 416, 316, 2);
		panel_back_left.add(pw_re_separator);

		lbl_pw_re_check = new JLabel(
				"\uBE44\uBC00\uBC88\uD638\uAC00 \uC77C\uCE58\uD558\uC9C0 \uC54A\uC2B5\uB2C8\uB2E4");
		lbl_pw_re_check.setForeground(Color.RED);
		lbl_pw_re_check.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 14));
		lbl_pw_re_check.setBounds(77, 428, 265, 15);
		panel_back_left.add(lbl_pw_re_check);

		txt_nickname = new JTextField();
		txt_nickname.setText("\uB2C9\uB124\uC784");
		txt_nickname.setForeground(Color.WHITE);
		txt_nickname.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 14));
		txt_nickname.setColumns(10);
		txt_nickname.setBorder(null);
		txt_nickname.setBackground(new Color(23, 35, 51));
		txt_nickname.setBounds(77, 469, 316, 21);
		txt_nickname.addFocusListener(this);
		panel_back_left.add(txt_nickname);

		JSeparator nickname_separator = new JSeparator();
		nickname_separator.setBounds(77, 500, 316, 2);
		panel_back_left.add(nickname_separator);

		lbl_nickname_check = new JLabel(
				"\uD544\uC218 \uC785\uB825 \uC694\uC18C \uC785\uB2C8\uB2E4.");
		lbl_nickname_check.setForeground(Color.RED);
		lbl_nickname_check.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 14));
		lbl_nickname_check.setBounds(77, 512, 265, 15);
		panel_back_left.add(lbl_nickname_check);

		IntegerDocument id = new IntegerDocument();
		txt_address = new JTextField();
		txt_address.setText("\uC8FC\uC18C");
		txt_address.setForeground(Color.WHITE);
		txt_address.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 14));
		txt_address.setColumns(10);
		txt_address.setBorder(null);
		txt_address.setBackground(new Color(23, 35, 51));
		txt_address.setBounds(77, 549, 316, 21);
		txt_address.addFocusListener(this);
		panel_back_left.add(txt_address);

		JSeparator address_separator = new JSeparator();
		address_separator.setBounds(77, 580, 316, 2);
		panel_back_left.add(address_separator);

		JPanel panel_back_right = new JPanel();
		panel_back_right.setBackground(new Color(23, 35, 51));
		panel_back_right.setBounds(548, 0, 1052, 900);
		panel.add(panel_back_right);
		panel_back_right.setLayout(null);

		JLabel lbl_X = new JLabel("X");
		lbl_X.setBounds(1024, 10, 16, 27);
		panel_back_right.add(lbl_X);
		lbl_X.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lbl_X.setForeground(Color.WHITE);
		lbl_X.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 14));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(SignUpWindow.class.getResource("/P5_Img/SignImg.jpg")));
		lblNewLabel.setBounds(0, 0, 1052, 900);
		panel_back_right.add(lblNewLabel);

		lbl_tel = new JLabel("\uC5F0\uB77D\uCC98");
		lbl_tel.setForeground(Color.WHITE);
		lbl_tel.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 14));
		lbl_tel.setBounds(77, 609, 75, 15);
		panel_back_left.add(lbl_tel);

		txt_tel = new JTextField();
		txt_tel.setForeground(Color.WHITE);
		txt_tel.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 14));
		txt_tel.setColumns(10);
		txt_tel.setBorder(null);
		txt_tel.setBackground(new Color(23, 35, 51));
		txt_tel.setBounds(77, 605, 316, 21);
		txt_tel.setDocument(id);
		txt_tel.addFocusListener(this);
		panel_back_left.add(txt_tel);

		JSeparator tel_separator = new JSeparator();
		tel_separator.setBounds(77, 636, 316, 2);
		panel_back_left.add(tel_separator);

		textField_1 = new JTextField();
		textField_1.setText("\uAD6C\uB2E8");
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBackground(new Color(23, 35, 51));
		textField_1.setBounds(77, 661, 316, 21);
		panel_back_left.add(textField_1);

		JSeparator separator = new JSeparator();
		separator.setBounds(77, 692, 316, 2);
		panel_back_left.add(separator);

		JButton btnNewButton = new JButton("\uAD6C\uB2E8\uCC3E\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Gudan_SearchModify gudan = new Gudan_SearchModify(textField_1, result);
				gudan.setUndecorated(true);
				gudan.setVisible(true);
			}
		});
		
		btnNewButton.setBounds(402, 661, 90, 25);
		btnNewButton.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 12));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(71, 120, 197));
		panel_back_left.add(btnNewButton);

		picture_panel = new JPanel();
		picture_panel.setBackground(new Color(255, 255, 255));
		picture_panel.setBounds(77, 95, 100, 100);

		panel_back_left.add(picture_panel);
		SpringLayout sl_picture_panel = new SpringLayout();
		picture_panel.setLayout(sl_picture_panel);

		lbl_icon = new JLabel("");
		sl_picture_panel.putConstraint(SpringLayout.NORTH, lbl_icon, 0, SpringLayout.NORTH, picture_panel);
		sl_picture_panel.putConstraint(SpringLayout.WEST, lbl_icon, 0, SpringLayout.WEST, picture_panel);
		sl_picture_panel.putConstraint(SpringLayout.SOUTH, lbl_icon, 100, SpringLayout.NORTH, picture_panel);
		sl_picture_panel.putConstraint(SpringLayout.EAST, lbl_icon, 100, SpringLayout.WEST, picture_panel);
		picture_panel.add(lbl_icon);

		JButton btn_picutre = new JButton("\uC0AC\uC9C4\uCC3E\uAE30");
		btn_picutre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
				FileNameExtensionFilter ExtenseFilter = new FileNameExtensionFilter("이미지파일 ", "jpg", "gif", "png");

				jfc.setFileFilter(ExtenseFilter);
				int returnValue = jfc.showOpenDialog(null);
				// int returnValue = jfc.showSaveDialog(null);

				if (returnValue == JFileChooser.APPROVE_OPTION) {
					File selectedFile = jfc.getSelectedFile();

					boolean ExtensionOfFile = fileExtension.getfileExtension(selectedFile.getAbsolutePath());
					System.out.println(ExtensionOfFile);
					if (ExtensionOfFile) {

						JOptionPane.showMessageDialog(null, "업로드완료");
						jPath = selectedFile.getAbsolutePath();

						SignUpDTO dto = new SignUpDTO();

						dto.setMember_Img(jPath);
						dto.getMember_Img();

						lbl_icon.setIcon(new ImageIcon(dto.getMember_ResizeImg(100, 100)));

					} else {
						JOptionPane.showMessageDialog(null, "이미지 확장자를 넣어주세요 ");

					}

				} else {
					JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다", "경고", JOptionPane.WARNING_MESSAGE);
				}
			}

		});
		btn_picutre.setBounds(200, 95, 90, 25);
		btn_picutre.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 12));
		btn_picutre.setForeground(new Color(255, 255, 255));
		btn_picutre.setBackground(new Color(71, 120, 197));
		panel_back_left.add(btn_picutre);

		JButton button = new JButton("\uD655\uC778");

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddressToLocalCode L_Code = new AddressToLocalCode();
				int member_LocalCode = L_Code.getLocalCode(txt_address.getText());
				String textpassword = String.valueOf(pwField.getPassword());
				System.out.println(textpassword);

				SignUpDTO dto = new SignUpDTO(txt_id.getText(), result.getGroup_Code(), txt_nickname.getText(), textpassword,
						txt_tel.getText(), member_LocalCode, txt_address.getText(), jPath, MembershipType_index);
				System.out.println(dto);
				dao = new SignUpDAO();
				int cnt = dao.join(dto);
				if (cnt > 0) {
					JOptionPane.showMessageDialog(null, "회원가입에 성공하셨습니다.\n 로그인창으로 돌아갑니다.", "회원가입 성공", JOptionPane.PLAIN_MESSAGE);
					JPanel LoginWindow = new LoginWindow(frame);
					frame.getContentPane().removeAll();
					frame.getContentPane().add(LoginWindow);
					frame.revalidate();
					frame.repaint();
					
					
				} else {
					JOptionPane.showMessageDialog(null, "입력된 정보를 확인해 주세요", "회원가입 실패", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		button.setForeground(Color.WHITE);
		button.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 12));
		button.setBackground(new Color(71, 120, 197));
		button.setBounds(77, 761, 80, 35);
		panel_back_left.add(button);

		JButton button_1 = new JButton("\uCDE8\uC18C");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel LoginWindow = new LoginWindow(frame);
				frame.getContentPane().removeAll();
				frame.getContentPane().add(LoginWindow);
				frame.revalidate();
				frame.repaint();			
			}
		});
		
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 12));
		button_1.setBackground(new Color(71, 120, 197));
		button_1.setBounds(231, 761, 80, 35);
		panel_back_left.add(button_1);
		
		JLabel label = new JLabel("\uD68C\uC6D0\uC720\uD615");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 14));
		label.setBounds(200, 146, 75, 15);
		panel_back_left.add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 MembershipType_index=comboBox.getSelectedIndex();
				
			}
		});
		comboBox.setForeground(new Color(255, 255, 255));
		comboBox.setBackground(new Color(71, 120, 197));
		
		comboBox.setFont(new Font("KBIZ한마음고딕 M", Font.PLAIN, 14));
		comboBox.setBorder(null);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uAC10\uB3C5", "\uCF54\uCE58", "\uC2A4\uCE74\uC6B0\uD130", "\uAE30\uD0C0"}));
		comboBox.setBounds(200, 171, 90, 25);
		panel_back_left.add(comboBox);
	}

	@Override
	public void focusGained(FocusEvent e) {
		if (e.getSource() == txt_id) {
			txt_id.setText("");
		} else if (e.getSource() == txt_nickname) {
			
		} else if (e.getSource() == pwField) {
			lbl_pw.setText("");
		} else if (e.getSource() == pwField_re) {
			lbl_pw_re.setText("");
		} else if (e.getSource() == txt_tel) {
			lbl_tel.setText("");
		} else if (e.getSource() == txt_address) {
			txt_address.setText("");
		}

	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		Emailcheck echeck= new Emailcheck();
		if (e.getSource() == txt_id) {
			System.out.println(txt_id.getText());
			System.out.println(dao.isEmailJoin(txt_id.getText()));
			System.out.println("중복값 확인할 아이디 : odd03@naver.com");

			if (dao.isEmailJoin(txt_id.getText())) {
				lbl_id_check.setForeground(Color.RED);

				lbl_id_check.setText("이미 사용중인 아이디입니다. ");

			} 
			else if (echeck.Emailcheck(txt_id.getText())) {
				lbl_id_check.setForeground(Color.red);
				lbl_id_check.setText("이메일 형태로 작성바랍니다. ");
			}
			else if (!dao.isEmailJoin(txt_id.getText())&&!echeck.Emailcheck(txt_id.getText())) {
				lbl_id_check.setForeground(Color.green);
				lbl_id_check.setText("멋진아이디네요!!");
			}
		}
		String textpassword = String.valueOf(pwField.getPassword());
		if (e.getSource() == pwField) {
			passwordCheck pcheck=new passwordCheck();
			if (pcheck.checkPw(textpassword)) {
				lbl_pw_check.setForeground(Color.red);
				lbl_pw_check.setText("8자이상16이하 으로 입력해주세요");
			}else if(!pcheck.checkPw(textpassword)){
				lbl_pw_check.setText("잘했어요");
				lbl_pw_check.setForeground(Color.GREEN);
			}
			System.out.println("패스워드>>"+textpassword);
		}
		if (e.getSource()==pwField_re) {
			
			String textpassword_re = String.valueOf(pwField_re.getPassword());
			if (!textpassword.equals(textpassword_re)) {
				lbl_pw_re_check.setForeground(Color.red);
				lbl_pw_re_check.setText("비밀번호 를 동일하게 입력해주세요 ");
			}
		else if (textpassword_re.equals(textpassword)) {
			
			lbl_pw_re_check.setForeground(Color.GREEN);
			lbl_pw_re_check.setText("잘했어요");
		}
			System.out.println("패스워드re>>"+textpassword_re);
	}
		if (e.getSource()==txt_nickname) {
			if (!txt_nickname.getText().equals(null)) {
				lbl_nickname_check.setForeground(Color.GREEN);
				lbl_nickname_check.setText("잘했어요");
			}else {
				lbl_nickname_check.setForeground(Color.red);
				lbl_nickname_check.setText("필수 입력 요소 입니다.");
			}
		}
}
}
