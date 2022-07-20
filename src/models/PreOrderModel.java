/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author UPS
 */
public class PreOrderModel extends AbstractListModel{
    ArrayList preOrder;

    public PreOrderModel() {
        preOrder = new ArrayList();
    }
    
    @Override
    public int getSize() {
        return preOrder.size();
    }

    @Override
    public Object getElementAt(int i) {
        return preOrder.get(i);
    }
    
    public void addElement(Object item){
        int index = preOrder.size();
        preOrder.add(item);
        fireIntervalAdded(this,index,index);
    }
    
}
