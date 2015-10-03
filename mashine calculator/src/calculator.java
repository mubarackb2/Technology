import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JSeparator;

public class calculator {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldAns;
	private JLabel lblMashineCalculator;
	private JLabel lblByBarakaAnd;
	private JButton btnMultplay;
	private JButton btnDivide;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
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
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(34, 36, 141, 41);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(234, 36, 141, 41);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, ans;
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					
					ans=num1+num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Please Enter Valode Number");
				}
			}
		});
		btnNewButton.setBounds(112, 106, 87, 28);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MINUS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					
					ans=num1-num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "Please Enter Valode Number");
				}
			}
		});
		btnNewButton_1.setBounds(234, 106, 97, 28);
		frame.getContentPane().add(btnNewButton_1);
		
		textFieldAns = new JTextField();
		textFieldAns.setBounds(185, 188, 154, 34);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		JLabel lblTheAnswerIs = new JLabel("The answer is");
		lblTheAnswerIs.setFont(new Font("Arial", Font.BOLD, 14));
		lblTheAnswerIs.setBounds(61, 190, 114, 28);
		frame.getContentPane().add(lblTheAnswerIs);
		
		lblMashineCalculator = new JLabel("Mashine Calculator");
		lblMashineCalculator.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMashineCalculator.setBounds(137, 11, 193, 25);
		frame.getContentPane().add(lblMashineCalculator);
		
		lblByBarakaAnd = new JLabel("By Baraka Kalumba And Mariekamile Weekend Class");
		lblByBarakaAnd.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblByBarakaAnd.setBounds(34, 229, 368, 22);
		frame.getContentPane().add(lblByBarakaAnd);
		
		btnMultplay = new JButton("MULTIPLUY");
		btnMultplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnMultplay.setBounds(112, 145, 89, 28);
		frame.getContentPane().add(btnMultplay);
		
		btnDivide = new JButton("DIVIDE");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnDivide.setBounds(234, 140, 96, 28);
		frame.getContentPane().add(btnDivide);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(174, 166, 1, 2);
		frame.getContentPane().add(separator);
	}
}
