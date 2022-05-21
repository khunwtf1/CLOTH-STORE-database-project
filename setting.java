package database;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class setting {

	JFrame frame;
	JTextField AddressText;
	JTextField TelText;
	JTextField NameText;
	JTextField emailText;
	JTextField PassText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					setting window = new setting();
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
	
	public void theQuery(String query) {
		Connection con = null;
		Statement st = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloth_store","root","Khunmuinnellim01");
			st = con.createStatement();
			st.executeUpdate(query);
			JOptionPane.showMessageDialog(null, "Update Success");
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Oh no~~~~~~~");
		}
	}
	
	
	
	public setting() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 255, 255));
		frame.setBounds(100, 100, 550, 601);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("E-mail Address");
		lblNewLabel_1_1.setFont(new Font("Kanit", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(10, 72, 158, 38);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Kanit", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(10, 137, 158, 38);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Name");
		lblNewLabel_1_1_1.setFont(new Font("Kanit", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(10, 210, 158, 38);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Telephone");
		lblNewLabel_1_1_1_1.setFont(new Font("Kanit", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1.setBounds(10, 281, 158, 38);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Address");
		lblNewLabel_1_2.setFont(new Font("Kanit", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(10, 351, 158, 38);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		AddressText = new JTextField();
		AddressText.setFont(new Font("Kanit", Font.PLAIN, 15));
		AddressText.setColumns(10);
		AddressText.setBounds(193, 353, 331, 38);
		frame.getContentPane().add(AddressText);
		
		TelText = new JTextField();
		TelText.setFont(new Font("Kanit", Font.PLAIN, 15));
		TelText.setColumns(10);
		TelText.setBounds(193, 281, 331, 38);
		frame.getContentPane().add(TelText);
		
		NameText = new JTextField();
		NameText.setFont(new Font("Kanit", Font.PLAIN, 15));
		NameText.setColumns(10);
		NameText.setBounds(193, 210, 331, 38);
		frame.getContentPane().add(NameText);
		
		emailText = new JTextField();
		emailText.setEnabled(false);
		emailText.setText("Ticha_t@gmail.com");
		emailText.setForeground(Color.BLACK);
		emailText.setFont(new Font("Kanit", Font.PLAIN, 15));
		emailText.setColumns(10);
		emailText.setBounds(193, 72, 331, 38);
		frame.getContentPane().add(emailText);
		
		PassText = new JTextField();
		PassText.setFont(new Font("Kanit", Font.PLAIN, 15));
		PassText.setColumns(10);
		PassText.setBounds(193, 137, 331, 38);
		frame.getContentPane().add(PassText);
		
		JButton btnNewButton_1_1 = new JButton("Update");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frist login = new frist();
				
				String passw = login.passwordLoginField.getText();
				String namee = NameText.getText();
				String Phone = TelText.getText();
				String Addre = AddressText.getText();
				
				theQuery("UPDATE customer SET Cus_Password = '"+passw+"',Cus_name = '"+namee+"',Cus_Phone = '"+Phone+"',Cus_Address = '"+Addre+"' WHERE Cus_Id = 'CUS03';");
				
			}
		});
		btnNewButton_1_1.setFont(new Font("Kanit", Font.PLAIN, 20));
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setBackground(new Color(102, 204, 255));
		btnNewButton_1_1.setBounds(96, 470, 123, 36);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Back");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				customer cu = new customer();
				cu.main(null);
				frame.dispose();
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Kanit", Font.PLAIN, 20));
		btnNewButton_1_1_1.setBorder(null);
		btnNewButton_1_1_1.setBackground(new Color(102, 204, 255));
		btnNewButton_1_1_1.setBounds(312, 470, 112, 36);
		frame.getContentPane().add(btnNewButton_1_1_1);
	}
}
