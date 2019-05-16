package P2_View;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import javazoom.jl.player.MP3Player;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SignUpWindow extends JPanel {
	private JTextField txt_id;
	private JPasswordField pwField;
	private MP3Player mp3 = new MP3Player();
	private JPasswordField pwField_re;
	private JTextField txt_nickname;

	/**
	 * Create the panel.
	 */

	public SignUpWindow() {
		mp3.play("src/P7_Util/Champions_league.mp3");

		setLayout(new CardLayout(0, 0));

		JPanel panel = new JPanel();
		add(panel, "name_849222918453700");
		panel.setLayout(null);

		JPanel panel_back_right = new JPanel();
		panel_back_right.setBounds(0, 0, 1600, 900);
		panel.add(panel_back_right);
		panel_back_right.setBackground(new Color(23, 35, 51));
		panel_back_right.setLayout(null);
		
				JLabel lbl_X = new JLabel("X");
				lbl_X.setBounds(1567, 10, 21, 15);
				panel_back_right.add(lbl_X);
				lbl_X.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						System.exit(0);
					}
				});
				lbl_X.setForeground(Color.WHITE);
				lbl_X.setFont(new Font("맑은 고딕", Font.PLAIN, 16));

		JLabel lbl_id = new JLabel("이메일");
		lbl_id.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lbl_id.setForeground(new Color(255, 255, 255));
		lbl_id.setBounds(128, 91, 57, 15);
		panel_back_right.add(lbl_id);

		txt_id = new JTextField();
		txt_id.setBorder(null);
		txt_id.setText("");
		txt_id.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		txt_id.setForeground(new Color(255, 255, 255));
		txt_id.setBackground(new Color(23, 35, 51));
		txt_id.setBounds(128, 116, 316, 21);
		panel_back_right.add(txt_id);
		txt_id.setColumns(10);

		JSeparator id_separator = new JSeparator();
		id_separator.setBounds(128, 147, 316, 2);
		panel_back_right.add(id_separator);
		
		JLabel lbl_id_check = new JLabel("이미 사용중인 아이디입니다.");
		lbl_id_check.setForeground(new Color(255, 0, 0));
		lbl_id_check.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		lbl_id_check.setBounds(128, 159, 265, 15);
		panel_back_right.add(lbl_id_check);

		JLabel lbl_pw = new JLabel("비밀번호");
		lbl_pw.setForeground(Color.WHITE);
		lbl_pw.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lbl_pw.setBounds(128, 196, 75, 15);
		panel_back_right.add(lbl_pw);

		pwField = new JPasswordField();
		pwField.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		pwField.setBorder(null);
		pwField.setForeground(Color.WHITE);
		pwField.setBackground(new Color(23, 35, 51));
		pwField.setBounds(128, 221, 316, 21);
		panel_back_right.add(pwField);
		
				JSeparator pw_separator = new JSeparator();
				pw_separator.setBounds(128, 252, 316, 2);
				panel_back_right.add(pw_separator);
		
		JLabel lbl_pw_check = new JLabel("비밀번호는 8자리 이상이어야 합니다.");
		lbl_pw_check.setForeground(Color.RED);
		lbl_pw_check.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		lbl_pw_check.setBounds(128, 263, 265, 15);
		panel_back_right.add(lbl_pw_check);
				
				JLabel lbl_pw_re = new JLabel("비밀번호 확인");
				lbl_pw_re.setForeground(Color.WHITE);
				lbl_pw_re.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
				lbl_pw_re.setBounds(128, 301, 102, 15);
				panel_back_right.add(lbl_pw_re);
				
				pwField_re = new JPasswordField();
				pwField_re.setForeground(Color.WHITE);
				pwField_re.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
				pwField_re.setBorder(null);
				pwField_re.setBackground(new Color(23, 35, 51));
				pwField_re.setBounds(128, 326, 316, 21);
				panel_back_right.add(pwField_re);
				
				JSeparator pw_re_separator = new JSeparator();
				pw_re_separator.setBounds(128, 357, 316, 2);
				panel_back_right.add(pw_re_separator);
				
				JLabel lbl_pw_re_check = new JLabel("비밀번호가 동일하지 않습니다.");
				lbl_pw_re_check.setForeground(Color.RED);
				lbl_pw_re_check.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
				lbl_pw_re_check.setBounds(128, 368, 265, 15);
				panel_back_right.add(lbl_pw_re_check);
				
				JLabel lbl_nickname = new JLabel("닉네임");
				lbl_nickname.setForeground(Color.WHITE);
				lbl_nickname.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
				lbl_nickname.setBounds(128, 403, 57, 15);
				panel_back_right.add(lbl_nickname);
				
				txt_nickname = new JTextField();
				txt_nickname.setText("");
				txt_nickname.setForeground(Color.WHITE);
				txt_nickname.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
				txt_nickname.setColumns(10);
				txt_nickname.setBorder(null);
				txt_nickname.setBackground(new Color(23, 35, 51));
				txt_nickname.setBounds(128, 428, 316, 21);
				panel_back_right.add(txt_nickname);
				
				JSeparator nickname_separator = new JSeparator();
				nickname_separator.setBounds(128, 459, 316, 2);
				panel_back_right.add(nickname_separator);
				
				JLabel lbl_nickname_check = new JLabel("이미 사용중인 닉네임입니다.");
				lbl_nickname_check.setForeground(Color.RED);
				lbl_nickname_check.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
				lbl_nickname_check.setBounds(128, 471, 265, 15);
				panel_back_right.add(lbl_nickname_check);

	}
}
