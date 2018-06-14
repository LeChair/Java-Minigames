package GetallenOnthouden;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;

public class GetallenOnthoudenController extends JPanel {
	private GetallenOnthoudenView getallenonthoudenview;
	private InvoerView invoerview;
	private CheckView checkview;
    public JButton startgame;
    public int gamescreen = 1;
    private Getal getal;
	
	public GetallenOnthoudenController(){
		setLayout(new BorderLayout());

        startgame = new JButton("Start spel");
        startgame.addActionListener(new Screen2Handler());

        add(startgame, BorderLayout.NORTH);
//        checkview = new CheckView();

  //      add(checkview, BorderLayout.CENTER);

//        add(checkview, BorderLayout.CENTER);


	}

    public Getal getGetal() {
        return getal;
    }


    class Screen2Handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            VolgendScherm();
        }
    }

    public void VolgendScherm(){
        gamescreen++;
	    if(gamescreen==2){
            getal = new Getal(5);
            getallenonthoudenview = new GetallenOnthoudenView(this);
            add(getallenonthoudenview, BorderLayout.CENTER);
            System.out.println(gamescreen);
            remove(startgame);
        }
	    else if(gamescreen==3){
            invoerview = new InvoerView(this);
            add(invoerview, BorderLayout.CENTER);
            System.out.println(gamescreen);
            remove(getallenonthoudenview);
        }else if(gamescreen==4){
	        String invoerString = invoerview.getalinvoer.getText();
            remove(invoerview);
            checkview = new CheckView(this, invoerString);
            add(checkview, BorderLayout.CENTER);
            System.out.println(gamescreen);
        }else if(gamescreen==5){
	        gamescreen=2;
        }

    }
}
