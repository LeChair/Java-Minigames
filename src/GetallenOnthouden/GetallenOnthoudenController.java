package GetallenOnthouden;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;

public class GetallenOnthoudenController extends JPanel {
	private GetallenOnthoudenView getallenRadenView;
    public JButton startgame;
    public int gamescreen = 0;
	
	public GetallenOnthoudenController(){
		setLayout(new BorderLayout());

        startgame = new JButton("Start spel");
        startgame.addActionListener(new ScreenHandler());

        getallenRadenView = new GetallenOnthoudenView();

        if(gamescreen==0) {
            add(startgame, BorderLayout.NORTH);
        }

	}
    class ScreenHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gamescreen = 1;
            add(getallenRadenView, BorderLayout.CENTER);
            System.out.println(gamescreen);
            remove(startgame);
        }
    }
}
