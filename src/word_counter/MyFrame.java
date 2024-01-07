package word_counter;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MyFrame extends JFrame implements ActionListener{

	JLabel label1,label2;
	JButton btn,btn2;
	JTextArea textarea;
	JScrollPane jscroll;
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800,600);
		this.setTitle("java Gui demo");
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(0xDCDCDC));
		
		
		
		 textarea=new JTextArea("thanks for your attention");
		textarea.setBounds(25,90,725,350);
		textarea.setFont(new Font("Arial",Font.PLAIN,10));
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		textarea.setMargin(new Insets(10,10,10,10));
		
		
		
		
		jscroll= new JScrollPane(textarea);
		jscroll.setBounds(25,90,725,350);
		
		
		
		
		label1=new JLabel("words");
		label1.setBounds(25,25,200,50);
		label1.setFont(new Font("Arial",Font.BOLD,12));
		label1.setForeground(Color.blue);
		
		
		
		
		
		label2=new JLabel("characters");
		label2.setBounds(500,25,200,50);
		label2.setFont(new Font("Arial",Font.BOLD,12));
		label2.setForeground(Color.blue);
		
		
		
		btn = new JButton("Number of words");
		btn.setBounds(25,460,200,50);
		btn.setFont(new Font("Arial",Font.BOLD,18));
		btn.setForeground(Color.blue);
		
		
		btn2 = new JButton("Number of character");
		btn2.setBounds(550,460,200,50);
		btn2.setFont(new Font("Arial",Font.BOLD,18));
		btn2.setForeground(Color.blue);
		
		btn.addActionListener(this);
		btn2.addActionListener(this);
		
		
		
	this.add(jscroll);
		this.add(label1);
		this.add(label2);
		//this.add(textarea);
		this.add(btn);
		this.add(btn2);
		this.setVisible(true);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String str=textarea.getText();
		
		String words []=str.split("\\s");
		if(e.getSource()==btn) {
		label1.setText("the number of words is: "+" "+words.length);
		}
		else if(e.getSource()==btn2) {
		label2.setText("The number of character is: "+" "+str.length());
		}
		
		
	}
	
	
	
	
	
	
	
	
	
}
