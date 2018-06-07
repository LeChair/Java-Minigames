package GetallenOnthouden;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InvoerView extends JPanel {
    public JTextField getalinvoer;
    public JLabel getalvraag, controletekst;

    public InvoerView(){

        getalvraag = new JLabel("Wat was het nummer?");

        getalinvoer = new JTextField(10);
        getalinvoer.addActionListener(new CheckHandler());

        controletekst = new JLabel("Druk op enter om te controleren");

        add(getalvraag);
        add(getalinvoer);
        add(controletekst);
    }

    class CheckHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String invoer = getalinvoer.getText();
            System.out.println(invoer);
        }
    }
}
