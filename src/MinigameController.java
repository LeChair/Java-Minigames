import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import AftelMinigame.AftelMinigame;
import GetallenOnthouden.GetallenOnthouden;


@SuppressWarnings("serial")
public class MinigameController extends JPanel {
	MinigameView minigameview;
	AftelMinigame aftelminigame;
	GetallenOnthouden getallenonthouden;
	
	public MinigameController(){
		setLayout(new BorderLayout());
		
		minigameview = new MinigameView();
			
		minigameview.getSpel1Knop().addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("spel1");
				new AftelMinigame();
			}
		});
		
		minigameview.getSpel2Knop().addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("spel2");
				new GetallenOnthouden();
			}
		});
		
		add(minigameview, BorderLayout.CENTER);
	}
}
