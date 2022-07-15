/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.util.HashMap;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author UPS
 */
public class Options {
    private HashMap<String, Slide> availableSlides;
    private HashMap<String, Edge> availableEdges;
    private HashMap<String, Extra> availableExtras;
    private HashMap<String, Integer> availableSize;
    
    private void fillSlides(){
        availableSlides = new HashMap<>();
        File f = new File("C:\\Users\\UPS\\Documents\\NetBeansProjects\\AppPizzeria\\src\\resources\\slides.pizza");
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line != null){
                String[] content = line.split(" ");
                Slide slide = new Slide();
                slide.setName(content[0]);
                slide.setCost(Double.parseDouble(content[1]));
                availableSlides.put(content[0], slide);
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Options.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Options.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void fillEdges(){
        availableEdges = new HashMap<>();
        File f = new File("C:\\Users\\UPS\\Documents\\NetBeansProjects\\AppPizzeria\\src\\resources\\edges.pizza");
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line != null){
                String[] content = line.split(" ");
                Edge edge = new Edge();
                edge.setName(content[0]);
                edge.setCost(Double.parseDouble(content[1]));
                availableEdges.put(content[0], edge);
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Options.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Options.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void fillExtras(){
        availableExtras = new HashMap<>();
        File f = new File("C:\\Users\\UPS\\Documents\\NetBeansProjects\\AppPizzeria\\src\\resources\\extras.pizza");
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line != null){
                String[] content = line.split(" ");
                Extra extra = new Extra();
                extra.setName(content[0]);
                extra.setCost(Double.parseDouble(content[1]));
                availableExtras.put(content[0], extra);
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Options.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Options.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void fillSize(){
        availableSize = new HashMap<>();
        File f = new File("C:\\Users\\UPS\\Documents\\NetBeansProjects\\AppPizzeria\\src\\resources\\size.pizza");
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line != null){
                String[] content = line.split(" ");
                availableSize.put(content[0], Integer.parseInt(content[1]));
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Options.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Options.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Options() {
        fillSlides();
        fillExtras();
        fillEdges();
        fillSize();
    }
    
    public Slide getSlide(String key){
        return availableSlides.get(key);
    }
    
    public Edge getEdge(String key){
        return availableEdges.get(key);
    }
    
    public Extra getExtra(String key){
        return availableExtras.get(key);
    }
    
    public int getSize(String key){
        return availableSize.get(key);
    }
    
    @Override
    public String toString(){
        return availableSlides.toString() 
                + availableEdges.toString() 
                + availableExtras.toString()
                + availableSize.toString();
    }
}
