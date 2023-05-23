package Form_AWT;

import java.awt.*;
import java.awt.event.*;

public class AdditionInFrame {

	public static void main(String[] args) {

		Frame f = new Frame("Addition:");

		f.setSize(1920, 1080);
		f.setLayout(null);
		f.setVisible(true);
		
		//First_Number--
		Label lb = new Label("First Number:");
		lb.setBounds(500, 150, 203, 30);
		lb.setFont(new Font("Arial", Font.BOLD, 16));
		TextField t = new TextField();
		t.setBounds(500, 180, 340, 30);

		f.add(lb);
		f.add(t);
		
		// Second_Number--
		Label lb1 = new Label("Second Number:");
		lb1.setBounds(500, 230, 203, 30);
		lb1.setFont(new Font("Arial", Font.BOLD, 16));
		TextField t1 = new TextField();
		t1.setBounds(500, 260, 340, 30);

		f.add(lb1);
		f.add(t1);
		
		// Result--
		Label lb2 = new Label("Result:");
		lb2.setBounds(500, 290, 203, 30);
		lb2.setFont(new Font("Arial", Font.BOLD, 16));
		TextField t2 = new TextField();
		t2.setBounds(500, 320, 340, 30);

		f.add(lb2);
		f.add(t2);
		
		// Add_Here_Label--
		Label lb3 = new Label("Add Here:");
		lb3.setFont(new Font("Arial", Font.BOLD, 16));
		lb3.setBounds(500, 350, 203, 30);

		f.add(lb3);
		
		// Button--
		Button bt= new Button("ADD");
		bt.setBounds(500,380,100,30);
		bt.addActionListener((ActionListener) new ActionListener() {
	  public void actionPerformed(ActionEvent e) {
		     int num1 = Integer.parseInt(t.getText());
             int num2 = Integer.parseInt(t1.getText());
             int sum = num1 + num2;
             t2.setText(Integer.toString(sum));;
	        }});
		
		f.add(bt);
		
		// WindowCloser--
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}
