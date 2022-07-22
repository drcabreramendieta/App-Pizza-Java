/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import view.SecondWindow;
import models.OrdersModel;
import models.Order;

/**
 *
 * @author UPS
 */
public class ListenerReady implements ActionListener{
    SecondWindow sw;
    OrdersModel om;

    public ListenerReady(SecondWindow sw, OrdersModel om) {
        this.sw = sw;
        this.om = om;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Order order = sw.getSelectedOrder();
        om.changeElement(order, 2);
    }
    
}
