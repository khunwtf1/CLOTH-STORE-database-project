package database;

import java.awt.EventQueue;

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

public class purchaesordre {

	JFrame frame;
	JTextField POIDField;
	JTextField CUSIDField;
	JTextField textField_2;
	JTextField textField_5;
	JTextField textField_6;
	JTextField textField_4;
	JTextField textField_10;
	JTextField textField_14;
	JTextField textField_0;
	JTextField textField_1;
	JTextField textField_3;
	JTextField textField_7;
	JTextField textField_8;
	JTextField textField_9;
	JTextField textField_11;
	JTextField textField_12;
	JTextField textField_13;
	double [] itemcost = new double[10];
	JTextArea textArea;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					purchaesordre window = new purchaesordre();
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
	
	
	public purchaesordre() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	public void theQuery(String query) {
		Connection con = null;
		Statement st = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloth_store","root","Khunmuinnellim01");
			st = con.createStatement();
			st.executeUpdate(query);
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Oh no~~~~~~~");
		}
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 255, 255));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("Purchase");
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LocalDate datetime = LocalDate.now();
				Random k = new Random();
                int kk = k.nextInt(99);
				
				produuuct prod = new produuuct();
				String rec;
				if (kk>=10) { rec = ("00"+kk); } else { rec = ("000"+kk); }
				String date = (""+datetime);
				String empid = ("EMP03");
				String cusid = ("CUS03");
				itemcost[0] = Double.parseDouble(textField_4.getText())*200.00;
				itemcost[1] = Double.parseDouble(textField_0.getText())*500.00;
				itemcost[2] = Double.parseDouble(textField_7.getText())*1900.00;
				itemcost[3] = Double.parseDouble(textField_11.getText())*300.00;
				itemcost[4] = itemcost[0]+itemcost[1]+itemcost[2]+itemcost[3];
				
				String rtqty = (""+prod.itemcost[0]);
				String jeqty = (""+prod.itemcost[1]);
				String bsqty = (""+prod.itemcost[2]);
				String riqty = (""+prod.itemcost[3]);
				String rtprice = (""+itemcost[0]);
				String jeprice = (""+itemcost[1]);
				String bsprice = (""+itemcost[2]);
				String riprice = (""+itemcost[3]);
				String total = ("Total :                                 "+itemcost[4]+"  Baht."); 
				
				String row1 = ("Receipt ID : "+rec+"\n");
				String row2 = ("Date : "+date+"\n");
				String row3 = ("Employee ID : "+empid+"\n");
				String row4 = ("Customer ID : "+cusid+"\n");
				String row5 = ("============== Customer Billing Systems =============\n");
				String row6 = ("\n");
				String row7 = ("Red T-shirt (CS-010101)\t\t     " +itemcost[0]+ " \n");
				String row8 = ("Jeans (CS-010204)\t\t     " +itemcost[1]+ " \n");
				String row9 = ("Black Sneaker (CS-010502)\t\t     " +itemcost[2]+ " \n");
				String row10 = ("Ring (CS-010606)\t\t     " +itemcost[3]+ " \n");
				String row11 = ("\n");
				String row12 = ("\t Total \t\t     " +itemcost[4]+ " \n");
				String row13 = ("\n");
				String row14 = ("===================================================\n");
				String row15 = ("\n");
				String row16 = ("\t   Thank you for your order :)\n");
				String row17 = ("\n");
				String row18 = ("===================================================\n");
				
				String txtReceipt = row1+row2+row3+row4+row5+row6+row7+row8+row9+row10+row11+row12+row13+row14+row15+row16+row17+row18;
				textArea.setText(txtReceipt);
				
				String s1 = ("Transaction Date : "+date+"\n");
				String s2 = ("From Bank account : 0897654321\n");
				String s3 = ("Beneficiary Bank : Kasikorn Bank \n");
				String s4 = ("To Bank account : 9932223527 \n");
				String s5 = ("Total : "+itemcost[4]+"  Baht.\n");
				
				String txtStatement = s1+s2+s3+s4+s5;
				System.out.print(txtStatement);
				bankaccouont ba = new bankaccouont();
				ba.textArea.setText(txtStatement);
				ba.frame.setVisible(true);
				
			}
		});
		lblNewLabel_1_2.setOpaque(true);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Kanit", Font.PLAIN, 20));
		lblNewLabel_1_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_1_2.setBackground(SystemColor.menu);
		lblNewLabel_1_2.setBounds(188, 434, 165, 34);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel = new JLabel("PURCHASE ORDER ID :");
		lblNewLabel.setFont(new Font("Kanit", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 11, 165, 16);
		frame.getContentPane().add(lblNewLabel);
		
		POIDField = new JTextField();
		POIDField.setBorder(null);
		POIDField.setHorizontalAlignment(SwingConstants.LEFT);
		POIDField.setBounds(10, 38, 143, 20);
		frame.getContentPane().add(POIDField);
		POIDField.setColumns(10);
		
		CUSIDField = new JTextField();
		CUSIDField.setHorizontalAlignment(SwingConstants.LEFT);
		CUSIDField.setColumns(10);
		CUSIDField.setBorder(null);
		CUSIDField.setBounds(365, 38, 143, 20);
		frame.getContentPane().add(CUSIDField);
		
		JLabel lblCustomerId = new JLabel("CUSTOMER ID :");
		lblCustomerId.setFont(new Font("Kanit", Font.PLAIN, 15));
		lblCustomerId.setBounds(365, 11, 151, 16);
		frame.getContentPane().add(lblCustomerId);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBounds(365, 96, 143, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblDate = new JLabel("DATE :");
		lblDate.setFont(new Font("Kanit", Font.PLAIN, 15));
		lblDate.setBounds(10, 69, 165, 16);
		frame.getContentPane().add(lblDate);
		
		JLabel lblProductId = new JLabel("PRODUCT ID");
		lblProductId.setFont(new Font("Kanit", Font.PLAIN, 15));
		lblProductId.setBounds(10, 139, 83, 16);
		frame.getContentPane().add(lblProductId);
		
		JLabel lblProductName = new JLabel("PRODUCT NAME");
		lblProductName.setFont(new Font("Kanit", Font.PLAIN, 15));
		lblProductName.setBounds(122, 139, 109, 16);
		frame.getContentPane().add(lblProductName);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Kanit", Font.PLAIN, 13));
		textField_5.setBackground(new Color(204, 255, 255));
		textField_5.setHorizontalAlignment(SwingConstants.LEFT);
		textField_5.setColumns(10);
		textField_5.setBorder(null);
		textField_5.setBounds(231, 372, 273, 20);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.LEFT);
		textField_6.setColumns(10);
		textField_6.setBorder(null);
		textField_6.setBounds(10, 96, 143, 20);
		frame.getContentPane().add(textField_6);
		
		JLabel lblNewLabel_6 = new JLabel("EMPLOYEE ID :");
		lblNewLabel_6.setFont(new Font("Kanit", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(365, 69, 100, 16);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblQuantity = new JLabel("QUANTITY");
		lblQuantity.setFont(new Font("Kanit", Font.PLAIN, 15));
		lblQuantity.setBounds(266, 139, 73, 16);
		frame.getContentPane().add(lblQuantity);
		
		JLabel lblPrice = new JLabel("PRICE/PIECE");
		lblPrice.setFont(new Font("Kanit", Font.PLAIN, 15));
		lblPrice.setBounds(365, 139, 89, 16);
		frame.getContentPane().add(lblPrice);
		
		JLabel lblPrice_1 = new JLabel("PRICE");
		lblPrice_1.setFont(new Font("Kanit", Font.PLAIN, 15));
		lblPrice_1.setBounds(464, 139, 44, 16);
		frame.getContentPane().add(lblPrice_1);
		
		JLabel lblJeans_2 = new JLabel("Red T-Shirt");
		lblJeans_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblJeans_2.setFont(new Font("Kanit", Font.PLAIN, 13));
		lblJeans_2.setBounds(122, 173, 109, 16);
		frame.getContentPane().add(lblJeans_2);
		
		JLabel lblProducttypeid_1_2 = new JLabel("CS-010101");
		lblProducttypeid_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblProducttypeid_1_2.setFont(new Font("Kanit", Font.PLAIN, 13));
		lblProducttypeid_1_2.setBounds(10, 174, 73, 15);
		frame.getContentPane().add(lblProducttypeid_1_2);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Kanit", Font.PLAIN, 13));
		textField_4.setBorder(null);
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(204, 255, 255));
		textField_4.setBounds(276, 168, 44, 23);
		frame.getContentPane().add(textField_4);
		
		textField_10 = new JTextField();
		textField_10.setText("200");
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("Kanit", Font.PLAIN, 13));
		textField_10.setColumns(10);
		textField_10.setBorder(null);
		textField_10.setBackground(new Color(204, 255, 255));
		textField_10.setBounds(390, 166, 44, 23);
		frame.getContentPane().add(textField_10);
		
		textField_14 = new JTextField();
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setFont(new Font("Kanit", Font.PLAIN, 13));
		textField_14.setColumns(10);
		textField_14.setBorder(null);
		textField_14.setBackground(new Color(204, 255, 255));
		textField_14.setBounds(460, 166, 44, 23);
		frame.getContentPane().add(textField_14);
		
		JLabel lblProducttypeid_1_2_1 = new JLabel("CS-010204");
		lblProducttypeid_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblProducttypeid_1_2_1.setFont(new Font("Kanit", Font.PLAIN, 13));
		lblProducttypeid_1_2_1.setBounds(10, 210, 73, 15);
		frame.getContentPane().add(lblProducttypeid_1_2_1);
		
		JLabel lblJeans_2_1 = new JLabel("Jeans");
		lblJeans_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblJeans_2_1.setFont(new Font("Kanit", Font.PLAIN, 13));
		lblJeans_2_1.setBounds(122, 209, 109, 16);
		frame.getContentPane().add(lblJeans_2_1);
		
		textField_0 = new JTextField();
		textField_0.setHorizontalAlignment(SwingConstants.CENTER);
		textField_0.setFont(new Font("Kanit", Font.PLAIN, 13));
		textField_0.setColumns(10);
		textField_0.setBorder(null);
		textField_0.setBackground(new Color(204, 255, 255));
		textField_0.setBounds(276, 204, 44, 23);
		frame.getContentPane().add(textField_0);
		
		textField_1 = new JTextField();
		textField_1.setText("500");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Kanit", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBackground(new Color(204, 255, 255));
		textField_1.setBounds(390, 202, 44, 23);
		frame.getContentPane().add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Kanit", Font.PLAIN, 13));
		textField_3.setColumns(10);
		textField_3.setBorder(null);
		textField_3.setBackground(new Color(204, 255, 255));
		textField_3.setBounds(460, 202, 44, 23);
		frame.getContentPane().add(textField_3);
		
		JLabel lblProducttypeid_1_2_2 = new JLabel("CS-010502");
		lblProducttypeid_1_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblProducttypeid_1_2_2.setFont(new Font("Kanit", Font.PLAIN, 13));
		lblProducttypeid_1_2_2.setBounds(10, 257, 73, 15);
		frame.getContentPane().add(lblProducttypeid_1_2_2);
		
		JLabel lblJeans_2_2 = new JLabel("Black Sneaker");
		lblJeans_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblJeans_2_2.setFont(new Font("Kanit", Font.PLAIN, 13));
		lblJeans_2_2.setBounds(122, 256, 109, 16);
		frame.getContentPane().add(lblJeans_2_2);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Kanit", Font.PLAIN, 13));
		textField_7.setColumns(10);
		textField_7.setBorder(null);
		textField_7.setBackground(new Color(204, 255, 255));
		textField_7.setBounds(276, 251, 44, 23);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setText("1900");
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("Kanit", Font.PLAIN, 13));
		textField_8.setColumns(10);
		textField_8.setBorder(null);
		textField_8.setBackground(new Color(204, 255, 255));
		textField_8.setBounds(390, 249, 44, 23);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("Kanit", Font.PLAIN, 13));
		textField_9.setColumns(10);
		textField_9.setBorder(null);
		textField_9.setBackground(new Color(204, 255, 255));
		textField_9.setBounds(460, 249, 44, 23);
		frame.getContentPane().add(textField_9);
		
		JLabel lblProducttypeid_1_2_3 = new JLabel("CS-010606");
		lblProducttypeid_1_2_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblProducttypeid_1_2_3.setFont(new Font("Kanit", Font.PLAIN, 13));
		lblProducttypeid_1_2_3.setBounds(10, 301, 73, 15);
		frame.getContentPane().add(lblProducttypeid_1_2_3);
		
		JLabel lblJeans_2_3 = new JLabel("Ring");
		lblJeans_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblJeans_2_3.setFont(new Font("Kanit", Font.PLAIN, 13));
		lblJeans_2_3.setBounds(122, 300, 109, 16);
		frame.getContentPane().add(lblJeans_2_3);
		
		textField_11 = new JTextField();
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("Kanit", Font.PLAIN, 13));
		textField_11.setColumns(10);
		textField_11.setBorder(null);
		textField_11.setBackground(new Color(204, 255, 255));
		textField_11.setBounds(276, 295, 44, 23);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setText("300");
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setFont(new Font("Kanit", Font.PLAIN, 13));
		textField_12.setColumns(10);
		textField_12.setBorder(null);
		textField_12.setBackground(new Color(204, 255, 255));
		textField_12.setBounds(390, 293, 44, 23);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setFont(new Font("Kanit", Font.PLAIN, 13));
		textField_13.setColumns(10);
		textField_13.setBorder(null);
		textField_13.setBackground(new Color(204, 255, 255));
		textField_13.setBounds(460, 293, 44, 23);
		frame.getContentPane().add(textField_13);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Kanit", Font.PLAIN, 13));
		textArea.setBounds(526, 9, 331, 471);
		frame.getContentPane().add(textArea);
		frame.setBackground(new Color(204, 255, 255));
		frame.setBounds(100, 100, 884, 530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloth_store","root","Khunmuinnellim01");
			System.out.println("Irasshaimase");
			

			
			String query = "SELECT * FROM receipt";
			PreparedStatement statement = connect.prepareStatement(query);
			ResultSet Result = statement.executeQuery();
			
			
			System.out.println("finished");
			
			
			connect.close();
		
			
			
		} catch (SQLException e) {
			System.out.println("oh no~");
			e.printStackTrace();
		}
	}
}
