/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.awt.Frame;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

/**
 *
 * @author UPS
 */
public class DialogWindow extends JDialog implements ActionListener{
    private JLabel message;
    private JButton okButton;
    
    public DialogWindow(Frame frame, boolean bln) {
        super(frame, bln);
        setLayout(new BorderLayout());
        message = new JLabel("Dialogo");
        okButton = new JButton("Aceptar");
        okButton.addActionListener(this);
        add(message, BorderLayout.CENTER);
        add(okButton, BorderLayout.SOUTH);
        setSize(300,200);
    }
    
    public void showDialog(String message){
        this.message.setText(message);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.setVisible(false);
    }
    
}
