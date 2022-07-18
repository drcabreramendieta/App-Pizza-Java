/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import javax.swing.AbstractListModel;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author UPS
 */
public class Option extends AbstractListModel{
    ArrayList option;

    public Option(HashMap option) {
        this.option = new ArrayList(option.values());
    }
    
    @Override
    public int getSize() {
        return option.size();
    }

    @Override
    public Object getElementAt(int i) {
        return option.get(i);
    }
    
}
