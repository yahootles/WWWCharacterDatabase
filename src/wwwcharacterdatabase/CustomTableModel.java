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

import javax.swing.table.*;

public class CustomTableModel extends DefaultTableModel {
    
    public boolean isCellEditable(int row, int col){
        return false;
    }
    
    
}
