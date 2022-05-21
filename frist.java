package database;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JPasswordField;


public class frist {

	private JFrame frame;
	private final JPanel background = new JPanel();
	private final JPanel panel = new JPanel();
	private final JLabel lblNewLabel_2 = new JLabel("Password");
	JTextField emailLoginField;
	JPasswordField passwordLoginField;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frist window = new frist();
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
	public frist() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 720, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		background.setBackground(new Color(204, 255, 255));
		background.setBounds(0, 0, 704, 561);
		frame.getContentPane().add(background);
		background.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBorder(null);
		panel.setBounds(0, 0, 704, 88);
		background.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CLOTH STORE");
		lblNewLabel.setBounds(23, 11, 217, 66);
		lblNewLabel.setFont(new Font("Kanit", Font.PLAIN, 35));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("E-mail Address");
		lblNewLabel_1.setFont(new Font("Kanit", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(121, 247, 182, 38);
		background.add(lblNewLabel_1);
		lblNewLabel_2.setFont(new Font("Kanit", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(121, 304, 182, 38);
		background.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PreparedStatement st;
				ResultSet rs;
				
				//get the email and password
				String email = emailLoginField.getText();
				String password = passwordLoginField.getText();
		
			
				try {
					Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloth_store","root","Khunmuinnellim01");
					System.out.println("Irasshaimase");
					
					//SELECT statement
					
					String selectSql = "SELECT * FROM login WHERE Email = '"+email+"' and Password = '"+password+"'";
					Statement selectStatement = connect.createStatement();
					ResultSet selectResult = selectStatement.executeQuery(selectSql);
					if (selectResult.next()) {
							JOptionPane.showMessageDialog(btnNewButton,"Login Successfully");
							mianmenu menu = new mianmenu();
							menu.main(null);
							frame.dispose();
					}
					else	JOptionPane.showMessageDialog(btnNewButton, "Incorrect email or password , Please try again");
					
					connect.close();
					
					
					
				} catch (SQLException e1) {
					System.out.println("itai yooooooo~");
					e1.printStackTrace();
				}
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Kanit", Font.PLAIN, 20));
		btnNewButton.setBounds(181, 387, 107, 38);
		background.add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExit.setFont(new Font("Kanit", Font.PLAIN, 20));
		btnExit.setBounds(405, 387, 107, 38);
		background.add(btnExit);
		
		emailLoginField = new JTextField();
		emailLoginField.setFont(new Font("Kanit", Font.PLAIN, 15));
		emailLoginField.setBounds(313, 247, 282, 38);
		background.add(emailLoginField);
		emailLoginField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\" FASHION AS UNIQUE AS YOU ARE \"");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Kanit", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(102, 155, 514, 63);
		background.add(lblNewLabel_3);
		
		passwordLoginField = new JPasswordField();
		passwordLoginField.setBounds(313, 304, 282, 38);
		background.add(passwordLoginField);
	}
}
