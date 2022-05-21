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

public class shoes {

	JFrame frame;
	public double [] itemcost = new double[10];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					shoes window = new shoes();
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
	public shoes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 462, 576);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel ShoesPanel = new JPanel();
		ShoesPanel.setLayout(null);
		ShoesPanel.setBorder(null);
		ShoesPanel.setBackground(new Color(204, 255, 255));
		ShoesPanel.setBounds(0, 0, 454, 544);
		frame.getContentPane().add(ShoesPanel);
		
		JPanel blacksneakerPanel_1 = new JPanel();
		blacksneakerPanel_1.setLayout(null);
		blacksneakerPanel_1.setBackground(new Color(204, 255, 255));
		blacksneakerPanel_1.setBounds(0, 35, 454, 147);
		ShoesPanel.add(blacksneakerPanel_1);
		
		JLabel redtshirt_2_1 = new JLabel("");
		redtshirt_2_1.setIcon(new ImageIcon("C:\\Users\\khunmuinnellim\\eclipse-workspace\\database\\image\\messageImage_1620021445118.jpg"));
		redtshirt_2_1.setVerticalAlignment(SwingConstants.BOTTOM);
		redtshirt_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		redtshirt_2_1.setBounds(21, 11, 153, 125);
		blacksneakerPanel_1.add(redtshirt_2_1);
		
		JLabel lblJeans_1_1 = new JLabel("Black Sneakers");
		lblJeans_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblJeans_1_1.setFont(new Font("Kanit", Font.PLAIN, 30));
		lblJeans_1_1.setBounds(200, 30, 211, 32);
		blacksneakerPanel_1.add(lblJeans_1_1);
		
		JLabel lblProducttypeid_1_1_1 = new JLabel("CS-010502");
		lblProducttypeid_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblProducttypeid_1_1_1.setFont(new Font("Kanit", Font.PLAIN, 13));
		lblProducttypeid_1_1_1.setBounds(200, 65, 138, 15);
		blacksneakerPanel_1.add(lblProducttypeid_1_1_1);
		
		JLabel lblRedTshirt_1_1_1_1 = new JLabel("1,900 Baht.");
		lblRedTshirt_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblRedTshirt_1_1_1_1.setForeground(new Color(0, 102, 204));
		lblRedTshirt_1_1_1_1.setFont(new Font("Kanit", Font.PLAIN, 25));
		lblRedTshirt_1_1_1_1.setBounds(200, 90, 138, 32);
		blacksneakerPanel_1.add(lblRedTshirt_1_1_1_1);
		
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
		btnNewButton_1_1.setBounds(26, 477, 112, 36);
		ShoesPanel.add(btnNewButton_1_1);
	}

}
