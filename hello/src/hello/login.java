package hello;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frame;
	private JTextField b1;
	private JTextField p1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.getContentPane().setForeground(new Color(204, 255, 51));
		frame.setTitle(" ");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN PAGE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(151, 23, 151, 48);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(81, 126, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("NAME");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setBounds(126, 99, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		b1 = new JTextField();
		b1.setBounds(221, 96, 86, 20);
		frame.getContentPane().add(b1);
		b1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(107, 151, 120, 38);
		frame.getContentPane().add(lblNewLabel_2);
		
		p1 = new JTextField();
		p1.setBounds(221, 162, 86, 20);
		frame.getContentPane().add(p1);
		p1.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(221, 162, 81, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					String name=tb1.getText();
					String password=p1.getText();
					if(name.equals("yuvan")  && password.equals("1234"))
					{
						JOptionPane.showMessageDialog(btnNewButton,"welcome yuvan");
					}
					else
					{
					     JOptionPane.showMessageDialog(btnNewButton, "invalid user");
			
				}
			
		frame.getContentPane().add(btnNewButton);
	}
}
