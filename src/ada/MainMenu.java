package ada;

/**
 *
 * @author Krzysztof Kutt & Michal Nowak
 */
public class MainMenu extends javax.swing.JPanel {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        simulationNameLabel = new javax.swing.JLabel();
        paramsLabel = new javax.swing.JLabel();
        capacityLabel = new javax.swing.JLabel();
        capacityComboBox = new javax.swing.JComboBox();
        floorsLabel = new javax.swing.JLabel();
        florrComboBox = new javax.swing.JComboBox();
        elevatorsLabel = new javax.swing.JLabel();
        elevatorsComboBox = new javax.swing.JComboBox();
        cancelButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();

        simulationNameLabel.setText("Symulacja windy");

        paramsLabel.setText("Ustaw parametry symluacji:");

        capacityLabel.setText("Pojemność windy:");

        capacityComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "4", "5", "6", "7", "8", "9" }));

        floorsLabel.setText("Ilość pięter:");

        florrComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5", "6", "7", "8", "9", "10" }));

        elevatorsLabel.setText("Ilość wind:");

        elevatorsComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));
        elevatorsComboBox.setSelectedIndex(1);

        cancelButton.setText("Anuluj");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        startButton.setText("Start!");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(simulationNameLabel)
                    .addComponent(paramsLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(floorsLabel)
                            .addComponent(capacityLabel)
                            .addComponent(elevatorsLabel)
                            .addComponent(cancelButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(capacityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(florrComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(elevatorsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(simulationNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paramsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capacityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(capacityLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(floorsLabel)
                    .addComponent(florrComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elevatorsLabel)
                    .addComponent(elevatorsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(startButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox capacityComboBox;
    private javax.swing.JLabel capacityLabel;
    private javax.swing.JComboBox elevatorsComboBox;
    private javax.swing.JLabel elevatorsLabel;
    private javax.swing.JLabel floorsLabel;
    private javax.swing.JComboBox florrComboBox;
    private javax.swing.JLabel paramsLabel;
    private javax.swing.JLabel simulationNameLabel;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
}
