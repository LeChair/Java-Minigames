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
    public int gamescreen = 0;
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
	    if(gamescreen==0){
            getal = new Getal(5);
            getallenonthoudenview = new GetallenOnthoudenView(this);
            add(getallenonthoudenview, BorderLayout.CENTER);
            System.out.println(gamescreen);
            remove(startgame);
        }
	    else if(gamescreen==1){
            invoerview = new InvoerView(this);
            add(invoerview, BorderLayout.CENTER);
            System.out.println(gamescreen);
            remove(getallenonthoudenview);
        }else if(gamescreen==2){
            checkview = new CheckView(getal);
            add(checkview, BorderLayout.CENTER);
            System.out.println(gamescreen);
            remove(invoerview);
        }else if(gamescreen==3){
	        gamescreen=1;
        }
        gamescreen++;
    }
}
