import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Point;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.Cursor;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	
	public Calculator() {
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setResizable(false);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 260, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField.setBounds(10, 21, 224, 43);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JRadioButton rdbtnOn = new JRadioButton("ON");
		rdbtnOn.setSelected(true);
		buttonGroup.add(rdbtnOn);
		rdbtnOn.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnOn.setBounds(0, -5, 48, 23);
		contentPane.add(rdbtnOn);
		rdbtnOn.setEnabled(false);
		rdbtnOn.setFocusPainted(false);
		
		
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnOff.setBounds(52, -5, 48, 23);
		contentPane.add(rdbtnOff);
		rdbtnOff.setFocusPainted(false);
		
		
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn1.setBounds(10, 213, 48, 35);
		contentPane.add(btn1);
		btn1.setFocusPainted(false);
		
		
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn2.setBounds(68, 213, 48, 35);
		contentPane.add(btn2);
		btn2.setFocusPainted(false);
		
		
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn3.setBounds(126, 213, 48, 35);
		contentPane.add(btn3);
		btn3.setFocusPainted(false);
		
		
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "+");
				if(textField.getText().length() > 3) {
					arithmeticEvaluation();
				}
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAdd.setBounds(186, 213, 48, 35);
		contentPane.add(btnAdd);
		btnAdd.setFocusPainted(false);
		
		
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "-");
				if(textField.getText().length() > 3) {
					arithmeticEvaluation();
				}
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSub.setBounds(186, 167, 48, 35);
		contentPane.add(btnSub);
		btnSub.setFocusPainted(false);
		
		
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn6.setBounds(126, 167, 48, 35);
		contentPane.add(btn6);
		btn6.setFocusPainted(false);
		
		
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn5.setBounds(68, 167, 48, 35);
		contentPane.add(btn5);
		btn5.setFocusPainted(false);
		
		
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn4.setBounds(10, 167, 48, 35);
		contentPane.add(btn4);
		btn4.setFocusPainted(false);
		
		
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "*");
				if(textField.getText().length() > 3) {
					arithmeticEvaluation();
				}
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMul.setBounds(186, 121, 48, 35);
		contentPane.add(btnMul);
		btnMul.setFocusPainted(false);
		
		
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn9.setBounds(126, 121, 48, 35);
		contentPane.add(btn9);
		btn9.setFocusPainted(false);
		
		
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn8.setBounds(68, 121, 48, 35);
		contentPane.add(btn8);
		btn8.setFocusPainted(false);
		
		
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn7.setBounds(10, 121, 48, 35);
		contentPane.add(btn7);
		btn7.setFocusPainted(false);
		
		
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "/");
				if(textField.getText().length() > 3) {
					arithmeticEvaluation();
				}
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDiv.setBounds(186, 75, 48, 35);
		contentPane.add(btnDiv);
		btnDiv.setFocusPainted(false);
		
		
		
		JButton btnNewButton_6_3 = new JButton("");
		btnNewButton_6_3.setEnabled(false);
		btnNewButton_6_3.setBounds(126, 75, 48, 35);
		contentPane.add(btnNewButton_6_3);
		
		
		
		JButton btnDel = new JButton("<");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int length = textField.getText().length();
				String store;
				
				if(length > 0) {
					StringBuilder del = new StringBuilder(textField.getText());
					del.deleteCharAt(length-1);
					store = del.toString();
					
					textField.setText(store);
				}
			}
		});
		btnDel.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDel.setBounds(68, 75, 48, 35);
		contentPane.add(btnDel);
		btnDel.setFocusPainted(false);
		
		
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnC.setBounds(10, 75, 48, 35);
		contentPane.add(btnC);
		btnC.setFocusPainted(false);
		
		
		
		JButton btnEq = new JButton("=");
		btnEq.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				evaluation();
				
			}
			
		});
		btnEq.setMnemonic(KeyEvent.VK_ENTER);
		btnEq.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEq.setBounds(186, 259, 48, 35);
		contentPane.add(btnEq);
		btnEq.setBackground(new Color(255, 137, 58));
	    btnEq.setForeground(Color.white);
	    btnEq.setFocusPainted(false);
		
		
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDot.setBounds(126, 259, 48, 35);
		contentPane.add(btnDot);
		btnDot.setFocusPainted(false);
		
		
		
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn0.setBounds(10, 259, 106, 35);
		contentPane.add(btn0);
		btn0.setFocusPainted(false);
		
		
		
//----------------ON / OFF----------------------
		
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setEnabled(false);
				btn0.setEnabled(false);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btnEq.setEnabled(false);
				btnAdd.setEnabled(false);
				btnSub.setEnabled(false);
				btnMul.setEnabled(false);
				btnDiv.setEnabled(false);
				btnC.setEnabled(false);
				btnDel.setEnabled(false);
				btnDot.setEnabled(false);
				
				rdbtnOn.setEnabled(true);
				rdbtnOff.setEnabled(false);
			}
		});
		
		rdbtnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rdbtnOn.setEnabled(false);
				rdbtnOff.setEnabled(true);
				textField.setEnabled(true);
				btn0.setEnabled(true);
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btnEq.setEnabled(true);
				btnAdd.setEnabled(true);
				btnSub.setEnabled(true);
				btnMul.setEnabled(true);
				btnDiv.setEnabled(true);
				btnC.setEnabled(true);
				btnDel.setEnabled(true);
				btnDot.setEnabled(true);
				
			}
		});
		
	
	}
	
	
	
//	------Runs when any operaton button is pressed----------
	public void arithmeticEvaluation() {
		String[] tokens = textField.getText().toString().split("(?<=[-+*/])|(?=[-+*/])");
		int result = 0;
		
		switch (tokens[1].charAt(0)) {
        case '+':
            result = Integer.parseInt(tokens[0])
                    + Integer.parseInt(tokens[2]);
            break;
        case '-':
            result = Integer.parseInt(tokens[0])
                    - Integer.parseInt(tokens[2]);
            break;
        case '*':
            result = Integer.parseInt(tokens[0])
                    * Integer.parseInt(tokens[2]);
            break;
        case '/':
            result = Integer.parseInt(tokens[0])
                    / Integer.parseInt(tokens[2]);
		}
		
		textField.setText(Integer.toString(result) + tokens[3]);
		
	}
	
	
//	-------Runs when Equals (=) button is pressed------
	public void evaluation() {
		
		
		String[] tokens = textField.getText().toString().split("(?<=[-+*/])|(?=[-+*/])");
		int result = 0;
		
		switch (tokens[1].charAt(0)) {
        case '+':
            result = Integer.parseInt(tokens[0])
                    + Integer.parseInt(tokens[2]);
            break;
        case '-':
            result = Integer.parseInt(tokens[0])
                    - Integer.parseInt(tokens[2]);
            break;
        case '*':
            result = Integer.parseInt(tokens[0])
                    * Integer.parseInt(tokens[2]);
            break;
        case '/':
            result = Integer.parseInt(tokens[0])
                    / Integer.parseInt(tokens[2]);
		}
		
		textField.setText(Integer.toString(result));
	}
	
		
}

