package GetallenOnthouden;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InvoerView extends JPanel {
    
	private GetallenOnthoudenController controller;
    private JTextField getalinvoer;

    public InvoerView(GetallenOnthoudenController controller){

        this.controller = controller;

        getalinvoer = new JTextField(10);
        getalinvoer.addActionListener(new CheckHandler());

        add(new JLabel("Wat was het nummer?"));
        add(getalinvoer);
        add(new JLabel("Druk op enter om te controleren"));
    }
    
    public String getInput() {
    	return getalinvoer.getText();
    }

    class CheckHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            controller.volgendScherm();
        }
    }
}
