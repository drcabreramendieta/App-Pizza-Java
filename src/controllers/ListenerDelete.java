/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import models.PreOrderModel;
import view.MainWindow;

/**
 *
 * @author UPS
 */
public class ListenerDelete implements ActionListener{
    MainWindow mw;
    PreOrderModel pom;

    public ListenerDelete(MainWindow mw, PreOrderModel pom) {
        this.mw = mw;
        this.pom = pom;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object selectedItem = mw.getSelectedItemPreOrder();
        pom.removeElement(selectedItem);
    }
    
}
