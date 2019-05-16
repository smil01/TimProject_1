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
		textField.setFont(new Font("", Font.PLAIN, 14));
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
		lbl_X.setFont(new Font("", Font.PLAIN, 16));

		txt_id = new JTextField();
		txt_id.setBorder(null);
		txt_id.setText("\uC774\uBA54\uC77C\uC8FC\uC18C(\uC544\uC774\uB514)");
		txt_id.setFont(new Font("", Font.PLAIN, 14));
		txt_id.setForeground(new Color(255, 255, 255));
		txt_id.setBackground(new Color(23, 35, 51));
		txt_id.setBounds(110, 193, 316, 21);
		txt_id.addFocusListener(this);
		panel_back_left.add(txt_id);
		txt_id.setColumns(10);

		JSeparator id_separator = new JSeparator();
		id_separator.setBounds(110, 224, 316, 2);
		panel_back_left.add(id_separator);

		JLabel lbl_id_check = new JLabel("\uC774\uBBF8 \uC874\uC7AC\uD558\uB294 \uC774\uBA54\uC77C \uC8FC\uC18C\uC785\uB2C8\uB2E4.");
		lbl_id_check.setForeground(new Color(255, 0, 0));
		lbl_id_check.setFont(new Font("", Font.PLAIN, 14));
		lbl_id_check.setBounds(110, 236, 265, 15);
		panel_back_left.add(lbl_id_check);

		lbl_pw = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lbl_pw.setForeground(Color.WHITE);
		lbl_pw.setFont(new Font("", Font.PLAIN, 16));
		lbl_pw.setBounds(110, 273, 75, 15);
		panel_back_left.add(lbl_pw);
		

		pwField = new JPasswordField();
		pwField.setFont(new Font("", Font.PLAIN, 16));
		pwField.setBorder(null);
		pwField.setForeground(Color.WHITE);
		pwField.setBackground(new Color(23, 35, 51));
		pwField.setBounds(110, 269, 316, 21);
		pwField.addFocusListener(this);
		panel_back_left.add(pwField);

		JSeparator pw_separator = new JSeparator();
		pw_separator.setBounds(110, 300, 316, 2);
		panel_back_left.add(pw_separator);

		JLabel lbl_pw_check = new JLabel("\uBE44\uBC00\uBC88\uD638\uB294 8\uC790\uB9AC \uC774\uC0C1\uC774\uC5B4\uC57C\uD569\uB2C8\uB2E4.");
		lbl_pw_check.setForeground(Color.RED);
		lbl_pw_check.setFont(new Font("", Font.PLAIN, 14));
		lbl_pw_check.setBounds(110, 312, 265, 15);
		panel_back_left.add(lbl_pw_check);

		lbl_pw_re = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		lbl_pw_re.setForeground(Color.WHITE);
		lbl_pw_re.setFont(new Font("", Font.PLAIN, 16));
		lbl_pw_re.setBounds(110, 351, 102, 15);
		panel_back_left.add(lbl_pw_re);

		pwField_re = new JPasswordField();
		pwField_re.setForeground(Color.WHITE);
		pwField_re.setFont(new Font("", Font.PLAIN, 16));
		pwField_re.setBorder(null);
		pwField_re.setBackground(new Color(23, 35, 51));
		pwField_re.setBounds(110, 347, 316, 21);
		pwField_re.addFocusListener(this);
		panel_back_left.add(pwField_re);

		JSeparator pw_re_separator = new JSeparator();
		pw_re_separator.setBounds(110, 378, 316, 2);
		panel_back_left.add(pw_re_separator);

		JLabel lbl_pw_re_check = new JLabel("\uBE44\uBC00\uBC88\uD638\uAC00 \uC77C\uCE58\uD558\uC9C0 \uC54A\uC2B5\uB2C8\uB2E4");
		lbl_pw_re_check.setForeground(Color.RED);
		lbl_pw_re_check.setFont(new Font("", Font.PLAIN, 14));
		lbl_pw_re_check.setBounds(110, 390, 265, 15);
		panel_back_left.add(lbl_pw_re_check);

		txt_nickname = new JTextField();
		txt_nickname.setText("\uB2C9\uB124\uC784");
		txt_nickname.setForeground(Color.WHITE);
		txt_nickname.setFont(new Font("", Font.PLAIN, 14));
		txt_nickname.setColumns(10);
		txt_nickname.setBorder(null);
		txt_nickname.setBackground(new Color(23, 35, 51));
		txt_nickname.setBounds(110, 431, 316, 21);
		txt_nickname.addFocusListener(this);
		panel_back_left.add(txt_nickname);

		JSeparator nickname_separator = new JSeparator();
		nickname_separator.setBounds(110, 462, 316, 2);
		panel_back_left.add(nickname_separator);

		JLabel lbl_nickname_check = new JLabel("\uC774\uBBF8 \uC874\uC7AC\uD558\uB294 \uB2C9\uB124\uC784\uC785\uB2C8\uB2E4");
		lbl_nickname_check.setForeground(Color.RED);
		lbl_nickname_check.setFont(new Font("", Font.PLAIN, 14));
		lbl_nickname_check.setBounds(110, 474, 265, 15);
		panel_back_left.add(lbl_nickname_check);
		
		IntegerDocument  id = new IntegerDocument ();
		txt_address = new JTextField();
		txt_address.setText("\uC8FC\uC18C");
		txt_address.setForeground(Color.WHITE);
		txt_address.setFont(new Font("", Font.PLAIN, 14));
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
		
		lbl_tel = new JLabel("\uC5F0\uB77D\uCC98");
		lbl_tel.setForeground(Color.WHITE);
		lbl_tel.setFont(new Font("", Font.PLAIN, 16));
		lbl_tel.setBounds(110, 571, 75, 15);
		panel_back_left.add(lbl_tel);
	
		
		txt_tel = new JTextField();
		txt_tel.setForeground(Color.WHITE);
		txt_tel.setFont(new Font("", Font.PLAIN, 14));
		txt_tel.setColumns(10);
		txt_tel.setBorder(null);
		txt_tel.setBackground(new Color(23, 35, 51));
		txt_tel.setBounds(110, 567, 316, 21);
		txt_tel.setDocument(id);
		txt_tel.addFocusListener(this);
		panel_back_left.add(txt_tel);
		
		JSeparator tel_separator = new JSeparator();
		tel_separator.setBounds(110, 598, 316, 2);
		panel_back_left.add(tel_separator);
		
		textField_1 = new JTextField();
		textField_1.setText("\uAD6C\uB2E8");
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBackground(new Color(23, 35, 51));
		textField_1.setBounds(110, 640, 316, 21);
		panel_back_left.add(textField_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(110, 671, 316, 2);
		panel_back_left.add(separator);
		
		JButton btnNewButton = new JButton("\uAD6C\uB2E8\uCC3E\uAE30");
		btnNewButton.setBounds(428, 640, 89, 23);
		panel_back_left.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(110, 57, 100, 100);
		panel_back_left.add(panel_1);
		
		JButton button = new JButton("\uC0AC\uC9C4\uCC3E\uAE30");
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
