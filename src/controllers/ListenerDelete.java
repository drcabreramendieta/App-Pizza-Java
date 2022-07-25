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
import java.lang.NullPointerException;

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
        try{
            Object selectedItem = mw.getSelectedItemPreOrder();
            pom.removeElement(selectedItem);
        }
        catch(NullPointerException ex){
            mw.showDialog(ex.getMessage());
        }
    }
    
}
