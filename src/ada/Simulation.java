package ada;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

//TODO: do obsluzenia jeszcze czas trwania symulacji!
//TODO: trzeba tez wyswietlac na koniec raport z symulacji:
//      - parametry wejsciowe
//      - czas trwania
//      - statystyki z wind (statPassengers i statFloors)

/**
 *
 * @author Krzysztof Kutt & Michal Nowak
 */
public class Simulation extends javax.swing.JPanel {
    
    public static int ILOSC_PIETER = 10 + 1; // to +1 to po to zeby pamietac pozniej o uwzglednieniu parteru
    static int ILOSC_WIND = 2;
    static int MAX_W_WINDZIE = 5;
    static Date startTime;
    static Date stopTime;
    static List<ElevatorEngine> engines = new LinkedList<ElevatorEngine>();
 
    
    /**
     * Creates new form Simulation
     */
    public Simulation() {
        initComponents();
        startTime = new Date();
    }
    
    private static void createAndShowGUI() {
        //Create and set up the window.
        final JFrame frame = new JFrame("Symulacja windy w Adzie i Swingu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add contents to the window.
        Simulation simulation = new Simulation();
        simulation.setLayout(new GridLayout(1,ILOSC_WIND+1));
        
        Floors floors = new Floors(ILOSC_PIETER,ILOSC_WIND);
        simulation.add(floors);
        
        for(int i = 0; i < ILOSC_WIND; i++){
            Elevator elevator = new Elevator();
            simulation.add(elevator);
            int startFloor = 0;
            //co druga winda bedzie na gorze
            if( i%2 == 1 )
                startFloor = ILOSC_PIETER-1;
            Runnable elevatorEngine = new ElevatorEngine(i,MAX_W_WINDZIE,startFloor,floors,elevator);
            engines.add((ElevatorEngine)elevatorEngine);
            Thread thread = new Thread(elevatorEngine);
            thread.start();
        }
        
        frame.add(simulation);
        
        JMenuBar menuBar = new JMenuBar();
        JMenu stopMenu = new JMenu("Symulacja");
        JMenuItem stopItem = new JMenuItem("Zatrzymaj");

        stopMenu.add(stopItem);
        menuBar.add(stopMenu);
        JMenu simulationMenu = new JMenu("Statystki");
        final JMenuItem statsItem = new JMenuItem("Podstawowe dane");
        statsItem.setEnabled(false);
        final JMenuItem chartsItem = new JMenuItem("Wykresy");
        chartsItem.setEnabled(false);
        simulationMenu.add(statsItem);
        simulationMenu.add(chartsItem);
        menuBar.add(simulationMenu);
        //Display the window.
        frame.setJMenuBar(menuBar);
        stopItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                statsItem.setEnabled(true);
                chartsItem.setEnabled(true);
                stop();
            }
        });
        
        statsItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(frame, getShortStats());
            }
        });
        
        frame.pack();
        frame.setVisible(true);
    }
        
    public static void start(int capacity, int elevatorsCount, int floorsCount) {
        MAX_W_WINDZIE = capacity;
        ILOSC_PIETER = floorsCount;
        ILOSC_WIND = elevatorsCount;
        
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void stop(){
        stopTime = new Date();
        // zatrzymywanie symulacji
    }
    
    private static String getShortStats(){
        SimpleDateFormat sdt = new SimpleDateFormat("hh:mm:ss dd-MM-yyyy");
        String info = "";
        info += "Parametry początkowe symulacji:";
        info += "\nIlość pięter: " + (ILOSC_PIETER-1);
        info += "\nIlość wind: " + ILOSC_WIND;
        info += "\nPojemność każdej windy: " + MAX_W_WINDZIE;
        info += "\nPoczątek symulacji: " + sdt.format(startTime);
        for(ElevatorEngine e: engines){
            info += "\nWinda[" + e.getNumber() + "] przewiozła " + e.getStatPassengers() + " pasazerów, pokonując w tym czasie " + e.getStatFloors() + " pięter";
        }
        info += "\nKoniec symulacji: " + sdt.format(stopTime);
        info += "\nSymulacja trwała: " + (stopTime.getTime() - startTime.getTime())/(1000*60) + ":" + ((stopTime.getTime() - startTime.getTime())%(1000*60))/1000;
        return info;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setMinimumSize(new java.awt.Dimension(672, 434));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
