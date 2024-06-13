package yuvan.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class premkumar {

	protected static final int YES_OPTION = 0;
	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					premkumar window = new premkumar();
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
	public premkumar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 818, 517);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MOVIE TICKET BOOKING");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(250, 42, 201, 17);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(166, 131, 70, 17);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("MOVIE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(166, 212, 70, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NUMBER TICKETS");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(131, 282, 129, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		tb1 = new JTextField();
		tb1.setBounds(314, 128, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "RRR", "KGF", "KGF 2", "KALKI"}));
		cb1.setBounds(314, 210, 86, 18);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"}));
		cb2.setBounds(314, 282, 86, 28);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String movie=(String) cb1.getSelectedItem();
				String tickets=(String) cb2.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				int bill=0;
				if(movie.equals("KGF"))
				{
					bill=bill+nt*100000;
				}
				if(movie.equals("KGF 2"))
						{
							bill=bill+nt*25000000;
		     	}
				if(movie.equals("KALKI"))
					{
						bill=bill+nt*350000000;
					}
				if(movie.equals("RRR"))
							{
								bill=bill+nt*450000000;
							}
							int res=0;
							res=JOptionPane.showConfirmDialog(btnNewButton, "NAME:"+name+
									"\nMOVIE :"+movie+"\n TICKETS :"+tickets+"\n AMOUNT :"+bill);
							if(res==YES_OPTION)
							{
								JOptionPane.showMessageDialog(btnNewButton, "TICKETS CONIRMED");
							}
							else
							{
					           JOptionPane.showMessageDialog(btnNewButton, "booking canceled");
							}
							
							}
							
		});
		btnNewButton.setBounds(311, 386, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\22690.jpg"));
		lblNewLabel_4.setBounds(0, 0, 792, 467);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
