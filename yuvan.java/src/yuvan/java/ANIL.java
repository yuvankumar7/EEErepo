package yuvan.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ANIL {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ANIL window = new ANIL();
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
	public ANIL() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 874, 509);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HYD METRO TICKET");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(250, 28, 246, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(127, 105, 105, 17);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SOURCE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(127, 162, 86, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DESTINATION");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(127, 224, 105, 17);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("NUMBER OF TICKETS");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(100, 287, 152, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setToolTipText("please fill your name");
		tb1.setBounds(340, 102, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setToolTipText("please select source");
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KPHB", "ALWAL", "OLD ALWAL"}));
		cb1.setBounds(340, 158, 105, 18);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setToolTipText("please select your destination");
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KPHB", "ALWAL", "OLD ALWAL"}));
		cb2.setBounds(340, 221, 105, 20);
		frame.getContentPane().add(cb2);
		
		JComboBox cb3 = new JComboBox();
		cb3.setToolTipText("select no.of tickets");
		cb3.setModel(new DefaultComboBoxModel(new String[] {"SELET", "0", "1", "2", "3", "4"}));
		cb3.setBounds(340, 287, 105, 14);
		frame.getContentPane().add(cb3);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String source=(String) cb1.getSelectedItem();
				String destination=(String) cb2.getSelectedItem();
				String tickets=(String) cb3.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				int bill=0;
				if(source.equals(destination))
				{
					JOptionPane.showMessageDialog(btnNewButton, "please check stations");
				}
				else
				{
					bill=bill+nt*45;
					JOptionPane.showMessageDialog(btnNewButton, "NAME :"+name+ "\n SOURCE :"+source+ "\n DESTINATION :"+destination+ "\n NUMBER TICKETS :"+tickets+ "\n AMOUNT :" +bill);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(314, 381, 131, 20);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\22690.jpg"));
		lblNewLabel_5.setBounds(0, 0, 848, 488);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
