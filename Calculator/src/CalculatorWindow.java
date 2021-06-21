import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorWindow {

	private JFrame frame;
	private JTextField txt_result;
	
	private double numbers[];
	private int index = 0;
	private double number1, number2;
	private double result;
	private String temdeg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorWindow window = new CalculatorWindow();
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
	public CalculatorWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		Calculator calc = new Calculator();
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("Calculator");
		frame.setBounds(100, 100, 370, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txt_result = new JTextField();
		txt_result.setBackground(Color.WHITE);
		txt_result.setEditable(false);
		txt_result.setHorizontalAlignment(SwingConstants.RIGHT);
		txt_result.setFont(new Font("Tahoma", Font.BOLD, 18));
		txt_result.setBounds(10, 11, 340, 47);
		frame.getContentPane().add(txt_result);
		txt_result.setColumns(10);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_result.getText().equals("0"))
					txt_result.setText(btn_7.getText());
				else
					txt_result.setText(txt_result.getText() + btn_7.getText());
			}
		});
		btn_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_7.setBounds(10, 69, 60, 50);
		frame.getContentPane().add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_result.getText().equals("0"))
					txt_result.setText(btn_8.getText());
				else
					txt_result.setText(txt_result.getText() + btn_8.getText());
			}
		});
		btn_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_8.setBounds(80, 69, 60, 50);
		frame.getContentPane().add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_result.getText().equals("0"))
					txt_result.setText(btn_9.getText());
				else
					txt_result.setText(txt_result.getText() + btn_9.getText());
			}
		});
		btn_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_9.setBounds(150, 69, 60, 50);
		frame.getContentPane().add(btn_9);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_result.getText().equals("0"))
					txt_result.setText(btn_4.getText());
				else
					txt_result.setText(txt_result.getText() + btn_4.getText());
			}
		});
		btn_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_4.setBounds(10, 130, 60, 50);
		frame.getContentPane().add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_result.getText().equals("0"))
					txt_result.setText(btn_5.getText());
				else
					txt_result.setText(txt_result.getText() + btn_5.getText());
			}
		});
		btn_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_5.setBounds(80, 130, 60, 50);
		frame.getContentPane().add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_result.getText().equals("0"))
					txt_result.setText(btn_6.getText());
				else
					txt_result.setText(txt_result.getText() + btn_6.getText());
			}
		});
		btn_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_6.setBounds(150, 130, 60, 50);
		frame.getContentPane().add(btn_6);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_result.getText().equals("0"))
					txt_result.setText(btn_1.getText());
				else
					txt_result.setText(txt_result.getText() + btn_1.getText());
			}
		});
		btn_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_1.setBounds(10, 191, 60, 50);
		frame.getContentPane().add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_result.getText().equals("0"))
					txt_result.setText(btn_2.getText());
				else
					txt_result.setText(txt_result.getText() + btn_2.getText());
			}
		});
		btn_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_2.setBounds(80, 191, 60, 50);
		frame.getContentPane().add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_result.getText().isEmpty())
					txt_result.setText(btn_3.getText());
				else if(!txt_result.getText().equals("0"))				
					txt_result.setText(txt_result.getText() + btn_3.getText());
			}
		});
		btn_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_3.setBounds(150, 191, 60, 50);
		frame.getContentPane().add(btn_3);
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_result.getText().isEmpty())
					txt_result.setText(btn_0.getText());
				else if(!txt_result.getText().equals("0"))				
					txt_result.setText(txt_result.getText() + btn_0.getText());
			}
		});
		btn_0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_0.setBounds(10, 252, 60, 50);
		frame.getContentPane().add(btn_0);
		
		JButton btn_point = new JButton(".");
		btn_point.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txt_result.getText().isEmpty() && !txt_result.getText().contains("."))					
					txt_result.setText(txt_result.getText() + ".");
			}
		});
		btn_point.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_point.setBounds(80, 252, 60, 50);
		frame.getContentPane().add(btn_point);
		
		JButton btn_plusOrMinus = new JButton("+/-");
		btn_plusOrMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txt_result.getText().isEmpty()) {
					number1 = Double.parseDouble(txt_result.getText());
					result = calc.plusOrMinus(number1);
					txt_result.setText(String.valueOf(result));
				}
			}
		});
		btn_plusOrMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_plusOrMinus.setBounds(150, 252, 130, 50);
		frame.getContentPane().add(btn_plusOrMinus);
		
		JButton btn_multiply = new JButton("*");
		btn_multiply.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_multiply.setBounds(220, 69, 60, 50);
		frame.getContentPane().add(btn_multiply);
		
		JButton btn_divide = new JButton("/");
		btn_divide.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_divide.setBounds(220, 130, 60, 50);
		frame.getContentPane().add(btn_divide);
		
		JButton btn_sub = new JButton("-");
		btn_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txt_result.getText().isEmpty()) {
					number1 = Double.parseDouble(txt_result.getText());
					index++;
					temdeg = "-";
				}
				txt_result.setText("");
			}
		});
		btn_sub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_sub.setBounds(220, 191, 60, 50);
		frame.getContentPane().add(btn_sub);
		
		JButton btn_equal = new JButton("=");
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(temdeg) {
				case "+": {
					number2 = Double.parseDouble(txt_result.getText());
					result = calc.add(number1, number2);
					txt_result.setText(String.valueOf(result));
					break;
				}
				case "-":{
					number2 = Double.parseDouble(txt_result.getText());
					result = calc.sub(number1, number2);
					txt_result.setText(String.valueOf(result));
					break;
				}
				}
			}
		});
		btn_equal.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_equal.setBounds(290, 252, 60, 50);
		frame.getContentPane().add(btn_equal);
		
		JButton btn_clear = new JButton("C");
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_result.setText("");
			}
		});
		btn_clear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_clear.setBounds(290, 69, 60, 50);
		frame.getContentPane().add(btn_clear);
		
		JButton btn_add = new JButton("+");
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txt_result.getText().isEmpty()) {
					number1 = Double.parseDouble(txt_result.getText());
					index++;
					temdeg = "+";
				}
				txt_result.setText("");
			}
		});
		btn_add.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_add.setBounds(290, 130, 60, 111);
		frame.getContentPane().add(btn_add);
	}

}
