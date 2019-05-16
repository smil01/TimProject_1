package P2_View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Button;

public class GudanSearch extends JDialog implements FocusListener{

	private final JPanel contentPanel = new JPanel();
	private static JDialog dialog;
	private static Point point = new Point();
	private JTextField txt_gudan;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			dialog = new GudanSearch();
			dialog.addMouseListener(new MouseAdapter() {
	            public void mousePressed(MouseEvent e) {
	                point.x = e.getX();
	                point.y = e.getY();
	            }
	        });
	        dialog.addMouseMotionListener(new MouseMotionAdapter() {
	            public void mouseDragged(MouseEvent e) {
	                Point p = dialog.getLocation();
	                dialog.setLocation(p.x + e.getX() - point.x, p.y + e.getY() - point.y);
	            }
	        });
			dialog.setUndecorated(true);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GudanSearch() {
		setBounds(100, 100, 678, 466);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(23, 35, 51));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			txt_gudan = new JTextField();
			txt_gudan.setText("구단이름검색");
			txt_gudan.setForeground(Color.WHITE);
			txt_gudan.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
			txt_gudan.setColumns(10);
			txt_gudan.setBorder(null);
			txt_gudan.setBackground(new Color(23, 35, 51));
			txt_gudan.setBounds(173, 48, 316, 21);
			txt_gudan.addFocusListener(this);
			{
				textField = new JTextField();
				textField.setBounds(0, 0, 0, 0);
				contentPanel.add(textField);
				textField.setColumns(10);
			}
			contentPanel.add(txt_gudan);
		}
		{
			JSeparator gudan_separator = new JSeparator();
			gudan_separator.setBounds(173, 79, 316, 2);
			contentPanel.add(gudan_separator);
		}
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(42, 117, 576, 214);
		table.getTableHeader().setBackground(new Color(120, 168, 252)); //컬럼이름 색깔
		table.getTableHeader().setForeground(new Color(255,255,255)); // 컬럼이름 폰트색깔
		table.setSelectionBackground(new Color(232,57,95)); //JTable 선택시 색깔
		table.setRowHeight(20);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(81, 123, 500, 180);
		contentPanel.add(scrollPane);
		
		JButton btn_accept = new JButton("확인");
		btn_accept.setForeground(Color.WHITE);
		btn_accept.setBackground(new Color(71, 120, 197));
		btn_accept.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		btn_accept.setBounds(200, 360, 70, 30);
		contentPanel.add(btn_accept);
		
		JButton btn_cancel = new JButton("취소");
		btn_cancel.setForeground(Color.WHITE);
		btn_cancel.setBackground(new Color(71, 120, 197));
		btn_cancel.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		btn_cancel.setBounds(350, 360, 70, 30);
		contentPanel.add(btn_cancel);
		

	}

	@Override
	public void focusGained(FocusEvent e) {
		if (e.getSource() == txt_gudan) {
			txt_gudan.setText("");
		}
	}

	@Override
	public void focusLost(FocusEvent e) {
		
	}
}
