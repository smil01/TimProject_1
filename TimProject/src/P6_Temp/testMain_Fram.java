package P6_Temp;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import P3_DAO.testDAO;
import P4_DTO.testDTO;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class testMain_Fram {

	private JFrame frame;
	private JTextField text_id;
	private JTextField test_pw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testMain_Fram window = new testMain_Fram();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public testMain_Fram() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 580, 392);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel label = new JLabel("");
		label.setBounds(219, 0, 345, 344);

		frame.getContentPane().setLayout(null);

		label.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(label);

		text_id = new JTextField();
		text_id.setBounds(52, 39, 155, 21);
		frame.getContentPane().add(text_id);
		text_id.setColumns(10);

		JLabel lblId = new JLabel("ID");
		lblId.setBounds(29, 42, 57, 15);
		frame.getContentPane().add(lblId);

		test_pw = new JTextField();
		test_pw.setBounds(52, 70, 155, 21);
		frame.getContentPane().add(test_pw);
		test_pw.setColumns(10);

		JLabel lblNewLabel = new JLabel("PW");
		lblNewLabel.setBounds(29, 73, 57, 15);
		frame.getContentPane().add(lblNewLabel);

		JButton button = new JButton("\uB85C\uADF8\uC778");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				testDAO dao = new testDAO();
				testDTO dto = dao.Login(new testDTO("odd03@naver.com", 0, null, "1234", null, null, null, null, 0));

				if (dto == null) {
					System.out.println("로그인실패");
				} else {
					System.out.println("로그인성공");
					label.setIcon(new ImageIcon(dto.getMember_ResizeImg(345, 344)));
				}
			}
		});
		button.setBounds(78, 101, 97, 23);
		frame.getContentPane().add(button);
	}
}
