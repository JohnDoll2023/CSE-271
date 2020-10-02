import javax.swing.JFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator implements ActionListener{

	JTextArea display;
	Double d1 = 0.0;
	Double d2 = 0.0;
	boolean add = false;
	boolean sub = false;
	boolean mult = false;
	boolean div = false;
	boolean equal =  false;
	char c2 = 247;
	String s = String.valueOf(c2);
	boolean error = false;
	boolean sin = false;
	boolean cos = false;
	boolean tan = false;
	boolean clear = false;
	
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
	}
	
	public Calculator () {
		JFrame frame = new JFrame();
		frame.setSize(300, 300);
		frame.setTitle("Calculator");
		JPanel calcPanel = new JPanel(new BorderLayout());
		JPanel numbers = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		
		//number buttons
		for(int i = 1; i <= 9; i++) {
			JButton button = new JButton("" + i);
			c.gridx = ((i - 1) % 3);
			c.gridy = (i - 1)/3;
			numbers.add(button, c);
			button.addActionListener(this);
		}
		JButton zeroButton = new JButton("0");
		c.gridx = 0;
		c.gridy = 3;
		numbers.add(zeroButton, c);
		zeroButton.addActionListener(this);
		
		//Number modifier
		JButton decimalButton = new JButton(".");
		c.gridx = 1;
		c.gridy = 3;
		numbers.add(decimalButton, c);
		decimalButton.addActionListener(this);
		JButton negButton = new JButton("(-)");
		c.gridx = 2;
		c.gridy = 3;
		numbers.add(negButton, c);
		negButton.addActionListener(this);
		
		//Math operators
		JButton addButton = new JButton("+");
		c.gridx = 3;
		c.gridy = 0;
		c.gridheight = 1;
		numbers.add(addButton, c);
		addButton.addActionListener(this);
		JButton subButton = new JButton("-");
		c.gridx = 3;
		c.gridy = 1;
		numbers.add(subButton, c);
		subButton.addActionListener(this);
		JButton multButton = new JButton("x");
		c.gridx = 3;
		c.gridy = 2;
		numbers.add(multButton, c);
		multButton.addActionListener(this);
		JButton divButton = new JButton(s);
		c.gridx = 3;
		c.gridy = 3;
		numbers.add(divButton, c);
		divButton.addActionListener(this);
		JButton equalButton = new JButton("=");
		c.gridx = 3;
		c.gridy = 5;
		//c.gridheight = 2;
		//c.ipady = 27;
		numbers.add(equalButton, c);
		equalButton.addActionListener(this);
		JButton sinButton = new JButton("sin");
		c.gridx = 0;
		c.gridy = 5;
		numbers.add(sinButton, c);
		sinButton.addActionListener(this);
		JButton cosButton = new JButton("cos");
		c.gridx = 1;
		c.gridy = 5;
		numbers.add(cosButton, c);
	    cosButton.addActionListener(this);
		JButton tanButton = new JButton("tan");
		c.gridx = 2;
		c.gridy = 5;
		numbers.add(tanButton, c);
		tanButton.addActionListener(this);
		
		//Clear button
		JButton CButton = new JButton("Clear");
		c.gridx = 3;
		c.gridy = 6;
		numbers.add(CButton, c);
		CButton.addActionListener(this);
		
		//Add panel to another panel
		display = new JTextArea();
		display.setEditable(false);
		calcPanel.add(numbers, BorderLayout.CENTER);
		calcPanel.add(display, BorderLayout.NORTH);
		frame.add(calcPanel);
		
		//Adds menu bar
		JMenu file = new JMenu("File");
		JMenuItem menuSave = new JMenuItem("Save");
		file.add(menuSave);
		JMenuItem menuExit = new JMenuItem("Exit");
		file.add(menuExit);
		JMenu edit = new JMenu("Edit");
		JMenuBar myMenus = new JMenuBar();
		myMenus.add(file);
		myMenus.add(edit);
		frame.setJMenuBar(myMenus);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Checks what button is clicked
		
		//Clear Button
		if (e.getActionCommand().equals("Clear")) {
			if(display.getText().equals("")) {
				//clear = true;
				add = false;
				sub = false;
				mult = false;
				div = false;
				equal = false;
				sin = false;
				cos = false;
				tan = false;
				display.setText(Double.toString(d1));
			}
			
			else {
				display.setText("");
				d1 = 0.0;
				d2 = 0.0;
			}
		}
		
		//Equals Button
		else if(e.getActionCommand().equals("=")) {
			equal = true;
			if(!sin && !cos && !tan)
				display.setText("");
			
			//Checks what operator is active, does appropriate calculations
			if(add) {
				display.append(Double.toString(d1 + d2));
				d1 += d2;
				add = false;
			}
			
			else if(sub) {
				display.append(Double.toString(d1 - d2));
				d1 -= d2;
				sub = false;
			}
			
			else if(mult) {
				display.append(Double.toString(d1 * d2));
				d1 *= d2;
				mult = false;
			}
			
			else if(div) {
				if(d2 == 0) {
					display.setText("Error: Div by 0");
					error = true;
					d1 = 0.0;
					d2 = 0.0;
				}
				
				else {
					display.append(Double.toString(d1 / d2));
					d1 /= d2;
				}
				div = false;
			}

			else if(sin) {
				String sinInput = display.getText().substring(4);
				String sinAns = "" + Math.sin(Double.parseDouble(sinInput));
				d1 = Math.sin(Double.parseDouble(sinInput));
				display.setText("");
				display.append(sinAns);
				sin = false;
				equal = false;
			}
			
			else if(cos) {
				String cosInput = display.getText().substring(4);
				String cosAns = "" + Math.cos(Double.parseDouble(cosInput));
				d1 = Math.cos(Double.parseDouble(cosInput));
				display.setText("");
				display.append(cosAns);
				cos = false;
				equal = false;
			}
			
			else if(tan) {
				String tanInput = display.getText().substring(4);
				String tanAns = "" + Math.tan(Double.parseDouble(tanInput));
				d1 = Math.tan(Double.parseDouble(tanInput));
				display.setText("");
				display.append(tanAns);
				tan = false;
				equal = false;
			}
			
			else {
				display.append(Double.toString(d1));
			}
		}
		
		//Adds decimal point
		else if(e.getActionCommand().equals(".")) {
			if(equal)
				display.setText("");
			display.append(".");
			equal = false;
		}
		
		//Makes number negative
		else if(e.getActionCommand().equals("(-)")) {
			String n = display.getText();
			display.setText("");
			if(n.indexOf('-') != -1) {
				if(add || sub || mult || div) {
					d2 = 0 - d2;
				}
				
				else {
					d1 = 0 - d1;
				}
				
				display.setText(n.substring(1));
			}
			
			else {
				display.setText("");
				if(add || sub || mult || div) {
					d2 = 0 - d2;
				}
				
				else {
					d1 = 0 - d1;
				}
				
			display.setText("-" + n);
			}
		}
		
		//Addition button
		else if(e.getActionCommand().equals("+")) {
			add = true;
			sub = false;
			mult = false;
			div = false;
			display.setText("");
		}
		
		//Subtraction button
		else if(e.getActionCommand().equals("-")) {
			sub = true;
			add = false;
			mult = false;
			div = false;
			display.setText("");
		}
		
		//Multiplication button
		else if(e.getActionCommand().equals("x")) {
			mult = true;
			add = false;
			sub = false;
			div = false;
			display.setText("");
		}
		
		//Division button
		else if(e.getActionCommand().equals(s)) {
			div = true;
			add = false;
			sub = false;
			mult = false;
			display.setText("");
		}
		
		//Sin button
		else if(e.getActionCommand().equals("sin")) {
			if(!display.getText().equals("")) {
				String sinInput = display.getText();
				String sinAns;
				display.setText("");
				sinAns = "" + Math.sin(Double.parseDouble(sinInput));
				display.append(sinAns);
			}
			
			else {
				display.append("sin(");
				sin = true;
			}
		}
		
		//Cos button
		else if(e.getActionCommand().equals("cos")) {
			if(!display.getText().equals("")) {
				String cosInput = display.getText();
				String cosAns;
				display.setText("");
				cosAns = "" + Math.cos(Double.parseDouble(cosInput));
				display.append(cosAns);
			}
			
			else {
				display.append("cos(");
				cos = true;
			}
		}
		
		//Tan button
		else if(e.getActionCommand().equals("tan")) {
			if(!display.getText().equals("")) {
				String tanInput = display.getText();
				String tanAns;
				display.setText("");
				tanAns = "" + Math.tan(Double.parseDouble(tanInput));
				display.append(tanAns);
			}
			
			else {
				display.append("tan(");
				tan = true;
			}
		}
		
		//Excepts numeric input until non-numeric input is specified
		else if(e.getActionCommand().matches("^[0-9]")) {
			
			//Sets second number
			if(add || sub || mult || div) {
				display.append(e.getActionCommand());
				d2 = Double.parseDouble(display.getText());
			}
			
			
			//Sets first number
			else {
				if(error || equal) 
					display.setText("");
				error = false;
				equal = false;
				display.append(e.getActionCommand());
				if(!sin && !cos && !tan)
					d1 = Double.parseDouble(display.getText());
			}
		}
	}
}