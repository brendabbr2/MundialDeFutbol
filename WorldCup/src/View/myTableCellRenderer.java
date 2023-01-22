/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author jox
 */
public class myTableCellRenderer implements TableCellRenderer{
    private int rowHeight;

    public myTableCellRenderer(int rowHeight) {
        this.rowHeight = rowHeight;
    }
    
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        table.setRowHeight(rowHeight);
        return  (Component) value;
    }
}
