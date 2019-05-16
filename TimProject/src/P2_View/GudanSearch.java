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

public class GudanSearch extends JDialog implements FocusListener{

	private final JPanel contentPanel = new JPanel();
	private static JDialog dialog;
	private static Point point = new Point();
	private JTextField txt_gudan;
	private JTextField textField;

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
			txt_gudan.setBounds(139, 132, 316, 21);
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
			gudan_separator.setBounds(139, 163, 316, 2);
			contentPanel.add(gudan_separator);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(23, 35, 51));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		

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
