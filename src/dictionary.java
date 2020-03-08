import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

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
      add.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
          System.out.println("Add Placeholder");
        }
      });

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

      // CheckBoxes --> Group
      ButtonGroup group = new ButtonGroup();
      group.add(ascend);
      group.add(descend);

      // JTextArea --> Stores definitions, etc...
      JTextArea definition = new JTextArea();
      definition.setBounds(218, 5, 660, 700);
      definition.setEditable(false);
      frame.add(definition);

      // List --> Stores words
      JList words = new JList();
      words.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
      words.setLayoutOrientation(JList.HORIZONTAL_WRAP);
      words.setVisibleRowCount(-1);
      words.setBounds(600, 600, 200, 200);
      JScrollPane listScroller = new JScrollPane(words);
      listScroller.setPreferredSize(new Dimension(250, 80));
      frame.add(words);
      frame.add(listScroller);

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
