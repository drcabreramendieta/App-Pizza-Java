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
public class Pizza {
    private Edge edge;
    private ArrayList<Slide> slides;

    public Pizza() {
        slides = new ArrayList<>();
    }
    
    public void setEdge(Edge edge) {
        this.edge = edge;
    }
    
    public void addSlide(Slide slide){
        slides.add(slide);
    }
    
    public double getCost(){
        double cost = 0;
        for(Slide slide:slides){
            cost = cost + slide.getCost();
        }
        return edge.getCost() + cost;
    }
    
    @Override
    public String toString(){
        return "Pizza "+ slides.get(0).getName()+" "+slides.size()+" slides";
    }
}
