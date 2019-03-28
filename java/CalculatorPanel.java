package com.curtis.test;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class CalculatorPanel extends JPanel {
	
	private JButton display;
	private double result;
	private boolean strat;
	private String lastCommand;
	
	public CalculatorPanel() {
		result = 0.0;
		strat = true;
		lastCommand = "=";
		
		this.setLayout(new BorderLayout());
		
		display = new JButton("0");
		display.setEnabled(false);
		this.add(display, BorderLayout.NORTH);
		
		InsertListener insertListener = new InsertListener();
		CommandListener commandListener = new CommandListener();
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4, 4));
		
		addButton(panel, new JButton("7"), insertListener); 
		addButton(panel, new JButton("8"), insertListener); 
		addButton(panel, new JButton("9"), insertListener); 
		addButton(panel, new JButton("/"), commandListener);
		
		addButton(panel, new JButton("4"), insertListener); 
		addButton(panel, new JButton("5"), insertListener); 
		addButton(panel, new JButton("6"), insertListener); 
		addButton(panel, new JButton("*"), commandListener);
		
		addButton(panel, new JButton("1"), insertListener); 
		addButton(panel, new JButton("2"), insertListener); 
		addButton(panel, new JButton("3"), insertListener); 
		addButton(panel, new JButton("-"), commandListener); 
		
		addButton(panel, new JButton("0"), insertListener); 
		addButton(panel, new JButton("."), insertListener); 
		addButton(panel, new JButton("="), commandListener); 
		addButton(panel, new JButton("+"), commandListener);
		
		
		this.add(panel, BorderLayout.CENTER);
		
	}
	
	private void addButton(JPanel panel, JButton button, ActionListener listener) {
		button.addActionListener(listener);
		panel.add(button);
	}
	
	private void calculate(double x) {
		if(lastCommand.equals("+")) {
			result += x;
		} else if(lastCommand.equals("-")) {
			result -= x;
		} else if(lastCommand.equals("*")) {
			result *= x;
		} else if(lastCommand.equals("/")) {
			result /= x;
		} else if(lastCommand.equals("=")) {
			result = x;
		}
		display.setText(String.valueOf(result));
	}

	private class InsertListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String inputString = e.getActionCommand();
			if(strat) {
				display.setText("");
				strat = false;
			}
			display.setText(display.getText() + inputString);
		}
		
	}
	
	private class CommandListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String command = e.getActionCommand();
			if(strat) {
				if(command.equals("-")) {
					display.setText(command);
					strat = false;
				} else {
					lastCommand = command;
				}
			} else {
				calculate(Double.parseDouble(display.getText()));
				lastCommand = command;
				strat = true;
			}
			
		}
		
	}
}
