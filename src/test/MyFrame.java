package test;
import java.awt.*;
import java.awt.event.*;
public class MyFrame extends Frame implements ActionListener{
	private Button quit=new Button("quit");
	public MyFrame(){
		super("Test");
		add(quit);
		pack();
		setVisible(true);
		quit.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		dispose();
		System.exit(0);
	}
	public static void main(String arg[]){
		MyFrame f=new MyFrame();
	}
}
