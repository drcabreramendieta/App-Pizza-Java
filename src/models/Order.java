/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.util.ArrayList;

/**
 *
 * @author UPS
 */
public class Order {
    private Client client;
    private ArrayList<Pizza> pizzas;
    private ArrayList<Extra> extras;
    private int state;

    public Order(Client client, int state) {
        this.client = client;
        this.state = state;
        pizzas = new ArrayList<>();
        extras = new ArrayList<>();
    }
    
    public void addPizza(Pizza pizza){
        pizzas.add(pizza);
    }
    
    public void addExtra(Extra extra){
        extras.add(extra);
    }
    
    public double getCost(){
        double cost = 0;
        for (Pizza pizza:pizzas){
            cost = cost + pizza.getCost();
        }
        for (Extra extra:extras){
            cost = cost + extra.getCost();
        }
        return cost;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
    
    
}
