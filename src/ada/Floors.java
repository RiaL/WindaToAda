package ada;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author Krzysztof Kutt & Michal Nowak
 */
public class Floors extends javax.swing.JPanel {

    String SPACE = "   ";
    String FLOOR = "||   ";
    
    int floorsCount;
    PassengerList passengersOnFloors[];
    boolean buttons[];
    ElevatorEngine elevators[];
    List<JLabel> floorList = new LinkedList<JLabel>();
    List<JRadioButton> buttonList = new LinkedList<JRadioButton>();
    /**
     * Creates new form Floors
     */
    public Floors(int floorsCount, int elevatorsCount) {
        this.floorsCount = floorsCount;
        this.passengersOnFloors = new PassengerList[floorsCount];
        for(int i = 0; i < floorsCount; i++)
            this.passengersOnFloors[i] = new PassengerList();
        this.buttons = new boolean[floorsCount];
        this.elevators = new ElevatorEngine[elevatorsCount];
        
        initComponents();
        floorList.add(floor0Label);
        floorList.add(floor1Label);
        floorList.add(floor2Label);
        floorList.add(floor3Label);
        floorList.add(floor4Label);
        floorList.add(floor5Label);
        if (Simulation.ILOSC_PIETER > 6)
            floorList.add(floor6Label);
        else
            floor6Label.setVisible(false);
        if (Simulation.ILOSC_PIETER > 7)
            floorList.add(floor7Label);
        else
            floor7Label.setVisible(false);
        if (Simulation.ILOSC_PIETER > 8)
            floorList.add(floor8Label);
        else
            floor8Label.setVisible(false);
        if (Simulation.ILOSC_PIETER > 9)
            floorList.add(floor9Label);
        else
            floor9Label.setVisible(false);
        if (Simulation.ILOSC_PIETER > 10)
            floorList.add(floor10Label);
        else
            floor10Label.setVisible(false);
        
        buttonList.add(floor0RadioButton);
        buttonList.add(floor1RadioButton);
        buttonList.add(floor2RadioButton);
        buttonList.add(floor3RadioButton);
        buttonList.add(floor4RadioButton);
        buttonList.add(floor5RadioButton);
        if (Simulation.ILOSC_PIETER > 6)
            buttonList.add(floor6RadioButton);
        else
            floor6RadioButton.setVisible(false);
        if (Simulation.ILOSC_PIETER > 7)
            buttonList.add(floor7RadioButton);
        else
            floor7RadioButton.setVisible(false);
        if (Simulation.ILOSC_PIETER > 8)
            buttonList.add(floor8RadioButton);
        else
            floor8RadioButton.setVisible(false);
        if (Simulation.ILOSC_PIETER > 9)
            buttonList.add(floor9RadioButton);
        else
            floor9RadioButton.setVisible(false);
        if (Simulation.ILOSC_PIETER > 10)
            buttonList.add(floor10RadioButton);
        else
            floor10RadioButton.setVisible(false);
        setGUI();
        
        startPassengerGenerator();
    }
    
    public ElevatorEngine[] getElevators() {
        return elevators;
    }
    
    private void startPassengerGenerator(){
        Runnable passengerGenerator = new PassengerGenerator(floorsCount,this);
        Thread thread = new Thread(passengerGenerator);
	thread.start();
    }
    
    public void addElevator(int number, ElevatorEngine elevator){
        this.elevators[number] = elevator;
        System.out.println("[INFO] Zaladowano winde " + number);
    }

    public int getFloorsCount() {
        return floorsCount;
    }
    
    private void handleFloorButton(int floor) {
        this.buttons[floor] = true;
        
        //wybierz winde i ja zawolaj
        int elevatorNum = Help.Help_Package.whichElevator(elevators, floor);
        elevators[elevatorNum].addRequestFloor(floor);
        
        System.out.println("[INFO] Korytarz: zawolano winde " + elevatorNum + " na pietro " + floor);
    }
    
    public void switchDownFloorButton(int floor){
        this.buttons[floor] = false;
    }
    
    public void addNewPassengerOnFloor(int floor, Passenger passenger){
        synchronized(passengersOnFloors[floor]){
            passengersOnFloors[floor].add(passenger);
        }
        handleFloorButton(floor);
        setGUI();
    }
    
