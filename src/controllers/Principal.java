/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import models.*;
import view.*;

/**
 *
 * @author UPS
 */
public class Principal {
    public static void main(String[] args){
        Options options = new Options();
        Option typeOption = new Option(options.getAvailableSlides());
        Option sizeOption = new Option(options.getAvailableSize());
        Option edgeOption = new Option(options.getAvailableEdges());
        Option extraOption = new Option(options.getAvailableExtras());
        
        MainWindow mw = new MainWindow();
        mw.setModelOptions(typeOption, 
                sizeOption, 
                edgeOption, 
                extraOption);
        mw.setVisible(true);
    }
}
