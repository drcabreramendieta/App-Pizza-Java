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
import models.Client;
import models.PreOrderModel;
import models.Pizza;
import models.Extra;
import java.lang.NullPointerException;

/**
 *
 * @author UPS
 */
public class ListenerOrder implements ActionListener{
    MainWindow mw;
    OrdersModel om;
    PreOrderModel pom;

    public ListenerOrder(MainWindow mw, OrdersModel om, PreOrderModel pom) {
        this.mw = mw;
        this.om = om;
        this.pom = pom;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        try{
            if (pom.getSize() == 0){
                mw.showDialog("No hay elementos en la preorden");
                return;
            }
            String clientName = mw.getClient();
            Client client = new Client(clientName);
            Order order = new Order(client, 0);
            for (int i=0; i < pom.getSize(); i++){
                Object obj = pom.getElementAt(i);
                if(obj.getClass().toString().equals("class models.Pizza")){
                    order.addPizza((Pizza)obj);
                }
                else{
                    order.addExtra((Extra)obj);
                }
            }
            om.addOrder(order);
        }
        catch(NullPointerException ex){
            mw.showDialog(ex.getMessage());
        }
    }
    
}
