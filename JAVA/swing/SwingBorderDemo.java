import java.awt.*;
import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class SwingBorderDemo {
   public static void main(String[] args) {
      JFrame frame = new JFrame("Swing Tester");
      frame.setLayout(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Border blackline = BorderFactory.createLineBorder(Color.black);
      JLabel lbl=new JLabel("LABEL");
      lbl.setBorder(blackline);
      lbl.setBounds(40,40,80,25);
      frame.add(lbl);
      Icon icon = new ImageIcon("MicrosoftTeams-image.png");
      JButton btn = new JButton(icon);
      btn.setBounds(40,70,160,40);
      frame.add(btn);   
      
      


      frame.setSize(350, 350);      
      frame.setLocationRelativeTo(null);  
      frame.setVisible(true);
   } 
  
}