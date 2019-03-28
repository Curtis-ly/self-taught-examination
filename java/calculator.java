//计算器程序

package experiment;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class calculator {
	public static void main(String[] args) {
		new Addition();	
	}	
}

class Addition extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	JTextField text1,text2,text3;
	JButton addButton,subButton,mulButton,divButton;
	Addition(){
		setSize(300,200);
		text1 = new JTextField(10);
		text2 = new JTextField(10);
		text3 = new JTextField(10);
		setLayout(new GridLayout(7,1,5,5));
		addButton = new JButton("加");
		subButton = new JButton("减");
		mulButton = new JButton("乘");
		divButton = new JButton("除");
		text3.setEditable(false);
		add(text1);
		add(text2);
		add(text3);
		add(addButton);
		add(subButton);
		add(mulButton);
		add(divButton);
		addButton.addActionListener(this);
		subButton.addActionListener(this);
		mulButton.addActionListener(this);
		divButton.addActionListener(this);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		}
	
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == addButton) {
				int t1 = Integer.parseInt(text1.getText());
				int t2 = Integer.parseInt(text2.getText());
				text3.setText(t1+t2+"");
			}else if(e.getSource() == subButton) {
				int t1 = Integer.parseInt(text1.getText());
				int t2 = Integer.parseInt(text2.getText());
				text3.setText(t1-t2+"");
			}else if(e.getSource() == mulButton) {
				int t1 = Integer.parseInt(text1.getText());
				int t2 = Integer.parseInt(text2.getText());
				text3.setText(t1*t2+"");
			}else if(e.getSource() == divButton) {
				int t1 = Integer.parseInt(text1.getText());
				int t2 = Integer.parseInt(text2.getText());
				text3.setText(t1/t2+"");
			}
			
		}
}
