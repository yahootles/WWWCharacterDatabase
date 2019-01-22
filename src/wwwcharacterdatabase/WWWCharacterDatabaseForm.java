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
import java.io.*;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane.*;
import javax.swing.JOptionPane;
import static javax.swing.ListSelectionModel.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.*;
import javax.swing.table.*;

public class WWWCharacterDatabaseForm extends javax.swing.JFrame {

    /**
     * Creates new form WWWCharacterDatabaseForm
     */
    //table variables
    static Object[] columnNames = {"Name", "Health", "Aura", "Reflex", "DADA", "Potions", "Herb", "CI", "Int", "Strength", "Dark", "MU", "Charis", "Trans"};
    static CustomTableModel tModel = new CustomTableModel(columnNames, 0);
    int prevSelected = -1;

    //declaration for file chooser
    javax.swing.filechooser.FileFilter filter = new FileNameExtensionFilter("WWW file", "www");
    JFileChooser fc = new JFileChooser();
    File f;

    String tempNotes = "";

    public static ArrayList<Character> charList = new ArrayList<Character>();

    public WWWCharacterDatabaseForm() {
        initComponents();

        //change width of first column
        TableColumnModel tcm = charTable.getColumnModel();
        tcm.getColumn(0).setPreferredWidth(180);

        charTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                selectionChanged();
            }
        });

        loadDatabase();

        //set the filter
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
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        importWarningLabel = new javax.swing.JLabel();
        sortComboBox = new javax.swing.JComboBox();
        sortButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        importItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closingHandler(evt);
            }
        });

        mainPanel.setBackground(new java.awt.Color(153, 153, 153));

        charTable.setBackground(new java.awt.Color(214, 217, 223));
        charTable.setModel(this.tModel);
        charTable.setGridColor(new java.awt.Color(255, 255, 255));
        charTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        charTable.setShowVerticalLines(false);
        tablePane.setViewportView(charTable);

        notesPane.setViewportView(notesTextArea);

        notesLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        notesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notesLabel.setText("Notes");

        importButton.setText("Import from file");
        importButton.setMaximumSize(new java.awt.Dimension(127, 25));
        importButton.setMinimumSize(new java.awt.Dimension(127, 25));
        importButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add character");
        addButton.setMaximumSize(new java.awt.Dimension(127, 25));
        addButton.setMinimumSize(new java.awt.Dimension(127, 25));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setText("Edit character");
        editButton.setMaximumSize(new java.awt.Dimension(127, 25));
        editButton.setMinimumSize(new java.awt.Dimension(127, 25));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete character");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        importWarningLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        importWarningLabel.setForeground(new java.awt.Color(255, 0, 0));

        sortComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Name", "Health", "Aura", "Reflex", "DADA", "Potions", "Herb", "CI", "Intelligence", "Strength", "Dark", "MU", "Charisma", "Transfiguration" }));
        sortComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortComboBoxActionPerformed(evt);
            }
        });

        sortButton.setText("Sort");
        sortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablePane, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(addButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(importButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(importWarningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(sortComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sortButton)))))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(notesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(notesPane, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(46, Short.MAX_VALUE))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(notesLabel)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(importButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(importWarningLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sortComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sortButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablePane, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notesPane, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
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
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void importItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importItemActionPerformed
        importButton.doClick(0);
    }//GEN-LAST:event_importItemActionPerformed

    private void closingHandler(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closingHandler
        saveDatabase();
        evt.toString();
    }//GEN-LAST:event_closingHandler

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        //(int state, String n, int heal, int a, int r, int d, int p, int h, int c, int i, int s, int dar, int m, int ch, int t)
        int row = charTable.getSelectedRow();
        System.out.println(String.valueOf(row));
        Character tempChar = charList.get(row);
        System.out.println(tempChar.toString() + row);
        //System.out.println("yay");
        String n = tempChar.name;
        int heal = tempChar.health;
        //System.out.println(n);
        int a = tempChar.aura;
        int r = tempChar.reflex;
        int d = tempChar.dada;
        int p = tempChar.potions;
        int h = tempChar.herb;
        int c = tempChar.ci;
        int i = tempChar.intel;
        int s = tempChar.stren;
        int dar = tempChar.dark;
        int m = tempChar.mu;
        int ch = tempChar.charis;
        int t = tempChar.trans;
        new addCharacterForm(1, row, n, heal, a, r, d, p, h, c, i, s, dar, m, ch, t).setVisible(true);
        //System.out.println("yay2");
    }//GEN-LAST:event_editButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        new addCharacterForm(0, 0, "", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0).setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void importButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importButtonActionPerformed
        //make a file chooser
        int num = fc.showOpenDialog(mainPanel);

        //check if the user has clicked the open button
        if (num == fc.APPROVE_OPTION) {
            //gget the file that has been selected
            f = fc.getSelectedFile();

            try {
                //create some readers to read the file
                FileReader fileRead = new FileReader(f);
                BufferedReader in = new BufferedReader(fileRead);

                //Character(String n, int heal, int a, int r, int d, int p, int h, int c, int i, int s, int dar, int m, int ch, int t)
                //getr Character's name, house, and stats from the file
                String name = in.readLine().split(" ")[2];
                int health = Integer.parseInt(in.readLine().split(" ")[1]);
                int aura = Integer.parseInt(in.readLine().split(" ")[1]);
                String house = in.readLine().split(" ")[1];
                int reflex = Integer.parseInt(in.readLine().split(" ")[1]);
                int dada = Integer.parseInt(in.readLine().split(" ")[1]);
                int potions = Integer.parseInt(in.readLine().split(" ")[1]);
                int herbology = Integer.parseInt(in.readLine().split(" ")[1]);
                int ci = Integer.parseInt(in.readLine().split(" ")[1]);
                int intel = Integer.parseInt(in.readLine().split(" ")[1]);
                int stren = Integer.parseInt(in.readLine().split(" ")[1]);
                int dark = Integer.parseInt(in.readLine().split(" ")[1]);
                int mu = Integer.parseInt(in.readLine().split(" ")[2]);
                int charis = Integer.parseInt(in.readLine().split(" ")[1]);
                int trans = Integer.parseInt(in.readLine().split(" ")[1]);

                //create a new Character and setthe notes to the house
                Character tempChar = new Character(name, health, aura, reflex, dada, potions, herbology, ci, intel, stren, dark, mu, charis, trans);
                tempChar.notes = house;

                //add the Character to the arraylist and the table
                addToCharList(tempChar, -1);

                //clear warning label
                importWarningLabel.setText("");

                //close the readers
                in.close();
                fileRead.close();
            } catch (FileNotFoundException fnfe) {
                //warn about no file found
                importWarningLabel.setText("File not found.");
            } catch (IOException ioe) {
                //warn about other problems with io
                importWarningLabel.setText("Problem with file encountered.");
            }
        }
    }//GEN-LAST:event_importButtonActionPerformed

    /**
     * Method that removes a Character
     *
     * @param evt - event from when the button gets clicked
     */
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try {
            //make sure the selected row is valid
            if (charTable.getSelectedRow() > -1) {
                //verify that the user does wish to delete the Character
                JOptionPane optionPane = new JOptionPane("Are you sure you would like to delete this character?", JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION);

                //get their choice
                int choice = optionPane.showConfirmDialog(deleteButton, "Are you sure you would like to delete this character?");

                //only delete if the user says yes
                if (choice == JOptionPane.YES_OPTION) {
                    //just to make sure stuff doesn't go wrong
                    prevSelected = -1;

                    //get selected row
                    int row = charTable.getSelectedRow();

                    //remove from the arraylist
                    charList.remove(row);

                    //remove from table. This throws a bunch of IndexOutOfBounds exceptions, but it's fine
                    tModel.removeRow(row);

                }
            }
        } catch (IndexOutOfBoundsException ioobe) {
            //clear notes, deselect anything from the table and refresh the table
            notesTextArea.setText("");
            charTable.clearSelection();
            charTable.revalidate();
            System.out.println("" + charList.size());
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void sortComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sortComboBoxActionPerformed

    private void sortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortButtonActionPerformed
        int stat = sortComboBox.getSelectedIndex();

        if (stat == 0) {

        } else {
            sortByStat(stat);
        }
    }//GEN-LAST:event_sortButtonActionPerformed

    /**
     * Method that gets called every time a new row is selected. It saves the
     * notes and displays the notes of the newly selected character
     */
    private void selectionChanged() {
        int curSelected = charTable.getSelectedRow();

        if (prevSelected >= 0 && curSelected >= 0) {
            charList.get(prevSelected).notes = notesTextArea.getText();
            notesTextArea.setText(charList.get(curSelected).notes);
            prevSelected = curSelected;
        } else if(curSelected >= 0){
            notesTextArea.setText(charList.get(curSelected).notes);
            prevSelected = curSelected;
        }
    }

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
     * Method that adds a Character to an ArrayList and class the method to add
     * it to the table
     *
     * @param charac - Character being added to he ArrayList
     */
    /**
     * Method that adds Characters to the list or replaces an already added
     * Character's values
     *
     * @param charac - The Character being added
     * @param index - The index at which to replace the values of that character
     */
    public static void addToCharList(Character charac, int index) {

        if (index < 0) {
            charList.add(charac);
            addToTable(charac, index);
        } else {
            charList.get(index).setAura(charac.aura);
            charList.get(index).setCI(charac.ci);
            charList.get(index).setCharis(charac.charis);
            charList.get(index).setDADA(charac.dada);
            charList.get(index).setDark(charac.dark);
            charList.get(index).setHealth(charac.health);
            charList.get(index).setHerb(charac.herb);
            charList.get(index).setIntel(charac.intel);
            charList.get(index).setMU(charac.mu);
            charList.get(index).setName(charac.name);
            charList.get(index).setPotions(charac.potions);
            charList.get(index).setReflex(charac.reflex);
            charList.get(index).setStren(charac.stren);
            charList.get(index).setTrans(charac.trans);

            addToTable(charac, index);
        }
    }

    /**
     * Method that adds new Characters or updates current Characters in the
     * table
     *
     * @param charac - Character being added to the table
     * @param index - index of the Character being updated(if it is being
     * updated)
     */
    public static void addToTable(Character charac, int index) {
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

        if (index < 0) {
            tModel.addRow(data);
        } else {
            for (int i = 0; i < data.length; i++) {
                tModel.setValueAt(data[i], index, i);
            }
        }
    }

    public static void sortByName() {

    }

    public void sortByStat(int stat) {
        boolean sorted = false;
        Character temp;
        int length = charList.size();

        //charList.get(charTable.getSelectedRow()).notes = notesTextArea.getText();
        prevSelected = -1;
        charTable.clearSelection();

        try {
            for (int i = 0; i < charTable.getRowCount(); i++) {
                tModel.removeRow(i);
                
                charTable.revalidate();
                System.out.println("tset1");
            }
        } catch (IndexOutOfBoundsException ioobe) {
            System.out.println("yikers");
            charTable.revalidate();
        }
        charTable.revalidate();

        //loop that runs unil sorted
        while (sorted == false) {
            sorted = true;
            for (int i = 0; i < length - 1; i++) {
                //test to see if the smaller index contains a larger number
                if (charList.get(i).getNumericalStat(stat) > charList.get(i + 1).getNumericalStat(stat)) {
                    //switch places
                    temp = charList.get(i);
                    charList.set(i, charList.get(i + 1));
                    charList.set(i + 1, temp);                    
                    sorted = false;
                }
            }
        }

        for (int i = 0; i < charList.size(); i++) {
            addToTable(charList.get(i), -1);
        }

        //charTable.revalidate();
    }

    /**
     * Method that saves the database into a .dat file by serializing an array
     */
    public void saveDatabase() {
        if (charTable.getSelectedRow() >= 0 && !(charList.isEmpty())) {
            charList.get(charTable.getSelectedRow()).notes = notesTextArea.getText();
        }

        if (charList.size() >= 0) {
            try {
                //set up outpu streams
                FileOutputStream fileOut = new FileOutputStream("data.dat", false);
                ObjectOutputStream obOut = new ObjectOutputStream(fileOut);

                //get number of Characters
                int length = charList.size();

                //create a new array of that length
                Character[] tempArray = new Character[length];

                //get the Characters from the arraylist and pout them into the array
                for (int i = 0; i < length; i++) {
                    tempArray[i] = charList.get(i);
                }

                //write the array to the file
                obOut.writeObject(tempArray);

                //flush and close outputs
                obOut.flush();
                obOut.close();
                fileOut.flush();
                fileOut.close();
            } catch (FileNotFoundException fnfe) {
                System.out.println("An error has occured.");
                System.err.println("Exception:" + fnfe);
            } catch (IOException ioe) {
                System.out.println("An error has occured.");
                System.err.println("Exception:" + ioe);
            }
        }

        //exit the program because method only gets called when the X is clicked
        System.exit(0);
    }

    /**
     * Method used to load the database from a .dat file
     */
    public static void loadDatabase() {
        try {
            //set up input streams
            FileInputStream fileIn = new FileInputStream("data.dat");
            ObjectInputStream obIn = new ObjectInputStream(fileIn);

            //read in an array of Characters
            Character[] tempArray = (Character[]) obIn.readObject();

            //add each Character in the array to the arraylist
            for (int i = 0; i < tempArray.length; i++) {
                addToCharList(tempArray[i], -1);
            }

            //close inputs
            obIn.close();
            fileIn.close();
        } catch (IOException ioe) {
            System.out.println("An error has occured.");
            System.err.println("Exception:" + ioe);
        } catch (ClassNotFoundException cnfe) {
            System.out.println("An error has occured.");
            System.err.println("Exception:" + cnfe);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTable charTable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton importButton;
    private javax.swing.JMenuItem importItem;
    private javax.swing.JLabel importWarningLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel notesLabel;
    private javax.swing.JScrollPane notesPane;
    private javax.swing.JTextPane notesTextArea;
    private javax.swing.JButton sortButton;
    private javax.swing.JComboBox sortComboBox;
    private javax.swing.JScrollPane tablePane;
    // End of variables declaration//GEN-END:variables
}
