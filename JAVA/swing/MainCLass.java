import javax.swing.JFrame;
public class MainCLass {
  public static void main(final String args[]) {
    JFrame.setDefaultLookAndFeelDecorated(true); 
// Must be the first statement
    JFrame frame = new JFrame("Adornment Example");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 100);
    frame.setVisible(true);
  }
}