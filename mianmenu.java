package database;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class mianmenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mianmenu window = new mianmenu();
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
	public mianmenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(255, 255, 255));
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("YOURSELF");
		lblNewLabel_2.setFont(new Font("Ink Free", Font.PLAIN, 40));
		lblNewLabel_2.setBounds(30, 272, 192, 106);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("BE");
		lblNewLabel_1.setFont(new Font("Ink Free", Font.PLAIN, 50));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(86, 174, 70, 66);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 950, 101);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("PROFILE");
		btnNewButton.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				customer profile = new customer();
				profile.main(null);
				frame.dispose();
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 204));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Kanit", Font.PLAIN, 25));
		btnNewButton.setBounds(774, 27, 134, 40);
		panel.add(btnNewButton);
		
		JButton btnGoToStore = new JButton("GO TO STORE");
		btnGoToStore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				produuuct prod = new produuuct();
				prod.main(null);
				frame.dispose();
				
			}
		});
		btnGoToStore.setForeground(Color.BLACK);
		btnGoToStore.setFont(new Font("Kanit", Font.PLAIN, 25));
		btnGoToStore.setBackground(new Color(255, 255, 204));
		btnGoToStore.setBounds(40, 27, 192, 40);
		panel.add(btnGoToStore);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\khunmuinnellim\\Downloads\\S__11460613.jpg"));
		lblNewLabel.setBounds(57, 98, 950, 580);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int response = JOptionPane.showConfirmDialog(btnExit,"Are you sure ?","confirm",JOptionPane.YES_NO_OPTION);
					if(response == JOptionPane.YES_OPTION) {
						System.exit(response);
					} else {};
			}
		});
		btnExit.setForeground(Color.BLACK);
		btnExit.setFont(new Font("Kanit", Font.PLAIN, 25));
		btnExit.setBackground(new Color(255, 255, 204));
		btnExit.setBounds(42, 518, 134, 40);
		frame.getContentPane().add(btnExit);
		frame.setBounds(100, 100, 966, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
