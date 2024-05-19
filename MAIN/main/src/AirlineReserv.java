import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;

public class AirlineReserv extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AirlineReserv frame = new AirlineReserv();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AirlineReserv() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\raisen\\Desktop\\VSC.PROJS\\vsc.java\\MAIN\\AirlineReserv\\src\\logo 2 (1).png"));
		setTitle("Reservation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 687);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("Multi-city/stopvover");
		lbl1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl1.setBackground(Color.WHITE);
		lbl1.setBounds(349, 99, 134, 15);
		contentPane.add(lbl1);
		
		tf1 = new JTextField();
		tf1.setBounds(32, 175, 194, 34);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		JRadioButton rdbtn1 = new JRadioButton("Round Trip");
		rdbtn1.setBounds(32, 96, 109, 23);
		contentPane.add(rdbtn1);
		
		JRadioButton rdbtn3 = new JRadioButton("One Way");
		rdbtn3.setBounds(200, 96, 109, 23);
		contentPane.add(rdbtn3);
		
		JLabel lbl2 = new JLabel("From : ");
		lbl2.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lbl2.setBounds(32, 150, 48, 14);
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel("To : ");
		lbl3.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lbl3.setBounds(277, 150, 48, 14);
		contentPane.add(lbl3);
		
		tf2 = new JTextField();
		tf2.setBounds(273, 175, 179, 34);
		contentPane.add(tf2);
		tf2.setColumns(10);
		
		JLabel lbl4 = new JLabel("Departure : ");
		lbl4.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lbl4.setBounds(503, 150, 74, 14);
		contentPane.add(lbl4);
		
		tf3 = new JTextField();
		tf3.setBounds(503, 174, 116, 34);
		contentPane.add(tf3);
		tf3.setColumns(10);
		
		JLabel lbl5 = new JLabel("Return : ");
		lbl5.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lbl5.setBounds(680, 151, 48, 14);
		contentPane.add(lbl5);
		
		textField = new JTextField();
		textField.setBounds(680, 175, 102, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lbl6 = new JLabel("Passenger(s) / Travel Class");
		lbl6.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lbl6.setBounds(32, 255, 194, 14);
		contentPane.add(lbl6);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 0, 5, 22);
		contentPane.add(textArea);
		
		JCheckBox chckbx2 = new JCheckBox("First");
		chckbx2.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		chckbx2.setBounds(152, 318, 74, 23);
		contentPane.add(chckbx2);
		
		JCheckBox chckbx3 = new JCheckBox("Business");
		chckbx3.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		chckbx3.setBounds(228, 318, 97, 23);
		contentPane.add(chckbx3);
		
		JSpinner spinner1 = new JSpinner();
		spinner1.setBounds(74, 409, 37, 29);
		contentPane.add(spinner1);
		
		JPanel p2 = new JPanel();
		p2.setBackground(Color.WHITE);
		p2.setForeground(Color.WHITE);
		p2.setBounds(32, 276, 266, 34);
		contentPane.add(p2);
		
		JLabel lbl7 = new JLabel("TRAVEL CLASS");
		lbl7.setFont(new Font("Century Gothic", Font.BOLD, 12));
		p2.add(lbl7);
		
		JCheckBox chckbx1 = new JCheckBox("Economy");
		chckbx1.setBounds(32, 317, 79, 25);
		contentPane.add(chckbx1);
		chckbx1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(32, 359, 266, 34);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("PASSENGER");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 12));
		panel.add(lblNewLabel);
		
		JLabel lbl9 = new JLabel("Adult");
		lbl9.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lbl9.setBounds(32, 415, 48, 14);
		contentPane.add(lbl9);
		
		JLabel lblNewLabel_1 = new JLabel("Child");
		lblNewLabel_1.setBounds(133, 416, 37, 14);
		contentPane.add(lblNewLabel_1);
		
		JSpinner spinner2 = new JSpinner();
		spinner2.setBounds(168, 409, 37, 29);
		contentPane.add(spinner2);
		
		JLabel lblNewLabel_2 = new JLabel("Infant");
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(228, 415, 48, 14);
		contentPane.add(lblNewLabel_2);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(272, 409, 37, 29);
		contentPane.add(spinner);
		
		JButton btnNewButton = new JButton("Book Now");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		btnNewButton.setBounds(512, 499, 194, 57);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Name : ");
		lblNewLabel_3.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblNewLabel_3.setBounds(435, 255, 48, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(435, 277, 325, 33);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Passport No. : ");
		lblNewLabel_4.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblNewLabel_4.setBounds(435, 344, 97, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(435, 369, 325, 34);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}
}
