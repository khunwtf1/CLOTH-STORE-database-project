package database;

import java.awt.EventQueue;

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
import java.awt.Font;
import javax.swing.ImageIcon;

public class top {

	JFrame frame;
	public double [] itemcost = new double[10];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					top window = new top();
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
	public top() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 467, 576);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel TopPanel = new JPanel();
		TopPanel.setLayout(null);
		TopPanel.setBorder(null);
		TopPanel.setBackground(new Color(204, 255, 255));
		TopPanel.setBounds(0, 0, 454, 544);
		frame.getContentPane().add(TopPanel);
		
		JPanel redtshirtPanel_1 = new JPanel();
		redtshirtPanel_1.setLayout(null);
		redtshirtPanel_1.setBackground(new Color(204, 255, 255));
		redtshirtPanel_1.setBounds(0, 28, 454, 147);
		TopPanel.add(redtshirtPanel_1);
		
		JLabel redtshirt_4 = new JLabel("");
		redtshirt_4.setIcon(new ImageIcon("C:\\Users\\khunmuinnellim\\eclipse-workspace\\database\\image\\messageImage_1620021514192.jpg"));
		redtshirt_4.setHorizontalAlignment(SwingConstants.CENTER);
		redtshirt_4.setBounds(24, 0, 151, 142);
		redtshirtPanel_1.add(redtshirt_4);
		
		JLabel lblRedTshirt_2 = new JLabel("Red T-Shirt");
		lblRedTshirt_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblRedTshirt_2.setFont(new Font("Kanit", Font.PLAIN, 30));
		lblRedTshirt_2.setBounds(200, 30, 167, 32);
		redtshirtPanel_1.add(lblRedTshirt_2);
		
		JLabel lblProducttypeid_2 = new JLabel("CS-010101");
		lblProducttypeid_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblProducttypeid_2.setFont(new Font("Kanit", Font.PLAIN, 13));
		lblProducttypeid_2.setBounds(200, 65, 138, 15);
		redtshirtPanel_1.add(lblProducttypeid_2);
		
		JLabel lblRedTshirt_1_2 = new JLabel("200 Baht.");
		lblRedTshirt_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblRedTshirt_1_2.setForeground(new Color(0, 102, 204));
		lblRedTshirt_1_2.setFont(new Font("Kanit", Font.PLAIN, 25));
		lblRedTshirt_1_2.setBounds(200, 90, 108, 32);
		redtshirtPanel_1.add(lblRedTshirt_1_2);
		
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
		btnNewButton_1_1.setBounds(21, 483, 112, 36);
		TopPanel.add(btnNewButton_1_1);
	}

}
