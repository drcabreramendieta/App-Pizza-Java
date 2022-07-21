/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import javax.swing.AbstractListModel;
import java.util.ArrayList;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

/**
 *
 * @author UPS
 */
public class OrdersWithState extends AbstractListModel<Order>{
    private ArrayList<Order> orders;
    private OrdersModel or;
    private int state;
    
    class ListenerOrdersModel implements ListDataListener{
        OrdersWithState ows;
        public ListenerOrdersModel(OrdersWithState ows) {
            this.ows = ows;
        }
        
        @Override
        public void intervalAdded(ListDataEvent lde) {
            Order addedOrder = or.getElementAt(lde.getIndex0());
            if(addedOrder.getState() == state){
                int index = orders.size();
                orders.add(addedOrder);
                fireIntervalAdded(ows, index, index);
            }
        }

        @Override
        public void intervalRemoved(ListDataEvent lde) {
            for(int i=lde.getIndex0(); i<=lde.getIndex1();i++ ){
                Order removedOrder = or.getElementAt(i);
                if(removedOrder.getState() == state){
                    int index = orders.indexOf(removedOrder);
                    if(index != -1)
                    {
                        orders.remove(index);
                        fireIntervalRemoved(ows, index, index);
                    }
                    
                }
            }
        }

        @Override
        public void contentsChanged(ListDataEvent lde) {
            Order changedOrder = or.getElementAt(lde.getIndex0());
            if(changedOrder.getState() == state){
                int index = orders.size();
                orders.add(changedOrder);
                fireIntervalAdded(ows, index, index);
            }
            else{
                int index = orders.indexOf(changedOrder);
                if(index != -1){
                    orders.remove(index);
                    fireIntervalRemoved(ows, index, index);
                }
            }
        }
    
    }
    
    public OrdersWithState(OrdersModel or, int state) {
        this.or = or;
        orders = new ArrayList<Order>();
        this.state = state;
        ListenerOrdersModel lom = new ListenerOrdersModel(this);
        or.addListDataListener(lom);
    }
    
    @Override
    public int getSize() {
        return orders.size();
    }

    @Override
    public Order getElementAt(int i) {
        return orders.get(i);
    }
}
