package database;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;

public class customer {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customer window = new customer();
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
	public customer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(204, 204, 204));
		frame.getContentPane().setBackground(new Color(255, 255, 204));
		frame.setBounds(100, 100, 450, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel heading_customer = new JLabel("WELCOME TO CLOTH STORE");
		heading_customer.setHorizontalAlignment(SwingConstants.CENTER);
		heading_customer.setFont(new Font("Kanit", Font.PLAIN, 30));
		heading_customer.setBounds(10, 43, 414, 75);
		frame.getContentPane().add(heading_customer);
		
		JLabel lblNewLabel_1_1 = new JLabel("Back");
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mianmenu meme = new mianmenu();
				meme.main(null);
				frame.dispose();
			}
		});
		lblNewLabel_1_1.setFont(new Font("Kanit", Font.PLAIN, 30));
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBackground(SystemColor.menu);
		lblNewLabel_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_1_1.setBounds(10, 463, 414, 68);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Update Profile");
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setting set = new setting();
				set.main(null);
				frame.dispose();
			}
		});
		lblNewLabel_1_2.setFont(new Font("Kanit", Font.PLAIN, 30));
		lblNewLabel_1_2.setOpaque(true);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBackground(SystemColor.menu);
		lblNewLabel_1_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_1_2.setBounds(10, 165, 414, 68);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Our TEAM");
		lblNewLabel_1_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				empleeyoyyy emp = new empleeyoyyy();
				emp.main(null);
				frame.dispose();
			}
		});
		lblNewLabel_1_2_1.setOpaque(true);
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setFont(new Font("Kanit", Font.PLAIN, 30));
		lblNewLabel_1_2_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_1_2_1.setBackground(SystemColor.menu);
		lblNewLabel_1_2_1.setBounds(10, 264, 414, 68);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Check your Purchase Order");
		lblNewLabel_1_2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for_delete po = new for_delete();
				po.main(null);
				frame.dispose();
			}
		});
		lblNewLabel_1_2_2.setOpaque(true);
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2.setFont(new Font("Kanit", Font.PLAIN, 25));
		lblNewLabel_1_2_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_1_2_2.setBackground(SystemColor.menu);
		lblNewLabel_1_2_2.setBounds(10, 359, 414, 68);
		frame.getContentPane().add(lblNewLabel_1_2_2);
	}
}
