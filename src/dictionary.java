import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JSeparator;

  public class dictionary {

    public static void createAndShowGUI(){
      // Create(s) the window
      JFrame frame = new JFrame("Dictionary");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Display(s) the window
      frame.setPreferredSize(new Dimension(900, 750));
      frame.pack();
      frame.setLocationRelativeTo(null);


      // .setBounds = (int x, int y, int width, int height)

      // Add(s) "Add" Button
      JButton add = new JButton("Add");
      add.setBounds(5, 5, 100, 35);
      frame.add(add);

      // Add(s) "Remove" Button
      JButton remove = new JButton("Remove");
      remove.setBounds(110, 5, 100, 35);
      frame.add(remove);

      // Add(s) "SearchBar" TextField

      JTextField searchBar = new JTextField("Search");
      searchBar.setBounds(5, 45, 207, 35);
      frame.add(searchBar);

      // Add(s) "Ascending" CheckBox
      JCheckBox ascend = new JCheckBox("Asc");
      ascend.setBounds(22, 80, 50, 30 );
      frame.add(ascend);

      // Add(s) "Descending" JCheckBox
      JCheckBox descend = new JCheckBox("Desc");
      descend.setBounds(129, 80, 55, 30);
      frame.add(descend);

      // Add(s) JSeperator
      JSeperator seperate = new JSeperator();
      seperate.setBounds(5, 80, 55, 303);

      // JFrame Option(s)
      frame.setLayout(null);
      frame.setVisible(true);
      frame.setResizable(false);
    }

    public static void main(String[] args){

      javax.swing.SwingUtilities.invokeLater(new Runnable(){ // Schedule a job
        // for the event-dispatching thread: <-- Received from Oracle's website.
        public void run(){
          createAndShowGUI();
        }
      });
    }
  }
