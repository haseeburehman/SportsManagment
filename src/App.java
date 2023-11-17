import javax.swing.*;
import java.awt.event.*;
public class App {
    public static void main(String[] args) throws Exception {
      JFrame f= new JFrame();
      JButton b=new JButton();
      f.setSize(400,400);
      b.setBounds(50,50,10,10);
      f.add(b);
      f.setVisible(true);
      f.setLayout(null);
    }
}
