package database;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class empleeyoyyy {

	private JFrame frame;

	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					empleeyoyyy window = new empleeyoyyy();
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
	public empleeyoyyy() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String url = "jdbc:mysql://localhost:3306/cloth_store";
		String username = "root";
		String password = "Khunmuinnellim01";

		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 255, 204));
		frame.setBackground(new Color(204, 255, 204));
		frame.setBounds(100, 100, 966, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("Exit");
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_1_2.setOpaque(true);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Kanit", Font.PLAIN, 20));
		lblNewLabel_1_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_1_2.setBackground(SystemColor.menu);
		lblNewLabel_1_2.setBounds(784, 525, 143, 34);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel = new JLabel("EMPLOYEE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Kanit", Font.PLAIN, 50));
		lblNewLabel.setBounds(189, 37, 559, 45);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(null);
		scrollPane.setBounds(25, 146, 902, 345);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		try {
			Connection connect = DriverManager.getConnection(url, username, password);
			System.out.println("Irasshaimase");
			

			
			String query = "SELECT * FROM employee";
			PreparedStatement statement = connect.prepareStatement(query);
			ResultSet Result = statement.executeQuery();
			
			table.setModel(DbUtils.resultSetToTableModel(Result));
			
			JLabel lblNewLabel_1_2_1 = new JLabel("Back");
			lblNewLabel_1_2_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					customer cu = new customer();
					cu.main(null);
					frame.dispose();
				}
			});
			lblNewLabel_1_2_1.setOpaque(true);
			lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_2_1.setFont(new Font("Kanit", Font.PLAIN, 20));
			lblNewLabel_1_2_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
			lblNewLabel_1_2_1.setBackground(SystemColor.menu);
			lblNewLabel_1_2_1.setBounds(25, 525, 143, 34);
			frame.getContentPane().add(lblNewLabel_1_2_1);
			
			
			System.out.println("finished");
			
			
			connect.close();
		
			
			
		} catch (SQLException e) {
			System.out.println("oh no~");
			e.printStackTrace();
		}
	}
}
