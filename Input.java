import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

@SuppressWarnings("serial")
public class Input extends JPanel {
	private JTextField display;
	public String infix;
	/**
	 * Create the panel.
	 */
	public Input() {
		this.infix = "";
		
		setBorder(null);
		setLayout(null);
		
		display = new JTextField();
		display.setFont(new Font("Consolas", Font.PLAIN, 18));
		display.setForeground(Color.GREEN);
		display.setBackground(Color.BLACK);
		display.setText(infix);
		display.setBounds(0, 0, 240, 68);
		add(display);
		display.setColumns(10);
		
		JButton button_0 = new JButton("0");
		button_0.setBackground(Color.LIGHT_GRAY);
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infix = infix + "0";
				display.setText(infix);
			}
		});
		button_0.setBounds(0, 248, 60, 60);
		add(button_0);
		
		JButton button_1 = new JButton("1");
		button_1.setBackground(Color.LIGHT_GRAY);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infix = infix + "1";
				display.setText(infix);
			}
		});
		button_1.setBounds(0, 188, 60, 60);
		add(button_1);
		
		JButton button_4 = new JButton("4");
		button_4.setBackground(Color.LIGHT_GRAY);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infix = infix + "4";
				display.setText(infix);
			}
		});
		button_4.setBounds(0, 128, 60, 60);
		add(button_4);
		
		JButton button_7 = new JButton("7");
		button_7.setBackground(Color.LIGHT_GRAY);
		button_7.setForeground(Color.BLACK);
		button_7.setFocusable(false);
		button_7.setFocusTraversalKeysEnabled(false);
		button_7.setFocusPainted(false);
		button_7.setSelectedIcon(null);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infix = infix + "7";
				display.setText(infix);
			}
		});
		button_7.setBounds(0, 68, 60, 60);
		add(button_7);
		
		JButton button_5 = new JButton("5");
		button_5.setBackground(Color.LIGHT_GRAY);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infix = infix + "5";
				display.setText(infix);
			}
		});
		button_5.setBounds(60, 128, 60, 60);
		add(button_5);
		
		JButton button_8 = new JButton("8");
		button_8.setBackground(Color.LIGHT_GRAY);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infix = infix + "8";
				display.setText(infix);
			}
		});
		button_8.setBounds(60, 68, 60, 60);
		add(button_8);
		
		JButton button_dot = new JButton(".");
		button_dot.setBackground(Color.LIGHT_GRAY);
		button_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infix = infix + ".";
				display.setText(infix);
			}
		});
		button_dot.setBounds(60, 248, 60, 60);
		add(button_dot);
		
		JButton button_2 = new JButton("2");
		button_2.setBackground(Color.LIGHT_GRAY);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infix = infix + "2";
				display.setText(infix);
			}
		});
		button_2.setBounds(60, 188, 60, 60);
		add(button_2);
		
		JButton button_equals = new JButton("=");
		button_equals.setBackground(Color.LIGHT_GRAY);
		button_equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculate calculator = new Calculate(infix);
				Integer result;
				// calculate
				calculator.calculate();
				// convert string to integer
				//result = calculator.getPostfix();
				// convert string to integer
				result = calculator.getResult();
				display.setText(result.toString());
			}
		});
		button_equals.setBounds(120, 248, 60, 60);
		add(button_equals);
		
		JButton button_3 = new JButton("3");
		button_3.setBackground(Color.LIGHT_GRAY);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infix = infix + "3";
				display.setText(infix);
			}
		});
		button_3.setBounds(120, 188, 60, 60);
		add(button_3);
		
		JButton button_6 = new JButton("6");
		button_6.setBackground(Color.LIGHT_GRAY);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infix = infix + "6";
				display.setText(infix);
			}
		});
		button_6.setBounds(120, 128, 60, 60);
		add(button_6);
		
		JButton button_9 = new JButton("9");
		button_9.setBackground(Color.LIGHT_GRAY);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infix = infix + "9";
				display.setText(infix);
			}
		});
		button_9.setBounds(120, 68, 60, 60);
		add(button_9);
		
		JButton button_add = new JButton("+");
		button_add.setBackground(Color.LIGHT_GRAY);
		button_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infix = infix + "+";
				display.setText(infix);
			}
		});
		button_add.setBounds(180, 248, 60, 60);
		add(button_add);
		
		JButton button_subtract = new JButton("-");
		button_subtract.setBackground(Color.LIGHT_GRAY);
		button_subtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infix = infix + "-";
				display.setText(infix);
			}
		});
		button_subtract.setBounds(180, 188, 60, 60);
		add(button_subtract);
		
		JButton button_multiply = new JButton("X");
		button_multiply.setBackground(Color.LIGHT_GRAY);
		button_multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infix = infix + "*";
				display.setText(infix);
			}
		});
		button_multiply.setBounds(180, 128, 60, 60);
		add(button_multiply);
		
		JButton button_divide = new JButton("/");
		button_divide.setBackground(Color.LIGHT_GRAY);
		button_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infix = infix + "/";
				display.setText(infix);
			}
		});
		button_divide.setBounds(180, 68, 60, 60);
		add(button_divide);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infix = "";
				display.setText(infix);
			}
		});
		btnClear.setBackground(Color.LIGHT_GRAY);
		btnClear.setBounds(0, 308, 240, 30);
		add(btnClear);
		
	}
}
