/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import models.*;

/**
 *
 * @author UPS
 */
public class Principal {
    public static void main(String[] args){
        Options options = new Options();
        System.out.println(options);
        Pizza pizza = new Pizza();
        pizza.setEdge(options.getEdge("queso"));
        
        for(int i=0;i < options.getSize("familiar");i++){
            pizza.addSlide(options.getSlide("pepperoni"));
        }
        
        Client client = new Client("Pepito");
        
        Order order = new Order(client, 0);
        order.addPizza(pizza);
        order.addExtra(options.getExtra("coca-cola"));
        
        System.out.println("La orden cuesta: "+ order.getCost());
        
        OrdersModel ordersModel = new OrdersModel();
        ordersModel.addOrder(order);
        
        
    }
}
