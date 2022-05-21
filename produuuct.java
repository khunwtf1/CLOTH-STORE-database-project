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

public class produuuct {

	JFrame frame;
	JTextField textRedtshirt;
	JTextField textJeans;
	JTextField textBlackSneakers;
	JTextField textRing;
	public double [] itemcost = new double[10];
	JButton btnPurchase;
	public String rtqty;
	public String jeqty;
	public String bsqty;
	public String riqty;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					produuuct window = new produuuct();
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
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Oh no~~~~~~~");
		}
	}
	
	
	public produuuct() {
		initialize();
	}
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 255, 255));
		frame.setBounds(100, 100, 490, 649);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBackground(new Color(204, 255, 255));
		layeredPane.setBorder(null);
		layeredPane.setBounds(10, 11, 454, 544);
		frame.getContentPane().add(layeredPane);
		
		JPanel AllProductPanel = new JPanel();
		AllProductPanel.setBackground(new Color(204, 255, 255));
		AllProductPanel.setBorder(null);
		AllProductPanel.setBounds(0, 0, 454, 544);
		layeredPane.add(AllProductPanel);
		AllProductPanel.setLayout(null);
		
		JPanel redtshirtPanel = new JPanel();
		redtshirtPanel.setBackground(new Color(204, 255, 255));
		redtshirtPanel.setBounds(0, 0, 454, 147);
		AllProductPanel.add(redtshirtPanel);
		redtshirtPanel.setLayout(null);
		
		JLabel redtshirt = new JLabel("");
		redtshirt.setBounds(24, 0, 151, 142);
		redtshirtPanel.add(redtshirt);
		redtshirt.setHorizontalAlignment(SwingConstants.CENTER);
		redtshirt.setIcon(new ImageIcon("C:\\Users\\khunmuinnellim\\eclipse-workspace\\database\\image\\messageImage_1620021514192.jpg"));
		
		JLabel lblRedTshirt = new JLabel("Red T-Shirt");
		lblRedTshirt.setHorizontalAlignment(SwingConstants.LEFT);
		lblRedTshirt.setFont(new Font("Kanit", Font.PLAIN, 30));
		lblRedTshirt.setBounds(200, 30, 167, 32);
		redtshirtPanel.add(lblRedTshirt);
		
		JLabel lblProducttypeid = new JLabel("CS-010101");
		lblProducttypeid.setHorizontalAlignment(SwingConstants.LEFT);
		lblProducttypeid.setFont(new Font("Kanit", Font.PLAIN, 13));
		lblProducttypeid.setBounds(200, 65, 138, 15);
		redtshirtPanel.add(lblProducttypeid);
		
		JLabel lblRedTshirt_1 = new JLabel("200 Baht.");
		lblRedTshirt_1.setForeground(new Color(0, 102, 204));
		lblRedTshirt_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblRedTshirt_1.setFont(new Font("Kanit", Font.PLAIN, 25));
		lblRedTshirt_1.setBounds(200, 90, 108, 32);
		redtshirtPanel.add(lblRedTshirt_1);
		
		textRedtshirt = new JTextField();
		textRedtshirt.setFont(new Font("Kanit", Font.PLAIN, 20));
		textRedtshirt.setHorizontalAlignment(SwingConstants.CENTER);
		textRedtshirt.setBounds(375, 95, 51, 32);
		redtshirtPanel.add(textRedtshirt);
		textRedtshirt.setColumns(10);
		
		JPanel jeansPanel = new JPanel();
		jeansPanel.setBackground(new Color(204, 255, 255));
		jeansPanel.setLayout(null);
		jeansPanel.setBounds(0, 147, 454, 147);
		AllProductPanel.add(jeansPanel);
		
		JLabel redtshirt_1 = new JLabel("");
		redtshirt_1.setIcon(new ImageIcon("C:\\Users\\khunmuinnellim\\eclipse-workspace\\database\\image\\messageImage_1620021451712.jpg"));
		redtshirt_1.setHorizontalAlignment(SwingConstants.CENTER);
		redtshirt_1.setBounds(25, 0, 151, 147);
		jeansPanel.add(redtshirt_1);
		
		JLabel lblJeans = new JLabel("Jeans");
		lblJeans.setHorizontalAlignment(SwingConstants.LEFT);
		lblJeans.setFont(new Font("Kanit", Font.PLAIN, 30));
		lblJeans.setBounds(200, 30, 83, 32);
		jeansPanel.add(lblJeans);
		
		JLabel lblProducttypeid_1 = new JLabel("CS-010204");
		lblProducttypeid_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblProducttypeid_1.setFont(new Font("Kanit", Font.PLAIN, 13));
		lblProducttypeid_1.setBounds(200, 65, 138, 15);
		jeansPanel.add(lblProducttypeid_1);
		
		JLabel lblRedTshirt_1_1 = new JLabel("590 Baht.");
		lblRedTshirt_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblRedTshirt_1_1.setForeground(new Color(0, 102, 204));
		lblRedTshirt_1_1.setFont(new Font("Kanit", Font.PLAIN, 25));
		lblRedTshirt_1_1.setBounds(200, 90, 108, 32);
		jeansPanel.add(lblRedTshirt_1_1);
		
		textJeans = new JTextField();
		textJeans.setFont(new Font("Kanit", Font.PLAIN, 20));
		textJeans.setHorizontalAlignment(SwingConstants.CENTER);
		textJeans.setColumns(10);
		textJeans.setBounds(375, 95, 51, 32);
		jeansPanel.add(textJeans);
		
		JPanel blacksneakerPanel = new JPanel();
		blacksneakerPanel.setBackground(new Color(204, 255, 255));
		blacksneakerPanel.setLayout(null);
		blacksneakerPanel.setBounds(0, 294, 454, 147);
		AllProductPanel.add(blacksneakerPanel);
		
		JLabel redtshirt_2 = new JLabel("");
		redtshirt_2.setVerticalAlignment(SwingConstants.BOTTOM);
		redtshirt_2.setIcon(new ImageIcon("C:\\Users\\khunmuinnellim\\eclipse-workspace\\database\\image\\messageImage_1620021445118.jpg"));
		redtshirt_2.setHorizontalAlignment(SwingConstants.CENTER);
		redtshirt_2.setBounds(21, 11, 153, 125);
		blacksneakerPanel.add(redtshirt_2);
		
		JLabel lblJeans_1 = new JLabel("Black Sneakers");
		lblJeans_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblJeans_1.setFont(new Font("Kanit", Font.PLAIN, 30));
		lblJeans_1.setBounds(200, 30, 211, 32);
		blacksneakerPanel.add(lblJeans_1);
		
		JLabel lblProducttypeid_1_1 = new JLabel("CS-010502");
		lblProducttypeid_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblProducttypeid_1_1.setFont(new Font("Kanit", Font.PLAIN, 13));
		lblProducttypeid_1_1.setBounds(200, 65, 138, 15);
		blacksneakerPanel.add(lblProducttypeid_1_1);
		
		JLabel lblRedTshirt_1_1_1 = new JLabel("1,900 Baht.");
		lblRedTshirt_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblRedTshirt_1_1_1.setForeground(new Color(0, 102, 204));
		lblRedTshirt_1_1_1.setFont(new Font("Kanit", Font.PLAIN, 25));
		lblRedTshirt_1_1_1.setBounds(200, 90, 138, 32);
		blacksneakerPanel.add(lblRedTshirt_1_1_1);
		
		textBlackSneakers = new JTextField();
		textBlackSneakers.setFont(new Font("Kanit", Font.PLAIN, 20));
		textBlackSneakers.setHorizontalAlignment(SwingConstants.CENTER);
		textBlackSneakers.setColumns(10);
		textBlackSneakers.setBounds(375, 95, 51, 32);
		blacksneakerPanel.add(textBlackSneakers);
		
		JPanel ringPanel = new JPanel();
		ringPanel.setBackground(new Color(204, 255, 255));
		ringPanel.setLayout(null);
		ringPanel.setBounds(0, 442, 454, 103);
		AllProductPanel.add(ringPanel);
		
		JLabel redtshirt_3 = new JLabel("");
		redtshirt_3.setIcon(new ImageIcon("C:\\Users\\khunmuinnellim\\eclipse-workspace\\database\\image\\messageImage_1620021458006.jpg"));
		redtshirt_3.setHorizontalAlignment(SwingConstants.CENTER);
		redtshirt_3.setBounds(49, 11, 108, 82);
		ringPanel.add(redtshirt_3);
		
		JLabel lblJeans_2 = new JLabel("Ring");
		lblJeans_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblJeans_2.setFont(new Font("Kanit", Font.PLAIN, 30));
		lblJeans_2.setBounds(200, 10, 83, 32);
		ringPanel.add(lblJeans_2);
		
		JLabel lblProducttypeid_1_2 = new JLabel("CS-010606");
		lblProducttypeid_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblProducttypeid_1_2.setFont(new Font("Kanit", Font.PLAIN, 13));
		lblProducttypeid_1_2.setBounds(200, 45, 138, 15);
		ringPanel.add(lblProducttypeid_1_2);
		
		JLabel lblRedTshirt_1_1_2 = new JLabel("300 Baht.");
		lblRedTshirt_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblRedTshirt_1_1_2.setForeground(new Color(0, 102, 204));
		lblRedTshirt_1_1_2.setFont(new Font("Kanit", Font.PLAIN, 25));
		lblRedTshirt_1_1_2.setBounds(200, 70, 108, 32);
		ringPanel.add(lblRedTshirt_1_1_2);
		
		textRing = new JTextField();
		textRing.setFont(new Font("Kanit", Font.PLAIN, 20));
		textRing.setHorizontalAlignment(SwingConstants.CENTER);
		textRing.setColumns(10);
		textRing.setBounds(375, 70, 51, 32);
		ringPanel.add(textRing);
		
		JPanel TopPanel = new JPanel();
		TopPanel.setBackground(new Color(204, 255, 255));
		TopPanel.setBorder(null);
		TopPanel.setBounds(0, 0,  454, 544);
		layeredPane.add(TopPanel);
		TopPanel.setLayout(null);
		
		JPanel redtshirtPanel_1 = new JPanel();
		redtshirtPanel_1.setLayout(null);
		redtshirtPanel_1.setBackground(new Color(204, 255, 255));
		redtshirtPanel_1.setBounds(0, 0, 454, 147);
		TopPanel.add(redtshirtPanel_1);
		
		JLabel redtshirt_4 = new JLabel("");
		redtshirt_4.setHorizontalAlignment(SwingConstants.CENTER);
		redtshirt_4.setBounds(24, 0, 151, 142);
		redtshirtPanel_1.add(redtshirt_4);
		
		JLabel lblRedTshirt_2 = new JLabel("Red T-Shirt");
		lblRedTshirt_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblRedTshirt_2.setFont(new Font("Kanit", Font.PLAIN, 30));
		lblRedTshirt_2.setBounds(200, 30, 167, 32);
		redtshirtPanel_1.add(lblRedTshirt_2);
		
		JLabel lblProducttypeid_2 = new JLabel("CS-010101");
		lblProducttypeid_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblProducttypeid_2.setFont(new Font("Kanit", Font.PLAIN, 13));
		lblProducttypeid_2.setBounds(200, 65, 138, 15);
		redtshirtPanel_1.add(lblProducttypeid_2);
		
		JLabel lblRedTshirt_1_2 = new JLabel("200 Baht.");
		lblRedTshirt_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblRedTshirt_1_2.setForeground(new Color(0, 102, 204));
		lblRedTshirt_1_2.setFont(new Font("Kanit", Font.PLAIN, 25));
		lblRedTshirt_1_2.setBounds(200, 90, 108, 32);
		redtshirtPanel_1.add(lblRedTshirt_1_2);
		
		JPanel BottomPanel = new JPanel();
		BottomPanel.setBackground(new Color(204, 255, 255));
		BottomPanel.setBorder(null);
		BottomPanel.setBounds(0, 0,  454, 544);
		layeredPane.add(BottomPanel);
		BottomPanel.setLayout(null);
		
		JPanel jeansPanel_1 = new JPanel();
		jeansPanel_1.setLayout(null);
		jeansPanel_1.setBackground(new Color(204, 255, 255));
		jeansPanel_1.setBounds(0, 0, 454, 147);
		BottomPanel.add(jeansPanel_1);
		
		JLabel redtshirt_1_1 = new JLabel("");
		redtshirt_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		redtshirt_1_1.setBounds(25, 0, 151, 147);
		jeansPanel_1.add(redtshirt_1_1);
		
		JLabel lblJeans_3 = new JLabel("Jeans");
		lblJeans_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblJeans_3.setFont(new Font("Kanit", Font.PLAIN, 30));
		lblJeans_3.setBounds(200, 30, 83, 32);
		jeansPanel_1.add(lblJeans_3);
		
		JLabel lblProducttypeid_1_3 = new JLabel("CS-010204");
		lblProducttypeid_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblProducttypeid_1_3.setFont(new Font("Kanit", Font.PLAIN, 13));
		lblProducttypeid_1_3.setBounds(200, 65, 138, 15);
		jeansPanel_1.add(lblProducttypeid_1_3);
		
		JLabel lblRedTshirt_1_1_3 = new JLabel("590 Baht.");
		lblRedTshirt_1_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblRedTshirt_1_1_3.setForeground(new Color(0, 102, 204));
		lblRedTshirt_1_1_3.setFont(new Font("Kanit", Font.PLAIN, 25));
		lblRedTshirt_1_1_3.setBounds(200, 90, 108, 32);
		jeansPanel_1.add(lblRedTshirt_1_1_3);
		
		JPanel ShoesPanel = new JPanel();
		ShoesPanel.setBackground(new Color(204, 255, 255));
		ShoesPanel.setBorder(null);
		ShoesPanel.setBounds(0, 0,  454, 544);
		layeredPane.add(ShoesPanel);
		ShoesPanel.setLayout(null);
		
		JPanel blacksneakerPanel_1 = new JPanel();
		blacksneakerPanel_1.setLayout(null);
		blacksneakerPanel_1.setBackground(new Color(204, 255, 255));
		blacksneakerPanel_1.setBounds(0, 0, 454, 147);
		ShoesPanel.add(blacksneakerPanel_1);
		
		JLabel redtshirt_2_1 = new JLabel("");
		redtshirt_2_1.setVerticalAlignment(SwingConstants.BOTTOM);
		redtshirt_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		redtshirt_2_1.setBounds(21, 11, 153, 125);
		blacksneakerPanel_1.add(redtshirt_2_1);
		
		JLabel lblJeans_1_1 = new JLabel("Black Sneakers");
		lblJeans_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblJeans_1_1.setFont(new Font("Kanit", Font.PLAIN, 30));
		lblJeans_1_1.setBounds(200, 30, 211, 32);
		blacksneakerPanel_1.add(lblJeans_1_1);
		
		JLabel lblProducttypeid_1_1_1 = new JLabel("CS-010502");
		lblProducttypeid_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblProducttypeid_1_1_1.setFont(new Font("Kanit", Font.PLAIN, 13));
		lblProducttypeid_1_1_1.setBounds(200, 65, 138, 15);
		blacksneakerPanel_1.add(lblProducttypeid_1_1_1);
		
		JLabel lblRedTshirt_1_1_1_1 = new JLabel("1,900 Baht.");
		lblRedTshirt_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblRedTshirt_1_1_1_1.setForeground(new Color(0, 102, 204));
		lblRedTshirt_1_1_1_1.setFont(new Font("Kanit", Font.PLAIN, 25));
		lblRedTshirt_1_1_1_1.setBounds(200, 90, 138, 32);
		blacksneakerPanel_1.add(lblRedTshirt_1_1_1_1);
		
		JPanel AccessoriesPanel = new JPanel();
		AccessoriesPanel.setBackground(new Color(204, 255, 255));
		AccessoriesPanel.setBorder(null);
		AccessoriesPanel.setBounds(0, 0,  454, 544);
		layeredPane.add(AccessoriesPanel);
		AccessoriesPanel.setLayout(null);
		
		JPanel ringPanel_1 = new JPanel();
		ringPanel_1.setLayout(null);
		ringPanel_1.setBackground(new Color(204, 255, 255));
		ringPanel_1.setBounds(0, 0, 454, 103);
		AccessoriesPanel.add(ringPanel_1);
		
		JLabel redtshirt_3_1 = new JLabel("");
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
		
		btnPurchase = new JButton("Purchase");
		btnPurchase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchaesordre po = new purchaesordre();
				LocalDate datetime = LocalDate.now();
				Random k = new Random();
                int kk = k.nextInt(99);
				itemcost[0] = Double.parseDouble(textRedtshirt.getText())*200.00;
				itemcost[1] = Double.parseDouble(textJeans.getText())*500.00;
				itemcost[2] = Double.parseDouble(textBlackSneakers.getText())*1900.00;
				itemcost[3] = Double.parseDouble(textRing.getText())*300.00;
				
				itemcost[4] = itemcost[0]+itemcost[1]+itemcost[2]+itemcost[3];
				
				String total = ("Total :                                 "+itemcost[4]+"  Baht.");
				rtqty = (textRedtshirt.getText());
				jeqty = (textJeans.getText());
				bsqty = (textBlackSneakers.getText());
				riqty = (textRing.getText());
				String rtprice = (""+itemcost[0]);
				String jeprice = (""+itemcost[1]);
				String bsprice = (""+itemcost[2]);
				String riprice = (""+itemcost[3]);
				String poid;
				if (kk>=10) { poid = ("000A"+kk); } else { poid = ("000A0"+kk); }
				String cusid = ("CUS03");
				String date = (""+datetime);
				String empid = ("EMP03");
				
				po.POIDField.setText(poid);
				po.CUSIDField.setText(cusid);
				po.textField_6.setText(date);
				po.textField_2.setText(empid);
				po.textField_4.setText(rtqty);
				po.textField_0.setText(jeqty);
				po.textField_7.setText(bsqty);
				po.textField_11.setText(riqty);
				po.textField_14.setText(rtprice);
				po.textField_3.setText(jeprice);
				po.textField_9.setText(bsprice);
				po.textField_13.setText(riprice);
				po.textField_5.setText(total);
				
				po.frame.setVisible(true);
				frame.dispose();
				
				if (itemcost[0]>0.00 || itemcost[1]>0.00 || itemcost[2]>0.00 || itemcost[3]>0.00) {
					theQuery("INSERT INTO purchase_order VALUES ('"+poid+"','"+cusid+"','"+date+"','ClothStore','Cloth Store',"+itemcost[4]+",'"+empid+"')");
				} else {}
				
		}
		});
		btnPurchase.setBackground(new Color(102, 204, 255));
		btnPurchase.setBorder(null);
		btnPurchase.setFont(new Font("Kanit", Font.PLAIN, 20));
		btnPurchase.setBounds(183, 559, 112, 36);
		frame.getContentPane().add(btnPurchase);
		
		JButton btnNewButton_1_1 = new JButton("Catagories");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				catagorissssss cat = new catagorissssss();
				cat.main(null);
				frame.dispose();
			}
		});
		btnNewButton_1_1.setFont(new Font("Kanit", Font.PLAIN, 20));
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setBackground(new Color(102, 204, 255));
		btnNewButton_1_1.setBounds(10, 559, 112, 36);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mianmenu mai = new mianmenu();
				mai.main(null);
				frame.dispose();
			}
		});
		btnBack.setFont(new Font("Kanit", Font.PLAIN, 20));
		btnBack.setBorder(null);
		btnBack.setBackground(new Color(102, 204, 255));
		btnBack.setBounds(352, 559, 112, 36);
		frame.getContentPane().add(btnBack);
	}
}
