/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author UPS
 */
public class Item {
    private String name;
    private Double cost;

    public Item() {
        
    }
    
    
    public String getName() {
        return name;
    }

    public Double getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
