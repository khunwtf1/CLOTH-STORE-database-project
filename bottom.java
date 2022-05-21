package database;

import java.awt.Color;
import java.awt.EventQueue;
import java.time.*;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JDesktopPane;
import javax.swing.JLayeredPane;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class bottom {

	JFrame frame;
	public double [] itemcost = new double[10];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bottom window = new bottom();
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
	public bottom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 463, 578);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel BottomPanel = new JPanel();
		BottomPanel.setLayout(null);
		BottomPanel.setBorder(null);
		BottomPanel.setBackground(new Color(204, 255, 255));
		BottomPanel.setBounds(0, 0, 454, 544);
		frame.getContentPane().add(BottomPanel);
		
		JPanel jeansPanel_1 = new JPanel();
		jeansPanel_1.setLayout(null);
		jeansPanel_1.setBackground(new Color(204, 255, 255));
		jeansPanel_1.setBounds(0, 33, 454, 147);
		BottomPanel.add(jeansPanel_1);
		
		JLabel redtshirt_1_1 = new JLabel("");
		redtshirt_1_1.setIcon(new ImageIcon("C:\\Users\\khunmuinnellim\\eclipse-workspace\\database\\image\\messageImage_1620021451712.jpg"));
		redtshirt_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		redtshirt_1_1.setBounds(25, 0, 151, 147);
		jeansPanel_1.add(redtshirt_1_1);
		
		JLabel lblJeans_3 = new JLabel("Jeans");
		lblJeans_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblJeans_3.setFont(new Font("Kanit", Font.PLAIN, 30));
		lblJeans_3.setBounds(200, 30, 83, 32);
		jeansPanel_1.add(lblJeans_3);
		
		JLabel lblProducttypeid_1_3 = new JLabel("CS-010204");
		lblProducttypeid_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblProducttypeid_1_3.setFont(new Font("Kanit", Font.PLAIN, 13));
		lblProducttypeid_1_3.setBounds(200, 65, 138, 15);
		jeansPanel_1.add(lblProducttypeid_1_3);
		
		JLabel lblRedTshirt_1_1_3 = new JLabel("590 Baht.");
		lblRedTshirt_1_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblRedTshirt_1_1_3.setForeground(new Color(0, 102, 204));
		lblRedTshirt_1_1_3.setFont(new Font("Kanit", Font.PLAIN, 25));
		lblRedTshirt_1_1_3.setBounds(200, 90, 108, 32);
		jeansPanel_1.add(lblRedTshirt_1_1_3);
		
		JButton btnNewButton_1_1 = new JButton("Back");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				produuuct prod = new produuuct();
				prod.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_1_1.setFont(new Font("Kanit", Font.PLAIN, 20));
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setBackground(new Color(102, 204, 255));
		btnNewButton_1_1.setBounds(24, 477, 112, 36);
		BottomPanel.add(btnNewButton_1_1);
	}

}
