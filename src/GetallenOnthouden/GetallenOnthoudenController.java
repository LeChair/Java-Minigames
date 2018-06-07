package GetallenOnthouden;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;

public class GetallenOnthoudenController extends JPanel {
	private GetallenOnthoudenView getallenRadenView;
	private InvoerView invoerview;
    public JButton startgame;
    public int gamescreen = 0;
	
	public GetallenOnthoudenController(){
		setLayout(new BorderLayout());

        startgame = new JButton("Start spel");
        startgame.addActionListener(new Screen2Handler());

        add(startgame, BorderLayout.NORTH);

	}

    class Screen2Handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gamescreen = 1;
            getallenRadenView = new GetallenOnthoudenView();
            add(getallenRadenView, BorderLayout.CENTER);
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
            remove(getallenRadenView);
        }
    }
}
