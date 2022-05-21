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

public class accessories {

	JFrame frame;
	public double [] itemcost = new double[10];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					accessories window = new accessories();
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
	public accessories() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 463, 577);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel AccessoriesPanel = new JPanel();
		AccessoriesPanel.setLayout(null);
		AccessoriesPanel.setBorder(null);
		AccessoriesPanel.setBackground(new Color(204, 255, 255));
		AccessoriesPanel.setBounds(0, 0, 454, 544);
		frame.getContentPane().add(AccessoriesPanel);
		
		JPanel ringPanel_1 = new JPanel();
		ringPanel_1.setLayout(null);
		ringPanel_1.setBackground(new Color(204, 255, 255));
		ringPanel_1.setBounds(0, 40, 454, 103);
		AccessoriesPanel.add(ringPanel_1);
		
		JLabel redtshirt_3_1 = new JLabel("");
		redtshirt_3_1.setIcon(new ImageIcon("C:\\Users\\khunmuinnellim\\eclipse-workspace\\database\\image\\messageImage_1620021458006.jpg"));
		redtshirt_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		redtshirt_3_1.setBounds(49, 11, 108, 82);
		ringPanel_1.add(redtshirt_3_1);
		
		JLabel lblJeans_2_1 = new JLabel("Ring");
		lblJeans_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblJeans_2_1.setFont(new Font("Kanit", Font.PLAIN, 30));
		lblJeans_2_1.setBounds(200, 10, 83, 32);
		ringPanel_1.add(lblJeans_2_1);
		
		JLabel lblProducttypeid_1_2_1 = new JLabel("CS-010606");
		lblProducttypeid_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblProducttypeid_1_2_1.setFont(new Font("Kanit", Font.PLAIN, 13));
		lblProducttypeid_1_2_1.setBounds(200, 45, 138, 15);
		ringPanel_1.add(lblProducttypeid_1_2_1);
		
		JLabel lblRedTshirt_1_1_2_1 = new JLabel("300 Baht.");
		lblRedTshirt_1_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblRedTshirt_1_1_2_1.setForeground(new Color(0, 102, 204));
		lblRedTshirt_1_1_2_1.setFont(new Font("Kanit", Font.PLAIN, 25));
		lblRedTshirt_1_1_2_1.setBounds(200, 70, 108, 32);
		ringPanel_1.add(lblRedTshirt_1_1_2_1);
		
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
		btnNewButton_1_1.setBounds(28, 477, 112, 36);
		AccessoriesPanel.add(btnNewButton_1_1);
	}

}
