import java.awt.*;
import java.awt.event.*;
 class AddFrame extends Frame implements ActionListener
{
	    Label lbl1,lbl2,lbl3;
		TextField tf1,tf2,tf3;
		Button add ,reset;
	AddFrame()
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

		add = new Button("Add");
		add(add);
		reset = new Button("Reset");
		add(reset);
		add.addActionListener(this);
		setSize(800,800);
		setVisible(true);
		

	}
	public void actionPerformed(ActionEvent ae)
	{
		System.out.println("Button Pressed");
		System.out.println("Content of text: "+tf1.getText());
	}
	public static void main(String args[])

		{
			AddFrame f = new AddFrame();
		}
}