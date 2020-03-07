import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

  public class dictionary {

    public static void createAndShowGUI(){
      // Create(s) the window
      JFrame frame = new JFrame("Dictionary");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Display(s) the window
      frame.setPreferredSize(new Dimension(900, 750));
      frame.pack();
      frame.setLocationRelativeTo(null);

    }
  }
