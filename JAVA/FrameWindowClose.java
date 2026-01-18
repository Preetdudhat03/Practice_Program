import java.awt.*;
import java.awt.event.*;


public class FrameWindowClose extends Frame
{
	FrameWindowClose(String Title)
	{
		addWindowListener(new MyWindowAdapter(this));
		setTitle("preet");
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		FrameWindowClose window = new FrameWindowClose("Frame Close Demo");
	}
}
class MyWindowAdapter extends WindowAdapter
{
	FrameWindowClose fwc;
	MyWindowAdapter(FrameWindowClose fwc)
	{
		this.fwc = fwc;
	}
	public void WindowClosing(WindowEvent e)
	{
		fwc.setVisible(false);
		System.out.println("Window Closing Soon...");
		//fwc.dispose();
		System.exit(0);
	}
}