package yuvan.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Studentregistrationform {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;
	private final JLabel lblNewLabel_6 = new JLabel("rolll no");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Studentregistrationform window = new Studentregistrationform();
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
	public Studentregistrationform() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 499, 332);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT REGISTRATION FORM");
		lblNewLabel.setBounds(187, 11, 193, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("name");
		lblNewLabel_1.setBounds(46, 61, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(46, 98, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("branch");
		lblNewLabel_3.setBounds(46, 128, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("gender");
		lblNewLabel_4.setBounds(46, 153, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("lang");
		lblNewLabel_5.setBounds(46, 187, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		tb1 = new JTextField();
		tb1.setBounds(147, 58, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(147, 95, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "EEE", "ECE", "MECH", "CSE"}));
		cb1.setBounds(147, 124, 69, 22);
		frame.getContentPane().add(cb1);
		
		JRadioButton r1 = new JRadioButton("male");
		r1.setBounds(141, 149, 109, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("female");
		r2.setBounds(261, 149, 109, 23);
		frame.getContentPane().add(r2);
		
		JCheckBox c1 = new JCheckBox("c");
		c1.setBounds(147, 183, 97, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("pyt");
		c2.setBounds(254, 183, 97, 23);
		frame.getContentPane().add(c2);
		
		JCheckBox c3 = new JCheckBox("java");
		c3.setBounds(364, 183, 97, 23);
		frame.getContentPane().add(c3);
		lblNewLabel_6.setBounds(39, 86, 98, 31);
		frame.getContentPane().add(lblNewLabel_6);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
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
				//if(c1.isSelecetd())
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
	JOptionPane.showMessageDialog(btnNewButton,"NAME:"+name+"\nROLLNO:"+rollno+"\nBRANCH"+branch+"\nGENDER:"+gender+"\nPROG LANGS"+langs+));
			}
		});
		btnNewButton.setBounds(161, 248, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
