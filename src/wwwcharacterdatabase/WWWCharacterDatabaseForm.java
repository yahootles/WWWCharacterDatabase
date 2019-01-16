/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wwwcharacterdatabase;

/**
 *
 * @author antho6229
 */
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.*;
import javax.swing.table.*;

public class WWWCharacterDatabaseForm extends javax.swing.JFrame {

    /**
     * Creates new form WWWCharacterDatabaseForm
     */
    //table variables
    static Object[] columnNames = {"Name", "Health", "Aura", "Reflex", "DADA", "Potions", "Herb", "CI", "Int", "Strength", "Darkness", "MU", "Charisma", "Trans"};
    static DefaultTableModel tModel = new DefaultTableModel(columnNames, 0);

    //declaration for file chooser
    FileFilter filter = new FileNameExtensionFilter("WWW file", "www");
    JFileChooser fc = new JFileChooser();
    File f;
    


    public static ArrayList<Character> charList = new ArrayList<Character>();

    public WWWCharacterDatabaseForm() {
        initComponents();
        fc.setFileFilter(filter);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        tablePane = new javax.swing.JScrollPane();
        charTable = new javax.swing.JTable();
        notesPane = new javax.swing.JScrollPane();
        notesTextArea = new javax.swing.JTextPane();
        notesLabel = new javax.swing.JLabel();
        importButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        importItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(153, 153, 153));

        charTable.setBackground(new java.awt.Color(214, 217, 223));
        charTable.setModel(this.tModel);
        charTable.setGridColor(new java.awt.Color(255, 255, 255));
        tablePane.setViewportView(charTable);

        notesPane.setViewportView(notesTextArea);

        notesLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        notesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notesLabel.setText("Notes");

        importButton.setText("Import from file");
        importButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add character");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(tablePane, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(notesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(notesPane)))
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(addButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(importButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(importButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(notesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(notesPane)
                    .addComponent(tablePane, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE))
                .addGap(110, 110, 110))
        );

        fileMenu.setText("File");

        importItem.setText("Import");
        importItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importItemActionPerformed(evt);
            }
        });
        fileMenu.add(importItem);

        menuBar.add(fileMenu);

        editMenu.setText("Edit");
        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void importButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importButtonActionPerformed
        int num = fc.showOpenDialog(mainPanel);

        if (num == fc.APPROVE_OPTION) {
            f = fc.getSelectedFile();
        }
    }//GEN-LAST:event_importButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        new addCharacterForm().setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void importItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importItemActionPerformed
        importButton.doClick(0);
    }//GEN-LAST:event_importItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ArrayList charList2 = new ArrayList(0);
        
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
            java.util.logging.Logger.getLogger(WWWCharacterDatabaseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WWWCharacterDatabaseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WWWCharacterDatabaseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WWWCharacterDatabaseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WWWCharacterDatabaseForm().setVisible(true);
            }
        });
    }
    
    /**
     * Method that adds a Character to an ArrayList and class the method to add it to the table
     * @param charac - Character being added to he ArrayList 
     */
    public static void addToCharList(Character charac){
        charList.add(charac);
        addToTable(charac);
    }
    
    public static void addToTable(Character charac){
        //{"Name", "Health", "Aura", "Reflex", "DADA", "Potions", "Herb", "CI", 
        //"Int", "Strength", "Darkness", "MU", "Charisma", "Trans"
        String[] data = new String[14];
        data[0] = charac.name;
        data[1] = Integer.toString(charac.health);
        data[2] = Integer.toString(charac.aura); 
        data[3] = Integer.toString(charac.reflex);
        data[4] = Integer.toString(charac.dada);
        data[5] = Integer.toString(charac.potions);
        data[6] = Integer.toString(charac.herb);
        data[7] = Integer.toString(charac.ci);
        data[8] = Integer.toString(charac.intel);
        data[9] = Integer.toString(charac.stren);
        data[10] = Integer.toString(charac.dark);
        data[11] = Integer.toString(charac.mu);
        data[12] = Integer.toString(charac.charis);
        data[13] = Integer.toString(charac.trans);
        tModel.addRow(data);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTable charTable;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton importButton;
    private javax.swing.JMenuItem importItem;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel notesLabel;
    private javax.swing.JScrollPane notesPane;
    private javax.swing.JTextPane notesTextArea;
    private javax.swing.JScrollPane tablePane;
    // End of variables declaration//GEN-END:variables
}
