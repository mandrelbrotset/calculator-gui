import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;

public class MainWindow {
	private JFrame frmCalculator;
	
	public MainWindow() {
		initialize();		
		Input input = new Input();
		getFrame().getContentPane().add(input);
		
	}

	private void initialize() {
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 246, 367);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public JFrame getFrame() {
		return frmCalculator;
	}

	public void setFrame(JFrame frame) {
		this.frmCalculator = frame;
		frmCalculator.setVisible(true);
		frmCalculator.setTitle("Calculator");
		frame.setResizable(false);
		frame.setBackground(Color.LIGHT_GRAY);
	}
}
