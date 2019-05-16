package P2_View;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class SignUpWindow extends JPanel implements FocusListener {
	private JTextField txt_id;
	private JPasswordField pwField;
	private JPasswordField pwField_re;
	private JTextField txt_nickname;
	private JTextField textField;
	JLabel lbl_pw;
	JLabel lbl_pw_re;
	private JTextField txt_address;
	private JTextField txt_tel;
	JLabel lbl_tel;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */

	public SignUpWindow() {
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
		textField.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBackground(new Color(23, 35, 51));
		textField.setBounds(0, 0, 0, 0);
		panel_back_left.add(textField);

		JLabel lbl_X = new JLabel("X");
		lbl_X.setBounds(1567, 10, 21, 15);
		panel_back_left.add(lbl_X);
		lbl_X.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lbl_X.setForeground(Color.WHITE);
		lbl_X.setFont(new Font("맑은 고딕", Font.PLAIN, 16));

		txt_id = new JTextField();
		txt_id.setBorder(null);
		txt_id.setText("이메일");
		txt_id.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		txt_id.setForeground(new Color(255, 255, 255));
		txt_id.setBackground(new Color(23, 35, 51));
		txt_id.setBounds(110, 193, 316, 21);
		txt_id.addFocusListener(this);
		panel_back_left.add(txt_id);
		txt_id.setColumns(10);

		JSeparator id_separator = new JSeparator();
		id_separator.setBounds(110, 224, 316, 2);
		panel_back_left.add(id_separator);

		JLabel lbl_id_check = new JLabel("이미 사용중인 아이디입니다.");
		lbl_id_check.setForeground(new Color(255, 0, 0));
		lbl_id_check.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		lbl_id_check.setBounds(110, 236, 265, 15);
		panel_back_left.add(lbl_id_check);

		lbl_pw = new JLabel("비밀번호");
		lbl_pw.setForeground(Color.WHITE);
		lbl_pw.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lbl_pw.setBounds(110, 273, 75, 15);
		panel_back_left.add(lbl_pw);
		

		pwField = new JPasswordField();
		pwField.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		pwField.setBorder(null);
		pwField.setForeground(Color.WHITE);
		pwField.setBackground(new Color(23, 35, 51));
		pwField.setBounds(110, 269, 316, 21);
		pwField.addFocusListener(this);
		panel_back_left.add(pwField);

		JSeparator pw_separator = new JSeparator();
		pw_separator.setBounds(110, 300, 316, 2);
		panel_back_left.add(pw_separator);

		JLabel lbl_pw_check = new JLabel("비밀번호는 8자리 이상이어야 합니다.");
		lbl_pw_check.setForeground(Color.RED);
		lbl_pw_check.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		lbl_pw_check.setBounds(110, 312, 265, 15);
		panel_back_left.add(lbl_pw_check);

		lbl_pw_re = new JLabel("비밀번호 확인");
		lbl_pw_re.setForeground(Color.WHITE);
		lbl_pw_re.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lbl_pw_re.setBounds(110, 351, 102, 15);
		panel_back_left.add(lbl_pw_re);

		pwField_re = new JPasswordField();
		pwField_re.setForeground(Color.WHITE);
		pwField_re.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		pwField_re.setBorder(null);
		pwField_re.setBackground(new Color(23, 35, 51));
		pwField_re.setBounds(110, 347, 316, 21);
		pwField_re.addFocusListener(this);
		panel_back_left.add(pwField_re);

		JSeparator pw_re_separator = new JSeparator();
		pw_re_separator.setBounds(110, 378, 316, 2);
		panel_back_left.add(pw_re_separator);

		JLabel lbl_pw_re_check = new JLabel("비밀번호가 동일하지 않습니다.");
		lbl_pw_re_check.setForeground(Color.RED);
		lbl_pw_re_check.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		lbl_pw_re_check.setBounds(110, 390, 265, 15);
		panel_back_left.add(lbl_pw_re_check);

		txt_nickname = new JTextField();
		txt_nickname.setText("닉네임");
		txt_nickname.setForeground(Color.WHITE);
		txt_nickname.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		txt_nickname.setColumns(10);
		txt_nickname.setBorder(null);
		txt_nickname.setBackground(new Color(23, 35, 51));
		txt_nickname.setBounds(110, 431, 316, 21);
		txt_nickname.addFocusListener(this);
		panel_back_left.add(txt_nickname);

		JSeparator nickname_separator = new JSeparator();
		nickname_separator.setBounds(110, 462, 316, 2);
		panel_back_left.add(nickname_separator);

		JLabel lbl_nickname_check = new JLabel("이미 사용중인 닉네임입니다.");
		lbl_nickname_check.setForeground(Color.RED);
		lbl_nickname_check.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		lbl_nickname_check.setBounds(110, 474, 265, 15);
		panel_back_left.add(lbl_nickname_check);
		
		IntegerDocument  id = new IntegerDocument ();
		txt_address = new JTextField();
		txt_address.setText("주소");
		txt_address.setForeground(Color.WHITE);
		txt_address.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		txt_address.setColumns(10);
		txt_address.setBorder(null);
		txt_address.setBackground(new Color(23, 35, 51));
		txt_address.setBounds(110, 511, 316, 21);
		txt_address.addFocusListener(this);
		panel_back_left.add(txt_address);
		
		
		JSeparator address_separator = new JSeparator();
		address_separator.setBounds(110, 542, 316, 2);
		panel_back_left.add(address_separator);
		
		JPanel panel_back_right = new JPanel();
		panel_back_right.setBounds(548, 0, 1052, 900);
		panel.add(panel_back_right);
		panel_back_right.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(SignUpWindow.class.getResource("/P5_Img/sample.jpg")));
		panel_back_right.add(lblNewLabel, "name_66785696311000");
		
		lbl_tel = new JLabel("연락처");
		lbl_tel.setForeground(Color.WHITE);
		lbl_tel.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lbl_tel.setBounds(110, 571, 75, 15);
		panel_back_left.add(lbl_tel);
	
		
		txt_tel = new JTextField();
		txt_tel.setForeground(Color.WHITE);
		txt_tel.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		txt_tel.setColumns(10);
		txt_tel.setBorder(null);
		txt_tel.setBackground(new Color(23, 35, 51));
		txt_tel.setBounds(110, 567, 316, 21);
		txt_tel.setDocument(id); // 숫자만 입력받을수있게 하기
		txt_tel.addFocusListener(this);
		panel_back_left.add(txt_tel);
		
		JSeparator tel_separator = new JSeparator();
		tel_separator.setBounds(110, 598, 316, 2);
		panel_back_left.add(tel_separator);
		
		textField_1 = new JTextField();
		textField_1.setText("구단");
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBackground(new Color(23, 35, 51));
		textField_1.setBounds(110, 640, 316, 21);
		panel_back_left.add(textField_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(110, 671, 316, 2);
		panel_back_left.add(separator);
		
		JButton btnNewButton = new JButton("구단 찾기");
		btnNewButton.setBounds(428, 640, 89, 23);
		panel_back_left.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(110, 57, 100, 100);
		panel_back_left.add(panel_1);
		
		JButton button = new JButton("찾아보기");
		button.setBounds(428, 94, 89, 23);
		panel_back_left.add(button);
	}

	@Override
	public void focusGained(FocusEvent e) {
		if (e.getSource() == txt_id) {
			txt_id.setText("");
		} else if (e.getSource() == txt_nickname) {
			txt_nickname.setText("");
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

	}
}
