/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import javax.swing.AbstractListModel;
import java.util.ArrayList;

/**
 *
 * @author UPS
 */
public class OrdersModel extends AbstractListModel<Order>{
    private ArrayList<Order> orders;

    public OrdersModel() {
        orders = new ArrayList<>();
    }
    
    @Override
    public int getSize() {
        return orders.size();
    }

    @Override
    public Order getElementAt(int i) {
        return orders.get(i);
    }
    
    public void addOrder(Order order){
        orders.add(order);
        int index = orders.size();
        fireIntervalAdded(this, index, index);
    }
    
    public void removeOrder(int index){
        orders.remove(index);
        fireIntervalRemoved(this, index, index);
    }
    
}
