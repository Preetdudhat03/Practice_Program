import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
class FirstSwingChild extends JFrame{ 
FirstSwingChild()
{
 super("Demo Frame") ;

//setTitle("Demo Frame");           
setSize(400,500);//400 width and 500 height  
setVisible(true);//making the frame visible  
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args) {
	JFrame.setDefaultLookAndFeelDecorated(true);
  	FirstSwingChild f = new FirstSwingChild();
  }  
} 
