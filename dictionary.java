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

      // Add(s) "Add" Button
      JButton add = new JButton("Add");
      add.setBounds(5, 5, 100, 35);
      frame.add(add);

      // Add(s) "Remove" Button
      JButton remove = new JButton("Remove");
      remove.setBounds(110, 5, 100, 35);
      frame.add(remove);

      
    }
  }
