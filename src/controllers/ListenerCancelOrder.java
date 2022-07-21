/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import view.MainWindow;
import models.OrdersModel;
import models.Order;

/**
 *
 * @author UPS
 */
public class ListenerCancelOrder implements ActionListener{
    MainWindow mw;
    OrdersModel om;

    public ListenerCancelOrder(MainWindow mw, OrdersModel om) {
        this.mw = mw;
        this.om = om;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Order selectedOrder = mw.getSelectedCreatedOrder();
        om.removeOrder(selectedOrder);
    }
    
}
