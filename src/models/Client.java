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
public class Client {
    private String name;

    public Client(String name) {
        this.name = name;
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
