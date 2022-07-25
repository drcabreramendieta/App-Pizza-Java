/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.awt.Component;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import models.Order;
import javax.swing.JLabel;

/**
 *
 * @author UPS
 */
public class RendererOrder extends JLabel implements ListCellRenderer<Order>{
    private int listID;
    public RendererOrder(int listID) {
        this.listID = listID;
    }
    
    private String rendererInitOrderMW(Order order){
        String clientName = order.getClient().getName();
        double cost = order.getCost();
        return clientName+": $"+cost;
    }
    
    private String rendererInitOrderSW(Order order){
        return order.toString();
    }
    
    private String rendererPrepOrderMW(Order order){
        return order.getClient().getName();
    }
    
    @Override
    public Component getListCellRendererComponent(JList<? extends Order> jlist,
            Order e, int i, 
            boolean bln, boolean bln1) {        
        switch(listID){
            case 0: setText(rendererInitOrderMW(e)); break;
            case 1: setText(rendererInitOrderSW(e)); break;
            case 2: setText(rendererPrepOrderMW(e)); break;
        }
        return this;
    }


    
}
