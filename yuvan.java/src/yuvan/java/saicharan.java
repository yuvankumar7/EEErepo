package yuvan.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class saicharan {
	int items=0;
	int amount=0;

private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					saicharan window = new saicharan();
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
	public saicharan() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 848, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ITEMS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(477, 33, 63, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("AMOUNT");
		lblNewLabel_2.setBackground(SystemColor.controlHighlight);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(477, 90, 63, 31);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb1 = new JTextField();
		tb1.setToolTipText("*mandatory");
		tb1.setBounds(566, 38, 100, 26);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setToolTipText("please select");
		tb2.setBounds(559, 95, 107, 26);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("ONLINE BOOK STORE");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_3.setBounds(25, 11, 340, 53);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				amount=amount+800;
				tb1.setText(""+items);
				tb2.setText(""+amount);
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\unnamed.png"));
		btnNewButton.setBounds(49, 191, 142, 213);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {items=items+1;
			amount=amount+2000;
			tb1.setText(""+items);
			tb2.setText(""+amount);
			
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\movie-popcorn-png-9.jpg"));
		btnNewButton_1.setBounds(270, 191, 157, 213);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				amount=amount+4999;
				tb1.setText(""+items);
				tb2.setText(""+amount);
				
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\images (2).jpg"));
		btnNewButton_2.setBounds(540, 191, 150, 213);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_4 = new JLabel("RS 800/-");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_4.setBounds(71, 423, 107, 20);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("RS 2000/-");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_5.setBounds(293, 426, 142, 20);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("RS 4999/-");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_6.setBounds(566, 426, 124, 20);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\22690.jpg"));
		lblNewLabel_7.setBounds(0, 0, 822, 482);
		frame.getContentPane().add(lblNewLabel_7);
	}
}
