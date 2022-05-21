package database;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Random;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import java.awt.print.*;


import net.proteanit.sql.DbUtils;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTable;
import java.awt.*;
import javax.swing.JTextPane;

public class bankaccouont {

	JFrame frame;
	public JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bankaccouont window = new bankaccouont();
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
	public bankaccouont() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 342, 326);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CLOTH STORE");
		lblNewLabel.setFont(new Font("Kanit", Font.PLAIN, 35));
		lblNewLabel.setBounds(52, 11, 217, 66);
		frame.getContentPane().add(lblNewLabel);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Kanit", Font.PLAIN, 13));
		textArea.setBounds(10, 70, 306, 206);
		frame.getContentPane().add(textArea);
	}

}
