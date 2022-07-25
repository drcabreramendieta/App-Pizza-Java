/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import view.MainWindow;
import models.PreOrderModel;
import models.Item;
import java.lang.NullPointerException;

/**
 *
 * @author UPS
 */
public class ListenerAddExtra implements ActionListener{
    MainWindow mw;
    PreOrderModel pom;

    public ListenerAddExtra(MainWindow mw, PreOrderModel pom) {
        this.mw = mw;
        this.pom = pom;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        try{
            Item requiredExtra = mw.getRequiredExtra();
            pom.addElement(requiredExtra);
        }
        catch(NullPointerException ex){
            mw.showDialog(ex.getMessage());
        }
    }
    
}
