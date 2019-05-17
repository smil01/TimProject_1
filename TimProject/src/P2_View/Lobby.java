package P2_View;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import P4_DTO.loginDTO;

import javax.swing.JScrollPane;
import java.awt.Cursor;

public class Lobby extends JPanel {
   private JTextField textField;

   JFrame frame;
   loginDTO dto;

   public Lobby(JFrame frame, loginDTO dto) {
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
      lbl_program_name.setFont(new Font("고양체", Font.PLAIN, 20));
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

      JLabel lbl_profileImg = new JLabel(new ImageIcon(dto.getMember_ResizeImg(100, 100)));
      lbl_profileImg.setHorizontalAlignment(SwingConstants.CENTER);
      Profile_ImagePanel.add(lbl_profileImg, "name_54594167799700");

      JPanel Profile_Nickname = new JPanel();
      Profile_Nickname.setBackground(new Color(84, 125, 206));
      Profile_Nickname.setBounds(100, 0, 180, 100);
      ProfilePanel.add(Profile_Nickname);
      Profile_Nickname.setLayout(null);

      JLabel label_1 = new JLabel(dto.getMember_Nickname());
      label_1.setForeground(Color.WHITE);
      label_1.setFont(new Font("KBIZ한마음고딕 B", Font.PLAIN, 16));
      label_1.setBounds(30, 38, 100, 25);
      Profile_Nickname.add(label_1);

      JPanel btn_1 = new JPanel();
      btn_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      btn_1.setBackground(new Color(41, 57, 80));
      btn_1.setBounds(0, 361, 300, 80);
      LeftLobbyPanel.add(btn_1);
      btn_1.setLayout(null);

      JLabel lbl_btn1 = new JLabel("\uC120\uC218\uAD00\uB9AC");
      lbl_btn1.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent arg0) {
            JPanel Stn1_Button1 = new Btn1_Button1(frame,dto);
            frame.getContentPane().removeAll();
            frame.getContentPane().add(Stn1_Button1);
            frame.revalidate();
            frame.repaint();

         }
      });
      lbl_btn1.setBounds(87, 30, 87, 24);
      lbl_btn1.setFont(new Font("KBIZ한마음고딕 H", Font.PLAIN, 20));
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
      lblNewLabel_1.setIcon(new ImageIcon(Lobby.class.getResource("/P5_Img/icons8_exit_32px.png")));
      ExitIconPanel.add(lblNewLabel_1, "name_58332631504300");

      JPanel panel_1 = new JPanel();
      panel_1.setBackground(new Color(41, 57, 80));
      panel_1.setBounds(74, 0, 226, 80);
      ExitPanel.add(panel_1);
      panel_1.setLayout(null);

      JLabel lblNewLabel_2 = new JLabel("\uB098\uAC00\uAE30");
      lblNewLabel_2.setBounds(0, 10, 111, 60);
      lblNewLabel_2.setFont(new Font("KBIZ한마음고딕 B", Font.BOLD, 20));
      lblNewLabel_2.setForeground(new Color(255, 255, 255));
      lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
      panel_1.add(lblNewLabel_2);

      JPanel SearchPanel = new JPanel();
      SearchPanel.setBackground(new Color(41, 57, 80));
      SearchPanel.setBounds(0, 59, 300, 54);
      LeftLobbyPanel.add(SearchPanel);
      SearchPanel.setLayout(null);

      JPanel SearchIconPanel = new JPanel();
      SearchIconPanel.setBounds(12, 10, 32, 32);
      SearchIconPanel.setBackground(new Color(41, 57, 80));
      SearchPanel.add(SearchIconPanel);
      SearchIconPanel.setLayout(null);

      JLabel label = new JLabel("");
      label.setBounds(0, 0, 32, 32);
      label.setHorizontalAlignment(SwingConstants.CENTER);
      label.setIcon(new ImageIcon(Lobby.class.getResource("/P5_Img/icons8_search_32px.png")));

      SearchIconPanel.add(label);

      JPanel SearchTxtPanel = new JPanel();
      SearchTxtPanel.setBounds(46, 0, 254, 68);
      SearchTxtPanel.setBackground(new Color(41, 57, 80));
      SearchPanel.add(SearchTxtPanel);
      SearchTxtPanel.setLayout(null);

      textField = new JTextField();
      textField.setFont(new Font("KBIZ한마음고딕 B", Font.PLAIN, 14));
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
      btn_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      btn_2.setLayout(null);
      btn_2.setBackground(new Color(41, 57, 80));
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
      lbl_btn2.setFont(new Font("KBIZ한마음고딕 H", Font.PLAIN, 20));
      lbl_btn2.setBounds(87, 30, 87, 24);
      btn_2.add(lbl_btn2);

      JPanel btn_3 = new JPanel();
      btn_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      btn_3.setLayout(null);
      btn_3.setBackground(new Color(41, 57, 80));
      btn_3.setBounds(0, 517, 300, 80);
      LeftLobbyPanel.add(btn_3);

      JLabel lbl_btn3 = new JLabel("\uC774\uC801\uAD00\uB9AC");
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
      lbl_btn3.setFont(new Font("KBIZ한마음고딕 H", Font.PLAIN, 20));
      lbl_btn3.setBounds(87, 30, 87, 24);
      btn_3.add(lbl_btn3);

      JPanel btn4 = new JPanel();
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
      lbl_btn4.setFont(new Font("KBIZ한마음고딕 H", Font.PLAIN, 20));
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
      lbl_logo.setIcon(new ImageIcon(Lobby.class.getResource("/P5_Img/icons8_uefa_euro_trophy_64px.png")));
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
      lblNewLabel.setFont(new Font("KBIZ한마음고딕 H", Font.PLAIN, 25));
      GudanName.add(lblNewLabel);
      
      JPanel panel = new JPanel();
      panel.setLayout(null);
      panel.setBackground(Color.WHITE);
      panel.setBounds(280, 104, 1320, 796);
      Lobby_Panel.add(panel);
      
      JPanel panel_2 = new JPanel();
      panel_2.setBounds(90, 50, 180, 180);
      panel.add(panel_2);
      panel_2.setLayout(new CardLayout(0, 0));
      
      JPanel panel_4 = new JPanel();
      panel_4.setLayout(null);
      panel_4.setBackground(Color.WHITE);
      panel_4.setBounds(345, 50, 468, 230);
      panel.add(panel_4);
      
      JLabel label_4 = new JLabel("\uAD6C\uB2E8\uC774\uB984");
      label_4.setForeground(new Color(153, 153, 153));
      label_4.setFont(new Font("만화진흥원체", Font.PLAIN, 16));
      label_4.setBounds(12, 10, 71, 32);
      panel_4.add(label_4);
      
      JLabel label_5 = new JLabel("\uC6CC\uB9AC\uC5B4\uC988");
      label_5.setForeground(new Color(189, 178, 137));
      label_5.setFont(new Font("만화진흥원체", Font.PLAIN, 35));
      label_5.setBounds(12, 52, 139, 40);
      panel_4.add(label_5);
      
      JLabel label_6 = new JLabel("\uC9C0\uC5ED");
      label_6.setForeground(new Color(153, 153, 153));
      label_6.setFont(new Font("만화진흥원체", Font.PLAIN, 16));
      label_6.setBounds(220, 10, 48, 32);
      panel_4.add(label_6);
      
      JLabel label_7 = new JLabel("\uAD11\uC8FC\uAD11\uC5ED\uC2DC");
      label_7.setForeground(new Color(189, 178, 137));
      label_7.setFont(new Font("만화진흥원체", Font.PLAIN, 35));
      label_7.setBounds(220, 52, 157, 40);
      panel_4.add(label_7);
      
      JLabel label_2 = new JLabel("\uC8FC\uC18C");
      label_2.setForeground(new Color(153, 153, 153));
      label_2.setFont(new Font("만화진흥원체", Font.PLAIN, 16));
      label_2.setBounds(12, 141, 60, 32);
      panel_4.add(label_2);
      
      JLabel label_3 = new JLabel("\uAD11\uC8FC\uAD11\uC5ED\uC2DC \uB0A8\uAD6C \uC1A1\uC554\uB85C 60 \uAD11\uC8FC CGI \uC13C\uD130");
      label_3.setForeground(Color.BLACK);
      label_3.setFont(new Font("만화진흥원체", Font.PLAIN, 16));
      label_3.setBounds(12, 183, 444, 19);
      panel_4.add(label_3);
      
      JLabel label_17 = new JLabel("\uAD6C\uB2E8 \uC2A4\uD0EF");
      label_17.setForeground(Color.BLACK);
      label_17.setFont(new Font("만화진흥원체", Font.PLAIN, 35));
      label_17.setBounds(90, 317, 139, 45);
      panel.add(label_17);
      
      JLabel label_29 = new JLabel("\uB300\uD68C \uC131\uC801");
      label_29.setForeground(Color.BLACK);
      label_29.setFont(new Font("만화진흥원체", Font.PLAIN, 25));
      label_29.setBounds(90, 383, 139, 45);
      panel.add(label_29);
      
      JSeparator separator_2 = new JSeparator();
      separator_2.setForeground(new Color(229, 229, 229));
      separator_2.setBounds(90, 438, 994, 10);
      panel.add(separator_2);
      
      JLabel label_30 = new JLabel("25");
      label_30.setForeground(new Color(189, 178, 137));
      label_30.setFont(new Font("만화진흥원체", Font.PLAIN, 35));
      label_30.setBounds(125, 458, 48, 32);
      panel.add(label_30);
      
      JLabel label_31 = new JLabel("\uACE8");
      label_31.setForeground(new Color(153, 153, 153));
      label_31.setFont(new Font("만화진흥원체", Font.PLAIN, 16));
      label_31.setBounds(125, 500, 48, 32);
      panel.add(label_31);
      
      JLabel label_32 = new JLabel("25");
      label_32.setForeground(new Color(189, 178, 137));
      label_32.setFont(new Font("만화진흥원체", Font.PLAIN, 35));
      label_32.setBounds(288, 458, 48, 32);
      panel.add(label_32);
      
      JLabel label_33 = new JLabel("\uC5B4\uC2DC\uC2A4\uD2B8");
      label_33.setForeground(new Color(153, 153, 153));
      label_33.setFont(new Font("만화진흥원체", Font.PLAIN, 16));
      label_33.setBounds(288, 500, 60, 32);
      panel.add(label_33);
      
      JLabel label_34 = new JLabel("25");
      label_34.setForeground(new Color(189, 178, 137));
      label_34.setFont(new Font("만화진흥원체", Font.PLAIN, 35));
      label_34.setBounds(471, 458, 48, 32);
      panel.add(label_34);
      
      JLabel label_35 = new JLabel("\uC720\uD6A8\uC29B");
      label_35.setForeground(new Color(153, 153, 153));
      label_35.setFont(new Font("만화진흥원체", Font.PLAIN, 16));
      label_35.setBounds(471, 500, 48, 32);
      panel.add(label_35);
      
      JLabel label_36 = new JLabel("25");
      label_36.setForeground(new Color(189, 178, 137));
      label_36.setFont(new Font("만화진흥원체", Font.PLAIN, 35));
      label_36.setBounds(677, 458, 48, 32);
      panel.add(label_36);
      
      JLabel label_37 = new JLabel("\uC29B");
      label_37.setForeground(new Color(153, 153, 153));
      label_37.setFont(new Font("만화진흥원체", Font.PLAIN, 16));
      label_37.setBounds(677, 500, 48, 32);
      panel.add(label_37);
      
      JLabel label_38 = new JLabel("25");
      label_38.setForeground(new Color(189, 178, 137));
      label_38.setFont(new Font("만화진흥원체", Font.PLAIN, 35));
      label_38.setBounds(879, 458, 48, 32);
      panel.add(label_38);
      
      JLabel label_39 = new JLabel("\uD65C\uB3D9\uB7C9");
      label_39.setForeground(new Color(153, 153, 153));
      label_39.setFont(new Font("만화진흥원체", Font.PLAIN, 16));
      label_39.setBounds(879, 500, 48, 32);
      panel.add(label_39);
      
      JLabel label_8 = new JLabel("");
      label_8.setIcon(new ImageIcon(Lobby.class.getResource("/P5_Img/1-Line-Chart.png")));
      label_8.setHorizontalAlignment(SwingConstants.LEFT);
      label_8.setBounds(840, 50, 468, 230);
      panel.add(label_8);
      
      JLabel label_9 = new JLabel("");
      label_9.setIcon(new ImageIcon(Lobby.class.getResource("/P5_Img/piechart1.png")));
      label_9.setBounds(104, 557, 100, 100);
      panel.add(label_9);
      
      JLabel label_10 = new JLabel("");
      label_10.setIcon(new ImageIcon(Lobby.class.getResource("/P5_Img/piechart1.png")));
      label_10.setBounds(267, 557, 100, 100);
      panel.add(label_10);
      
      JLabel label_11 = new JLabel("");
      label_11.setIcon(new ImageIcon(Lobby.class.getResource("/P5_Img/piechart1.png")));
      label_11.setBounds(440, 557, 100, 100);
      panel.add(label_11);
      
      JLabel label_12 = new JLabel("");
      label_12.setIcon(new ImageIcon(Lobby.class.getResource("/P5_Img/piechart1.png")));
      label_12.setBounds(647, 557, 100, 100);
      panel.add(label_12);
      
      JLabel label_13 = new JLabel("");
      label_13.setIcon(new ImageIcon(Lobby.class.getResource("/P5_Img/piechart1.png")));
      label_13.setBounds(854, 557, 100, 100);
      panel.add(label_13);

   }
}