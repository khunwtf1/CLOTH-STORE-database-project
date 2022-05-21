package database;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class registre {

	private JFrame frame;
	private JTextField emailField;
	private JTextField nameField;
	private JTextField telField;
	
	String url = "jdbc:mysql://localhost:3306/cloth_store";
	String username = "root";
	String password = "Khunmuinnellim01";
	private JTextField addressField;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registre window = new registre();
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
	public registre() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 228, 181));
		frame.setBounds(100, 100, 600, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("E-mail Address");
		lblNewLabel_1.setFont(new Font("Kanit", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(44, 161, 155, 38);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Kanit", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(44, 226, 106, 38);
		frame.getContentPane().add(lblNewLabel_2);
		
		emailField = new JTextField();
		emailField.setForeground(new Color(0, 0, 0));
		emailField.setFont(new Font("Kanit", Font.PLAIN, 15));
		emailField.setColumns(10);
		emailField.setBounds(227, 161, 313, 38);
		frame.getContentPane().add(emailField);
		
		JLabel lblNewLabel_3 = new JLabel("SIGN IN");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Kanit", Font.PLAIN, 50));
		lblNewLabel_3.setBounds(44, 46, 168, 63);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name");
		lblNewLabel_1_1.setFont(new Font("Kanit", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(44, 299, 86, 38);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		nameField = new JTextField();
		nameField.setFont(new Font("Kanit", Font.PLAIN, 15));
		nameField.setColumns(10);
		nameField.setBounds(227, 299, 313, 38);
		frame.getContentPane().add(nameField);
		
		JLabel lblNewLabel_1_2 = new JLabel("Address");
		lblNewLabel_1_2.setFont(new Font("Kanit", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(44, 440, 86, 38);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		telField = new JTextField();
		telField.setFont(new Font("Kanit", Font.PLAIN, 15));
		telField.setColumns(10);
		telField.setBounds(227, 370, 313, 38);
		frame.getContentPane().add(telField);
		
		
		addressField = new JTextField();
		addressField.setFont(new Font("Kanit", Font.PLAIN, 15));
		addressField.setColumns(10);
		addressField.setBounds(227, 442, 313, 38);
		frame.getContentPane().add(addressField);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Telephone");
		lblNewLabel_1_1_1.setFont(new Font("Kanit", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(44, 370, 106, 38);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setBounds(227, 229, 313, 38);
		frame.getContentPane().add(passwordField);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email = emailField.getText();
				String name = nameField.getText();
                String password = passwordField.getText();
                String phone = telField.getText();
                int len = phone.length();
                String address = addressField.getText();
                String msg = "" + name;
                msg += " \n";
                if (len != 10) {
                    JOptionPane.showMessageDialog(btnRegister, "Enter a valid mobile number");
                }

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloth_store", "root", "Khunmuinnellim01");

                    String query1 = "INSERT INTO customer values"
                    		+ "('CS100','" + name + "','" +phone + "','" + address +"','" + password + "','1212312121','EMP03','" + email + "')";
                    String query2 = "INSERT INTO ";

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query1);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnRegister, "This is alredy exist");
                    } else {
                        JOptionPane.showMessageDialog(btnRegister,
                            "Welcome, " + msg + "Your account is sucessfully created");
                    }
                    connection.close();
                    frist login = new frist();
                    login.main(null);
                    
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
			}
		});
		btnRegister.setBackground(new Color(154, 205, 50));
		btnRegister.setFont(new Font("Kanit", Font.PLAIN, 20));
		btnRegister.setBounds(424, 583, 116, 38);
		frame.getContentPane().add(btnRegister);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Bank account");
		lblNewLabel_1_1_2.setFont(new Font("Kanit", Font.PLAIN, 20));
		lblNewLabel_1_1_2.setBounds(44, 514, 134, 38);
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Kanit", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(227, 514, 313, 38);
		frame.getContentPane().add(textField);
	}
}
