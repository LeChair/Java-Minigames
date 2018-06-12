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
	
	public GetallenOnthoudenController(){
		setLayout(new BorderLayout());

        startgame = new JButton("Start spel");
        startgame.addActionListener(new Screen2Handler());

        add(startgame, BorderLayout.NORTH);
//        checkview = new CheckView();
<<<<<<< HEAD
  //      add(checkview, BorderLayout.CENTER);
=======
//        add(checkview, BorderLayout.CENTER);
>>>>>>> branch 'development' of https://github.com/LeChair/Java-Minigames.git

	}

    class Screen2Handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gamescreen = 1;
            getallenonthoudenview = new GetallenOnthoudenView();
            add(getallenonthoudenview, BorderLayout.CENTER);
            System.out.println(gamescreen);
            remove(startgame);
        }
    }

    class Screen3Handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gamescreen = 2;
            invoerview = new InvoerView();
            add(invoerview, BorderLayout.CENTER);
            System.out.println(gamescreen);
            remove(getallenonthoudenview);
        }
    }

    class NextHandler implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int gamescreen = 2;
        }
    }

//    public void showNextScreen(){
//        gamescreen++;
//    }
}
