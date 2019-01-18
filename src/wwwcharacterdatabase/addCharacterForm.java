/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wwwcharacterdatabase;

/**
 *
 * @author tiein
 */
public class addCharacterForm extends javax.swing.JFrame {

    /**
     * Creates new form addCharacterForm
     */
    
    int index;
    
    public addCharacterForm() {
        initComponents();
    }
    
    public addCharacterForm(int state, int in, String n, int heal, int a, int r, int d, int p, int h, int c, int i, int s, int dar, int m, int ch, int t){
        initComponents();
        
        //check if it is to edit or add
        if(state == 1){
            //set the fields to existing values
            nameField.setText(n);
            auraField.setText("" + a);
            healthField.setText("" + heal);
            reflexField.setText("" + r);
            dadaField.setText("" + d);
            potionsField.setText("" + p);
            herbField.setText("" + h);
            ciField.setText("" + c);
            intField.setText("" + i);
            strengthField.setText("" + s);
            darkField.setText("" + dar);
            muField.setText("" + m);
            charismaField.setText("" + ch);
            transField.setText("" + t);  
            index = in;
        }else{
            editButton.setVisible(false);
            cancelButton2.setVisible(false);
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

        nameField = new javax.swing.JTextField();
        healthField = new javax.swing.JTextField();
        auraField = new javax.swing.JTextField();
        reflexField = new javax.swing.JTextField();
        dadaField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        healthLabel = new javax.swing.JLabel();
        auraLabel = new javax.swing.JLabel();
        reflexLabel = new javax.swing.JLabel();
        dadaLabel = new javax.swing.JLabel();
        potionsLabel = new javax.swing.JLabel();
        herbLabel = new javax.swing.JLabel();
        potionsField = new javax.swing.JTextField();
        herbField = new javax.swing.JTextField();
        ciField = new javax.swing.JTextField();
        intField = new javax.swing.JTextField();
        strengthField = new javax.swing.JTextField();
        darkField = new javax.swing.JTextField();
        muField = new javax.swing.JTextField();
        ciLabel = new javax.swing.JLabel();
        intLabel = new javax.swing.JLabel();
        strengthLabel = new javax.swing.JLabel();
        darkLabel = new javax.swing.JLabel();
        muLabel = new javax.swing.JLabel();
        charismaLabel = new javax.swing.JLabel();
        transLabel = new javax.swing.JLabel();
        charismaField = new javax.swing.JTextField();
        transField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        cancelButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        nameField.setMinimumSize(new java.awt.Dimension(59, 20));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        healthField.setMinimumSize(new java.awt.Dimension(59, 20));

        auraField.setMinimumSize(new java.awt.Dimension(59, 20));

        reflexField.setMinimumSize(new java.awt.Dimension(59, 20));

        dadaField.setMinimumSize(new java.awt.Dimension(59, 20));

        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("Name");

        healthLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        healthLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        healthLabel.setText("Health");

        auraLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        auraLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        auraLabel.setText("Aura");

        reflexLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        reflexLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reflexLabel.setText("Reflex");

        dadaLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        dadaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dadaLabel.setText("DADA");

        potionsLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        potionsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        potionsLabel.setText("Potions");

        herbLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        herbLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        herbLabel.setText("Herb");

        potionsField.setMinimumSize(new java.awt.Dimension(59, 20));

        herbField.setMinimumSize(new java.awt.Dimension(59, 20));

        ciField.setMinimumSize(new java.awt.Dimension(59, 20));
        ciField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciFieldActionPerformed(evt);
            }
        });

        intField.setMinimumSize(new java.awt.Dimension(59, 20));

        strengthField.setMinimumSize(new java.awt.Dimension(59, 20));

        darkField.setMinimumSize(new java.awt.Dimension(59, 20));

        muField.setMinimumSize(new java.awt.Dimension(59, 20));

        ciLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ciLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ciLabel.setText("CI");

        intLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        intLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        intLabel.setText("Int");

        strengthLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        strengthLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        strengthLabel.setText("Stren");

        darkLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        darkLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        darkLabel.setText("Dark");

        muLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        muLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        muLabel.setText("MU");

        charismaLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        charismaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        charismaLabel.setText("Charis");

        transLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        transLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        transLabel.setText("Trans");

        charismaField.setMinimumSize(new java.awt.Dimension(59, 20));

        transField.setMinimumSize(new java.awt.Dimension(59, 20));

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        errorLabel.setForeground(new java.awt.Color(255, 0, 0));

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        cancelButton2.setText("Cancel");
        cancelButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(addButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancelButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(editButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancelButton2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(nameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                    .addComponent(nameField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(healthField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(healthLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(auraField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(auraLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(reflexField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(reflexLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dadaField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dadaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(potionsField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(potionsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(herbField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(herbLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ciLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ciField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(intField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(intLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(strengthField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(strengthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(darkField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(darkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(muField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(muLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(charismaField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(charismaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(transField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(transLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 76, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel)
                            .addComponent(healthLabel)
                            .addComponent(auraLabel)
                            .addComponent(reflexLabel)
                            .addComponent(dadaLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(healthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(auraField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reflexField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dadaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(potionsLabel)
                            .addComponent(herbLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(potionsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(herbField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ciLabel)
                            .addComponent(intLabel)
                            .addComponent(strengthLabel)
                            .addComponent(darkLabel)
                            .addComponent(muLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ciField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(intField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(strengthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(darkField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(muField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(charismaLabel)
                            .addComponent(transLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(charismaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(transField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton)
                            .addComponent(errorLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelButton2)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void ciFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciFieldActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        try{
            //get all the values frm the text fields
            String charName = nameField.getText();
            int aura = Integer.parseInt(auraField.getText());
            int charisma = Integer.parseInt(charismaField.getText());
            int ci = Integer.parseInt(ciField.getText());
            int dada = Integer.parseInt(dadaField.getText());
            int dark = Integer.parseInt(darkField.getText());
            int health = Integer.parseInt(healthField.getText());
            int herb = Integer.parseInt(herbField.getText());
            int intel = Integer.parseInt(intField.getText());
            int mu = Integer.parseInt(muField.getText());
            int potions = Integer.parseInt(potionsField.getText());
            int reflex = Integer.parseInt(reflexField.getText());
            int strength = Integer.parseInt(strengthField.getText());
            int trans = Integer.parseInt(transField.getText());
            
            //make a new Character wih those values and add it to the arraylist 
            WWWCharacterDatabaseForm.addToCharList(new Character(charName, health, aura, reflex, dada, potions, herb, ci, intel, strength, dark, mu, charisma, trans));

            //disposes of this window
            this.dispose();
        }catch(NumberFormatException nfe){
            System.err.println("Exception:" + nfe);
            errorLabel.setText("Invalid input. Something is not a number.");
        }
        
        
        
        //WWWCharacterDatabaseForm.charList.add(new Character());
    }//GEN-LAST:event_addButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editButtonActionPerformed

    private void cancelButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addCharacterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addCharacterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addCharacterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addCharacterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addCharacterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField auraField;
    private javax.swing.JLabel auraLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton cancelButton2;
    private javax.swing.JTextField charismaField;
    private javax.swing.JLabel charismaLabel;
    private javax.swing.JTextField ciField;
    private javax.swing.JLabel ciLabel;
    private javax.swing.JTextField dadaField;
    private javax.swing.JLabel dadaLabel;
    private javax.swing.JTextField darkField;
    private javax.swing.JLabel darkLabel;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JTextField healthField;
    private javax.swing.JLabel healthLabel;
    private javax.swing.JTextField herbField;
    private javax.swing.JLabel herbLabel;
    private javax.swing.JTextField intField;
    private javax.swing.JLabel intLabel;
    private javax.swing.JTextField muField;
    private javax.swing.JLabel muLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField potionsField;
    private javax.swing.JLabel potionsLabel;
    private javax.swing.JTextField reflexField;
    private javax.swing.JLabel reflexLabel;
    private javax.swing.JTextField strengthField;
    private javax.swing.JLabel strengthLabel;
    private javax.swing.JTextField transField;
    private javax.swing.JLabel transLabel;
    // End of variables declaration//GEN-END:variables
}