    public Passenger[] getPassengersFromFloor(int floor, int max){
        Passenger[] passengers = null;
        synchronized(passengersOnFloors[floor]){
            int size = passengersOnFloors[floor].size();
            if( size == 0 ){
                return null;
            }
            if( size > max ){
                size = max;  //nie mozemy wziac wiecej niz max
            }
            
            passengers = new Passenger[size];
            for(int i = 0; i < size; i++){
                passengers[i] = passengersOnFloors[floor].pop();
            }
        }
        
        setGUI();
        
        return passengers;
    }

    public void setGUI(){
        int i=0;
        for(JRadioButton button: buttonList){
            button.setSelected(buttons[i++]);
        }
        int j=0;
        for(JLabel floor: floorList){
            floor.setText(((j<10)?SPACE+j:(" "+j)) + FLOOR + ((passengersOnFloors[j].size()!=0)?passengersOnFloors[j].size():SPACE));
            j++;
       } 
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        floor0Label = new javax.swing.JLabel();
        floor3RadioButton = new javax.swing.JRadioButton();
        floor6RadioButton = new javax.swing.JRadioButton();
        floor1Label = new javax.swing.JLabel();
        floor4RadioButton = new javax.swing.JRadioButton();
        floor8Label = new javax.swing.JLabel();
        floor10RadioButton = new javax.swing.JRadioButton();
        floor1RadioButton = new javax.swing.JRadioButton();
        floor8RadioButton = new javax.swing.JRadioButton();
        floor9RadioButton = new javax.swing.JRadioButton();
        floor5RadioButton = new javax.swing.JRadioButton();
        floor7RadioButton = new javax.swing.JRadioButton();
        floor10Label = new javax.swing.JLabel();
        floor0RadioButton = new javax.swing.JRadioButton();
        floor5Label = new javax.swing.JLabel();
        floor2RadioButton = new javax.swing.JRadioButton();
        floor6Label = new javax.swing.JLabel();
        floor9Label = new javax.swing.JLabel();
        floor4Label = new javax.swing.JLabel();
        floor3Label = new javax.swing.JLabel();
        simulationLabel = new javax.swing.JLabel();
        floor2Label = new javax.swing.JLabel();
        floor7Label = new javax.swing.JLabel();

        floor0Label.setText("   P||   #");

        floor3RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floor3RadioButtonActionPerformed(evt);
            }
        });

        floor6RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floor6RadioButtonActionPerformed(evt);
            }
        });

        floor1Label.setText("   1||   #");

        floor4RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floor4RadioButtonActionPerformed(evt);
            }
        });

        floor8Label.setText("   8||   #");

        floor10RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floor10RadioButtonActionPerformed(evt);
            }
        });

        floor1RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floor1RadioButtonActionPerformed(evt);
            }
        });

        floor8RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floor8RadioButtonActionPerformed(evt);
            }
        });

        floor9RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floor9RadioButtonActionPerformed(evt);
            }
        });

        floor5RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floor5RadioButtonActionPerformed(evt);
            }
        });

        floor7RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floor7RadioButtonActionPerformed(evt);
            }
        });

        floor10Label.setText(" 10||   #");

        floor0RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floor0RadioButtonActionPerformed(evt);
            }
        });

        floor5Label.setText("   5||   #");

        floor2RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floor2RadioButtonActionPerformed(evt);
            }
        });

        floor6Label.setText("   6||   #");

        floor9Label.setText("   9||   #");

        floor4Label.setText("   4||   #");

        floor3Label.setText("   3||   #");

        simulationLabel.setText("Symulacja windy");

        floor2Label.setText("   2||   #");

        floor7Label.setText("   7||   #");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(simulationLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(floor10Label)
                            .addComponent(floor9Label)
                            .addComponent(floor8Label)
                            .addComponent(floor7Label)
                            .addComponent(floor6Label)
                            .addComponent(floor5Label)
                            .addComponent(floor4Label)
                            .addComponent(floor3Label)
                            .addComponent(floor2Label)
                            .addComponent(floor1Label)
                            .addComponent(floor0Label))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(floor10RadioButton)
                            .addComponent(floor0RadioButton)
                            .addComponent(floor9RadioButton)
                            .addComponent(floor8RadioButton)
                            .addComponent(floor7RadioButton)
                            .addComponent(floor6RadioButton)
                            .addComponent(floor5RadioButton)
                            .addComponent(floor4RadioButton)
                            .addComponent(floor3RadioButton)
                            .addComponent(floor2RadioButton)
                            .addComponent(floor1RadioButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(simulationLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(floor10RadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(floor10Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(floor9Label)
                    .addComponent(floor9RadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(floor8Label)
                    .addComponent(floor8RadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(floor7Label)
                    .addComponent(floor7RadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(floor6Label)
                    .addComponent(floor6RadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(floor5Label)
                    .addComponent(floor5RadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(floor4Label)
                    .addComponent(floor4RadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(floor3Label)
                    .addComponent(floor3RadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(floor2Label)
                    .addComponent(floor2RadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(floor1Label)
                    .addComponent(floor1RadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(floor0RadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(floor0Label))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void floor3RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floor3RadioButtonActionPerformed
        handleFloorButton(3);
    }//GEN-LAST:event_floor3RadioButtonActionPerformed

    private void floor6RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floor6RadioButtonActionPerformed
        handleFloorButton(6);
    }//GEN-LAST:event_floor6RadioButtonActionPerformed

    private void floor4RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floor4RadioButtonActionPerformed
        handleFloorButton(4);
    }//GEN-LAST:event_floor4RadioButtonActionPerformed

    private void floor10RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floor10RadioButtonActionPerformed
        handleFloorButton(10);
    }//GEN-LAST:event_floor10RadioButtonActionPerformed

    private void floor1RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floor1RadioButtonActionPerformed
        handleFloorButton(1);
    }//GEN-LAST:event_floor1RadioButtonActionPerformed

    private void floor8RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floor8RadioButtonActionPerformed
        handleFloorButton(8);
    }//GEN-LAST:event_floor8RadioButtonActionPerformed

    private void floor9RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floor9RadioButtonActionPerformed
        handleFloorButton(9);
    }//GEN-LAST:event_floor9RadioButtonActionPerformed

    private void floor5RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floor5RadioButtonActionPerformed
        handleFloorButton(5);
    }//GEN-LAST:event_floor5RadioButtonActionPerformed

    private void floor7RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floor7RadioButtonActionPerformed
        handleFloorButton(7);
    }//GEN-LAST:event_floor7RadioButtonActionPerformed

    private void floor0RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floor0RadioButtonActionPerformed
        handleFloorButton(0);
    }//GEN-LAST:event_floor0RadioButtonActionPerformed

    private void floor2RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floor2RadioButtonActionPerformed
        handleFloorButton(2);
    }//GEN-LAST:event_floor2RadioButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel floor0Label;
    private javax.swing.JRadioButton floor0RadioButton;
    private javax.swing.JLabel floor10Label;
    private javax.swing.JRadioButton floor10RadioButton;
    private javax.swing.JLabel floor1Label;
    private javax.swing.JRadioButton floor1RadioButton;
    private javax.swing.JLabel floor2Label;
    private javax.swing.JRadioButton floor2RadioButton;
    private javax.swing.JLabel floor3Label;
    private javax.swing.JRadioButton floor3RadioButton;
    private javax.swing.JLabel floor4Label;
    private javax.swing.JRadioButton floor4RadioButton;
    private javax.swing.JLabel floor5Label;
    private javax.swing.JRadioButton floor5RadioButton;
    private javax.swing.JLabel floor6Label;
    private javax.swing.JRadioButton floor6RadioButton;
    private javax.swing.JLabel floor7Label;
    private javax.swing.JRadioButton floor7RadioButton;
    private javax.swing.JLabel floor8Label;
    private javax.swing.JRadioButton floor8RadioButton;
    private javax.swing.JLabel floor9Label;
    private javax.swing.JRadioButton floor9RadioButton;
    private javax.swing.JLabel simulationLabel;
    // End of variables declaration//GEN-END:variables
}
