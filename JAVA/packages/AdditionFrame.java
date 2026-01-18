import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 class AdditionFrame extends Frame implements ActionListener
{
	    Label lbl1,lbl2,lbl3;
		TextField tf1,tf2,tf3;
		Button add ,reset;
	AdditionFrame()
	{
		setTitle("Addition Frame");
		setLayout(new FlowLayout(FlowLayout.LEFT));

		lbl1 = new Label("Num 1: ");
		add(lbl1);
		tf1  = new TextField(15);
		add(tf1);
		lbl2 = new Label("Num 2: ");
		add(lbl2);
		tf2  = new TextField(15);
		add(tf2);

		lbl3 = new Label("Result: ");
		add(lbl3);
		tf3  = new TextField(15);
		add(tf3);
		tf3.setEditable(false);
		add = new Button("Add");
		add(add);
		reset = new Button("Reset");
		add(reset);
		add.addActionListener(this);
		reset.addActionListener(this);
		setSize(800,800);
		setVisible(true);
		

	}
	public void actionPerformed(ActionEvent ae)
	{
		String txt1 = tf1.getText();
		String txt2 = tf2.getText();
		
		String bpressed = ae.getActionCommand();
		//Button bpressed = (Button) ae.getSource();
		if(txt1.equals("")||txt2.equals(""))
		{
			JOptionPane.showMessageDialog(this,"Please enter the number in both textboxes");
		}
		else
		{
			//if(bpressed==add)
			if(bpressed.equals("Add"))
			{
				int a =Integer.parseInt(txt1);
				int b =Integer.parseInt(txt2);
				int c =a+b;
				tf3.setText(""+c);
			}
			else
			{
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
			}
		}
	}
	public static void main(String args[])

		{
			AdditionFrame f = new AdditionFrame();
		}
}