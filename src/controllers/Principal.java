/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import models.*;
import view.*;

/**
 *
 * @author UPS
 */
public class Principal {
    public static void main(String[] args){
        Options options = new Options();
        Option typeOption = new Option(options.getAvailableSlides());
        Option sizeOption = new Option(options.getAvailableSize());
        Option edgeOption = new Option(options.getAvailableEdges());
        Option extraOption = new Option(options.getAvailableExtras());
        
        PreOrderModel pom = new PreOrderModel();
        OrdersModel om = new OrdersModel();
        
        MainWindow mw = new MainWindow();
        mw.setModelOptions(typeOption, 
                sizeOption, 
                edgeOption, 
                extraOption);
        mw.setModelPreOrder(pom);
        OrdersWithState createdOrders = new OrdersWithState(om, 0);
        OrdersWithState prepOrders = new OrdersWithState(om, 1);
        OrdersWithState readyOrders = new OrdersWithState(om, 2);
        mw.setModelOrders(createdOrders, prepOrders, readyOrders);
        ListenerAddPizza lap = new ListenerAddPizza(mw, pom, options);
        ListenerAddExtra lae = new ListenerAddExtra(mw, pom);
        ListenerOrder lao = new ListenerOrder(mw, om, pom);
        ListenerDelete ld = new ListenerDelete(mw, pom);
        ListenerCancelOrder lco = new ListenerCancelOrder(mw, om);
        mw.addPizzaListener(lap);
        mw.addExtraListener(lae);
        mw.orderListener(lao);
        mw.deleteListener(ld);
        mw.cancelListener(lco);
        
        mw.setVisible(true);
    }
}
