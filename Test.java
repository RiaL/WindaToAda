import Help.Help_Package;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test extends JPanel implements ActionListener {

    protected JTextField skladnik1;
    protected JTextField skladnik2;
    protected JTextField suma;
    protected JButton button;

    public Test() {
        super();

        skladnik1 = new JTextField(10);
        skladnik2 = new JTextField(10);
        button = new JButton("Dodaj");
        suma = new JTextField(10);
        
        button.addActionListener(this);

        add(skladnik1);
        add(skladnik2);
        add(button);
        add(suma);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        int liczba1 = Integer.parseInt(skladnik1.getText());
        int liczba2 = Integer.parseInt(skladnik2.getText());
        
        int wynik = Help_Package.Sum(liczba1, liczba2);
        
        suma.setText(new Integer(wynik).toString());
    }
    
    private int sumuj(int liczba1, int liczba2){
        return liczba1+liczba2;
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Ada<->Swing Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add contents to the window.
        frame.add(new Test());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

