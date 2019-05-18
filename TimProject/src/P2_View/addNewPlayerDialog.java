package P2_View;

import java.awt.BorderLayout;
import java.awt.Point;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import P3_DAO.GroupsDAO;
import P4_DTO.GroupsDTO;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpringLayout;
import javax.swing.JLabel;

public class addNewPlayerDialog extends JDialog implements FocusListener {

	private final JPanel contentPanel = new JPanel();
	private static JDialog dialog;
	private static Point point = new Point();
	private JTextField txtDummy;
	private GroupsDAO dao = new GroupsDAO();
	private GroupsDTO result;
	private ArrayList<GroupsDTO> list;
	private JTextField txt_Name;
	private JTextField txt_Phone;
	private JTextField txt_Email;
	private JTextField txt_address;
	private JLabel Phone_label;

	/**
	 * Create the dialog.
	 * 
	 * @param result
	 */
	public addNewPlayerDialog(JTextField textField_1, GroupsDTO result) {
		IntegerDocument id = new IntegerDocument();

		setBounds(100, 100, 678, 466);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(23, 35, 51));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			{
				txtDummy = new JTextField();
				txtDummy.setBounds(0, 0, 0, 0);
				contentPanel.add(txtDummy);
				txtDummy.setColumns(10);
			}
		}

		JButton btn_accept = new JButton("»Æ¿Œ");
		btn_accept.setForeground(Color.WHITE);
		btn_accept.setBackground(new Color(71, 120, 197));
		btn_accept.setFont(new Font("BM_DOHYEON", Font.BOLD, 12));
		btn_accept.setBounds(200, 360, 70, 30);
		contentPanel.add(btn_accept);

		JButton btn_cancel = new JButton("√Îº“");
		btn_cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btn_cancel.setForeground(Color.WHITE);
		btn_cancel.setBackground(new Color(71, 120, 197));
		btn_cancel.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 12));
		btn_cancel.setBounds(350, 360, 70, 30);
		contentPanel.add(btn_cancel);

		txt_Name = new JTextField();
		txt_Name.setText("\uC774\uB984");
		txt_Name.setForeground(Color.WHITE);
		txt_Name.setFont(new Font("KBIZ«—∏∂¿Ω∞ÌµÒ M", Font.PLAIN, 14));
		txt_Name.setColumns(10);
		txt_Name.setBorder(null);
		txt_Name.setBackground(new Color(23, 35, 51));
		txt_Name.setBounds(124, 207, 145, 21);
		txt_Name.addFocusListener(this);
		contentPanel.add(txt_Name);

		JSeparator separator = new JSeparator();
		separator.setBounds(124, 238, 145, 2);
		contentPanel.add(separator);

		Phone_label = new JLabel("\uC5F0\uB77D\uCC98");
		Phone_label.setForeground(Color.WHITE);
		Phone_label.setFont(new Font("KBIZ«—∏∂¿Ω∞ÌµÒ M", Font.PLAIN, 14));
		Phone_label.setBounds(124, 256, 102, 15);
		contentPanel.add(Phone_label);

		txt_Phone = new JTextField();
		txt_Phone.setText("\uC5F0\uB77D\uCC98");
		txt_Phone.setForeground(Color.WHITE);
		txt_Phone.setFont(new Font("KBIZ«—∏∂¿Ω∞ÌµÒ M", Font.PLAIN, 14));
		txt_Phone.setColumns(10);
		txt_Phone.setBorder(null);
		txt_Phone.setBackground(new Color(23, 35, 51));
		txt_Phone.setBounds(124, 254, 145, 21);
		txt_Phone.setDocument(id);
		txt_Phone.addFocusListener(this);
		contentPanel.add(txt_Phone);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(124, 285, 145, 2);
		contentPanel.add(separator_1);

		txt_Email = new JTextField();
		txt_Email.setText("\uC774\uBA54\uC77C");
		txt_Email.setForeground(Color.WHITE);
		txt_Email.setFont(new Font("KBIZ«—∏∂¿Ω∞ÌµÒ M", Font.PLAIN, 14));
		txt_Email.setColumns(10);
		txt_Email.setBorder(null);
		txt_Email.setBackground(new Color(23, 35, 51));
		txt_Email.setBounds(350, 207, 145, 21);
		txt_Email.addFocusListener(this);
		contentPanel.add(txt_Email);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(350, 238, 145, 2);
		contentPanel.add(separator_2);

		txt_address = new JTextField();
		txt_address.setText("\uC8FC\uC18C");
		txt_address.setForeground(Color.WHITE);
		txt_address.setFont(new Font("KBIZ«—∏∂¿Ω∞ÌµÒ M", Font.PLAIN, 14));
		txt_address.setColumns(10);
		txt_address.setBorder(null);
		txt_address.setBackground(new Color(23, 35, 51));
		txt_address.setBounds(350, 254, 145, 21);
		txt_address.addFocusListener(this);
		contentPanel.add(txt_address);

		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(350, 285, 145, 2);
		contentPanel.add(separator_3);

		JPanel picturePanel = new JPanel();
		picturePanel.setBackground(Color.WHITE);
		picturePanel.setBounds(124, 56, 100, 100);
		contentPanel.add(picturePanel);
		picturePanel.setLayout(new SpringLayout());

		JButton btn_findPicture = new JButton("\uC0AC\uC9C4\uCC3E\uAE30");
		btn_findPicture.setForeground(Color.WHITE);
		btn_findPicture.setFont(new Font("KBIZ«—∏∂¿Ω∞ÌµÒ M", Font.PLAIN, 12));
		btn_findPicture.setBackground(new Color(71, 120, 197));
		btn_findPicture.setBounds(236, 131, 90, 25);
		contentPanel.add(btn_findPicture);

	}

	@Override
	public void focusGained(FocusEvent e) {
		if (e.getSource() == txt_Name) {
			txt_Name.setText("");
		} else if (e.getSource() == txt_Phone) {
			Phone_label.setText("");
		} else if (e.getSource() == txt_Email) {
			txt_Email.setText("");
		} else if (e.getSource() == txt_address) {
			txt_address.setText("");
		}
	}

	@Override
	public void focusLost(FocusEvent e) {

	}
}