import java.awt.Button;  
import java.awt.GridBagConstraints;  
import java.awt.GridBagLayout;  
import java.awt.*;
  
import javax.swing.*;  
public class GridBagCustom extends JFrame
{  
   public GridBagCustom() 
   {  
    
   GridBagConstraints gbc = new GridBagConstraints();  
   setTitle("GridBag Layout Example");  
   GridBagLayout layout = new GridBagLayout();  
    this.setLayout(layout);  
    //gbc.fill = GridBagConstraints.BOTH;
    gbc.fill = GridBagConstraints.HORIZONTAL;  
    gbc.gridx = 0;  
    gbc.gridy = 0;  
    this.add(new Label("User Name:"), gbc);  
    gbc.gridx = 1;  
    gbc.gridy = 0;  
    this.add(new TextField(10), gbc);  
    gbc.fill = GridBagConstraints.HORIZONTAL;  
    //gbc.ipady = 20;  
    gbc.gridx = 0;  
    gbc.gridy = 1;  
    this.add(new Label("Password:"), gbc);  
    gbc.gridx = 1;  
    gbc.gridy = 1;  
    this.add(new JPasswordField(10), gbc);
    gbc.fill = GridBagConstraints.HORIZONTAL;   
    gbc.gridx = 0;  
    gbc.gridy = 2;  
    //gbc.fill = GridBagConstraints.HORIZONTAL;  
    gbc.gridwidth = 2;  
    this.add(new Button("LOGIN"), gbc);  
    setSize(300, 300);  
    setPreferredSize(getSize());  
    setVisible(true);  
    setDefaultCloseOperation(EXIT_ON_CLOSE);  
      
 }  

public static void main(String[] args) 
{ 
JFrame.setDefaultLookAndFeelDecorated(true);  
GridBagCustom a = new GridBagCustom();  
}  
      
} // end of class  