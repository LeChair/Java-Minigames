package GetallenOnthouden;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckView extends JPanel {
    private GetallenOnthoudenModel getallenonthoudenmodel;
    private InvoerView invoerview;
    private GetallenOnthoudenController controller;
    private JLabel randomnummer, gegevenantwoord, levellabel;
    private int level=1;
    private JButton reset, next;

    public CheckView(Getal getal){
        getallenonthoudenmodel = new GetallenOnthoudenModel();
        invoerview = new InvoerView(controller);
        randomnummer = new JLabel("Nummer: " /*+ getallenonthoudeview.getal*/);

        gegevenantwoord = new JLabel("Jouw antwoord: "/*+ getallenonthoudeview.getal*/);

        levellabel = new JLabel("Level " + level);

        if(getal.genereerGetal == invoerview.invoer){
            System.out.println("Goed geraden");
            next = new JButton("Volgend level");
            next.addActionListener(new NextHandler());
        }else{
            System.out.println("Fout!");
            reset = new JButton("Opnieuw beginnen");
            reset.addActionListener(new ResetHandler());
        }

        add(randomnummer);
        add(gegevenantwoord);
        add(levellabel);
    }

    class NextHandler implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int gamescreen = 2;
        }
    }

    class ResetHandler implements ActionListener{
        public void actionPerformed(ActionEvent e) {

        }
    }

}
