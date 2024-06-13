package yuvan.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class naveen {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;
	private JTextField cb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					naveen window = new naveen();
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
	public naveen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("student registration");
		lblNewLabel.setBounds(157, 11, 158, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("name");
		lblNewLabel_1.setBounds(65, 59, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("roll no");
		lblNewLabel_2.setBounds(65, 102, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("branch");
		lblNewLabel_3.setBounds(65, 144, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 =new JLabel("marks");
		lblNewLabel_4.setBounds(65, 193, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"select", "ece", "eee", "cse"}));
		cb1.setBounds(201, 140, 100, 23);
		frame.getContentPane().add(cb1);
		
		tb1 = new JTextField();
		tb1.setBounds(201, 56, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(201, 99, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		cb2 = new JTextField();
		cb2.setBounds(201, 190, 86, 20);
		frame.getContentPane().add(cb2);
		cb2.setColumns(10);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String rno=tb1.getText();
				int rollno=Integer.parseInt(rno);
				String name=tb2.getText();
				String branch=(String) cb2.getselecteditem();
				String m=tb3.getText();
				int marks=Integer.parseInt(m);
				try
				{
				connection con=DriverManager.getConnection
						("jdc:mysql//localhost:3306/yuvan","root","mrec");
				String q="insert into student values('"+rollno+"','"+name+"'.'"+branch+"','"+marks+"'"
						statement stn=con.createStatement();
				stn.executeUpdate(q);
				con.close();
				JOptionPane.showMessageDialog(btnNewButton,"inserted successfully");
				}
				catch(SQLException e1)
				{
					e1.printStackTrace();
				}
						
				}
		});
		btnNewButton.setBounds(177, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
}
