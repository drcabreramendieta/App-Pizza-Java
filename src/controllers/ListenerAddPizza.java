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
import models.Pizza;
import models.Options;

/**
 *
 * @author UPS
 */
public class ListenerAddPizza implements ActionListener{
    MainWindow v;
    PreOrderModel pom;
    Options options;

    public ListenerAddPizza(MainWindow v, PreOrderModel pom, Options options) {
        this.v = v;
        this.pom = pom;
        this.options = options;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        try{
            String[] requiredPizza = v.getRequiredPizza();
            Pizza pizza = new Pizza();
            pizza.setEdge(options.getAvailableEdges().get(requiredPizza[2]));
            int nSlides = options.getAvailableSize().get(
                    requiredPizza[1]).getCost().intValue();
            for(int i=0; i < nSlides; i++){
                pizza.addSlide(options.getAvailableSlides().get(
                        requiredPizza[0]));
            }
            pom.addElement(pizza);
        }
        catch(Exception ex){
            v.showDialog("El tipo y tamaño deben estar seleccionados");
        }
    }
    
}
