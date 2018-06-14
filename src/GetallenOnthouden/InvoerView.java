package GetallenOnthouden;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InvoerView extends JPanel {
    private GetallenOnthoudenController controller;
    public JTextField getalinvoer;
    public JLabel getalvraag, controletekst;
    public String invoer = "";

    public InvoerView(GetallenOnthoudenController controller){

        this.controller = controller;

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
            invoer = getalinvoer.getText();
            System.out.println(invoer);
            controller.VolgendScherm();
        }
    }
}
