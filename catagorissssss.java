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

public class catagorissssss {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					catagorissssss window = new catagorissssss();
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
	public catagorissssss() {
		initialize();
	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 255, 255));
		frame.setBounds(100, 100, 753, 426);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel bottom_cat = new JLabel("");
		bottom_cat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(bottom_cat, "Sorry, the product is out of stock. ");
			}
		});
		bottom_cat.setHorizontalAlignment(SwingConstants.CENTER);
		bottom_cat.setBounds(532, 41, 138, 110);
		bottom_cat.setIcon(new ImageIcon("C:\\Users\\khunmuinnellim\\eclipse-workspace\\database\\image\\1619945276558.jpg"));
		bottom_cat.setBackground(Color.WHITE);
		frame.getContentPane().add(bottom_cat);
		
		JLabel shirt_cat = new JLabel("");
		shirt_cat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				top top = new top();
				top.main(null);
				frame.dispose();
				
			}
		});
		shirt_cat.setBounds(61, 41, 138, 110);
		shirt_cat.setIcon(new ImageIcon("C:\\Users\\khunmuinnellim\\eclipse-workspace\\database\\image\\1619945261941_0.jpg"));
		shirt_cat.setHorizontalAlignment(SwingConstants.CENTER);
		shirt_cat.setBackground(Color.WHITE);
		frame.getContentPane().add(shirt_cat);
		
		JLabel suit_cat = new JLabel("");
		suit_cat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				bottom bottom = new bottom();
				bottom.main(null);
				frame.dispose();
			}
		});
		suit_cat.setBounds(291, 41, 138, 110);
		suit_cat.setIcon(new ImageIcon("C:\\Users\\khunmuinnellim\\eclipse-workspace\\database\\image\\1619945269544.jpg"));
		suit_cat.setHorizontalAlignment(SwingConstants.CENTER);
		suit_cat.setBackground(Color.WHITE);
		frame.getContentPane().add(suit_cat);
		
		JLabel lblProducttypename = new JLabel("TOP");
		lblProducttypename.setHorizontalAlignment(SwingConstants.CENTER);
		lblProducttypename.setFont(new Font("Kanit", Font.PLAIN, 20));
		lblProducttypename.setBounds(61, 151, 138, 32);
		frame.getContentPane().add(lblProducttypename);
		
		JLabel accessory_cat = new JLabel("");
		accessory_cat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				accessories acc = new accessories();
				acc.main(null);
				frame.dispose();
			}
			
		});
		accessory_cat.setBounds(532, 206, 138, 110);
		accessory_cat.setIcon(new ImageIcon("C:\\Users\\khunmuinnellim\\eclipse-workspace\\database\\image\\1619945297620.jpg"));
		accessory_cat.setHorizontalAlignment(SwingConstants.CENTER);
		accessory_cat.setBackground(Color.WHITE);
		frame.getContentPane().add(accessory_cat);
		
		JLabel shoes_cat = new JLabel("");
		shoes_cat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(bottom_cat, "Sorry, the product is out of stock. ");
			}
		});
		shoes_cat.setBounds(61, 206, 138, 110);
		shoes_cat.setIcon(new ImageIcon("C:\\Users\\khunmuinnellim\\eclipse-workspace\\database\\image\\1619945284162.jpg"));
		shoes_cat.setHorizontalAlignment(SwingConstants.CENTER);
		shoes_cat.setBackground(Color.WHITE);
		frame.getContentPane().add(shoes_cat);
		
		JLabel kids_cat = new JLabel("");
		kids_cat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				shoes shoes = new shoes();
				shoes.main(null);
				frame.dispose();
			}
		});
		kids_cat.setBounds(291, 206, 138, 110);
		kids_cat.setIcon(new ImageIcon("C:\\Users\\khunmuinnellim\\eclipse-workspace\\database\\image\\1619945291600.jpg"));
		kids_cat.setHorizontalAlignment(SwingConstants.CENTER);
		kids_cat.setBackground(Color.WHITE);
		frame.getContentPane().add(kids_cat);
		
		JLabel lblProducttypeid = new JLabel("CS-010100");
		lblProducttypeid.setHorizontalAlignment(SwingConstants.CENTER);
		lblProducttypeid.setFont(new Font("Kanit", Font.PLAIN, 13));
		lblProducttypeid.setBounds(61, 174, 138, 21);
		frame.getContentPane().add(lblProducttypeid);
		
		JLabel lblBottom = new JLabel("BOTTOM");
		lblBottom.setHorizontalAlignment(SwingConstants.CENTER);
		lblBottom.setFont(new Font("Kanit", Font.PLAIN, 20));
		lblBottom.setBounds(291, 157, 138, 21);
		frame.getContentPane().add(lblBottom);
		
		JLabel lblCs = new JLabel("CS-010200");
		lblCs.setHorizontalAlignment(SwingConstants.CENTER);
		lblCs.setFont(new Font("Kanit", Font.PLAIN, 13));
		lblCs.setBounds(291, 174, 138, 21);
		frame.getContentPane().add(lblCs);
		
		JLabel lblKids = new JLabel("KIDS");
		lblKids.setHorizontalAlignment(SwingConstants.CENTER);
		lblKids.setFont(new Font("Kanit", Font.PLAIN, 20));
		lblKids.setBounds(532, 151, 138, 32);
		frame.getContentPane().add(lblKids);
		
		JLabel lblCs_1 = new JLabel("CS-010300");
		lblCs_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCs_1.setFont(new Font("Kanit", Font.PLAIN, 13));
		lblCs_1.setBounds(532, 174, 138, 21);
		frame.getContentPane().add(lblCs_1);
		
		JLabel lblBottom_1 = new JLabel("SUITS");
		lblBottom_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBottom_1.setFont(new Font("Kanit", Font.PLAIN, 20));
		lblBottom_1.setBounds(61, 319, 138, 32);
		frame.getContentPane().add(lblBottom_1);
		
		JLabel lblCs_2 = new JLabel("CS-010400");
		lblCs_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCs_2.setFont(new Font("Kanit", Font.PLAIN, 13));
		lblCs_2.setBounds(61, 342, 138, 21);
		frame.getContentPane().add(lblCs_2);
		
		JLabel lblShoes = new JLabel("SHOES");
		lblShoes.setHorizontalAlignment(SwingConstants.CENTER);
		lblShoes.setFont(new Font("Kanit", Font.PLAIN, 20));
		lblShoes.setBounds(291, 319, 138, 32);
		frame.getContentPane().add(lblShoes);
		
		JLabel lblCs_3 = new JLabel("CS-010500");
		lblCs_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblCs_3.setFont(new Font("Kanit", Font.PLAIN, 13));
		lblCs_3.setBounds(291, 342, 138, 21);
		frame.getContentPane().add(lblCs_3);
		
		JLabel lblAccessories = new JLabel("ACCESSORIES");
		lblAccessories.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccessories.setFont(new Font("Kanit", Font.PLAIN, 20));
		lblAccessories.setBounds(532, 319, 138, 32);
		frame.getContentPane().add(lblAccessories);
		
		JLabel lblCs_4 = new JLabel("CS-010600");
		lblCs_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblCs_4.setFont(new Font("Kanit", Font.PLAIN, 13));
		lblCs_4.setBounds(532, 342, 138, 21);
		frame.getContentPane().add(lblCs_4);
	}
}
