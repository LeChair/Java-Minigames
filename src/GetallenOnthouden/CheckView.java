package GetallenOnthouden;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckView extends JPanel {
    private InvoerView invoerview;
    private GetallenOnthoudenController controller;
    private JLabel randomnummer, gegevenantwoord, levellabel;
    private int level=1;
    private JButton reset, next;
    private Getal getal;

    //ipv Getal getal controller?
    public CheckView(GetallenOnthoudenController controller, String invoer){
        randomnummer = new JLabel("Nummer: " /*+ getallenonthoudeview.getal*/);

        this.controller = controller;

        gegevenantwoord = new JLabel("Jouw antwoord: "/*+ getallenonthoudeview.getal*/);

        levellabel = new JLabel("Level " + level);

        if( controller.getGetal().equals(invoer)){
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
            controller.VolgendScherm();
        }
    }

    class ResetHandler implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            controller.gamescreen=1;
        }
    }

}
