package hello;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class newone {

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
					newone window = new newone();
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
	public newone() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 0));
		frame.getContentPane().setForeground(new Color(255, 255, 0));
		frame.setBounds(100, 100, 628, 509);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(306, 41, 0, 10);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(146, 146, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(146, 184, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ROLL NO");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(146, 184, 88, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("BRANCH");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(146, 241, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("GENDER");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(146, 286, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("PROF LANES");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(138, 330, 96, 22);
		frame.getContentPane().add(lblNewLabel_5);
		
		tb1 = new JTextField();
		tb1.setBounds(273, 143, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(273, 185, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("STUDENT REGISTRATION FORM");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(146, 63, 275, 27);
		frame.getContentPane().add(lblNewLabel_6);
		
		JRadioButton ma1 = new JRadioButton("MALE");
		ma1.setFont(new Font("Tahoma", Font.BOLD, 12));
		ma1.setBounds(270, 281, 109, 23);
		frame.getContentPane().add(ma1);
		
		JRadioButton ma2 = new JRadioButton("FEMALE");
		ma2.setFont(new Font("Tahoma", Font.BOLD, 12));
		ma2.setBounds(381, 282, 109, 23);
		frame.getContentPane().add(ma2);
		
		JRadioButton c1 = new JRadioButton("C");
		c1.setFont(new Font("Tahoma", Font.BOLD, 14));
		c1.setBounds(259, 330, 109, 23);
		frame.getContentPane().add(c1);
		
		JRadioButton c2 = new JRadioButton("JAVA");
		c2.setFont(new Font("Tahoma", Font.BOLD, 14));
		c2.setBounds(381, 330, 109, 23);
		frame.getContentPane().add(c2);
		
		JRadioButton c3 = new JRadioButton("PYTHON");
		c3.setFont(new Font("Tahoma", Font.BOLD, 14));
		c3.setBounds(497, 330, 109, 23);
		frame.getContentPane().add(c3);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "EEE", "ECE", "CSE", "AIML"}));
		cb1.setBounds(273, 237, 86, 18);
		frame.getContentPane().add(cb1);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String rollno=tb2.getText();
				String branch=(String) cb1.getSelectedItem();
				String gender="";
				String langs="";
				
				if(r1.isSelected())
				{
					gender="male";
				}
				if(r2.isSelected())
		{
			gender="female";
		}
				if(c1.isSelecetd())
				{
					langs=langs+"c";
				}
				
	if(c2.isSelected())
		{
			langs=langs+"java";
		}
	if(c3.isSelected())
	{
		langs=langs+"python";
	}
	JOptionPane.showMessageDialog(btnNewButton, "NAME :"
		});
		btnNewButton.setBounds(306, 412, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
