import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 class OddEvenFrame extends Frame implements ActionListener
{
	    Label lbl1,lbl2,lbl3;
		TextField tf1,tf2,tf3;
		Button check ,reset;
	OddEvenFrame()
	{
		setTitle("Even Odd Frame");
		setLayout(new FlowLayout(FlowLayout.LEFT));
		lbl1 = new Label("Enter Number: ");
		add(lbl1);
		tf1  = new TextField(15);
		add(tf1);
		tf1.setFont(new Font("Serif",Font.BOLD,15));
		lbl2 = new Label("Num 2: ");
		add(lbl2);
		tf2  = new TextField(15);
		add(tf2);
		tf2.setEditable(false);
		check = new Button("check");
		add(check);
		reset = new Button("Reset");
		add(reset);
		check.addActionListener(this);
		reset.addActionListener(this);
		//addWindowListener(this);
		setSize(800,800);
		setVisible(true);
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
		

	}
	public void actionPerformed(ActionEvent ae)
	{
		String txt1  = tf1.getText();
		String bpressed = ae.getActionCommand();
		//Button bpressed = (Button) ae.getSource();
		if(txt1.equals(""))
		{
			JOptionPane.showMessageDialog(this,"Please enter the number in both textboxes");
		}
		else
		{
			//if(bpressed==add)
			if(bpressed.equals("check"))
			{
				int a =Integer.parseInt(txt1);
				if(a%2==0)
				{
					tf2.setText("Even");
				}
				else
				{
					tf2.setText("Odd");
				}

			}
			else
			{
				tf1.setText("");
				tf2.setText("");
			}
		}
	}
	

	public static void main(String args[])

		{
			OddEvenFrame f = new OddEvenFrame();
		}
}