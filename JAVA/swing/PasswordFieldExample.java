import java.awt.*;
import java.awt.event.*;
import javax.swing.*;    
public class PasswordFieldExample 
{  
   public static void main(String[] args) {
   JFrame f=new JFrame("Password Field Example");    
   f.setLayout(null); 
   JPasswordField passtf = new JPasswordField(); 
   //passtf.setEchoChar('$');  
   JLabel l1=new JLabel("Password:");    
   l1.setBounds(20,100, 80,30);    
   passtf.setBounds(100,100,100,30);    
   f.add(passtf);  f.add(l1);  
   f.setSize(300,300);      
   f.setVisible(true);     
}  
}  