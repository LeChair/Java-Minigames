package AftelMinigame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import javax.swing.*;

public class AftelMinigameController extends JPanel {
	AftelMinigameView aftelminigameview;
	AftelMinigameModel aftelminigamemodel;
	
	public AftelMinigameController(){
		setLayout(new BorderLayout());
		
		aftelminigameview = new AftelMinigameView();
		aftelminigamemodel = new AftelMinigameModel();
			
		add(aftelminigameview, BorderLayout.CENTER);
			
		
		aftelminigameview.startKnop.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				aftelminigameview.startTime = LocalTime.now();
				aftelminigameview.timer.start();
				aftelminigameview.startKnop.setEnabled(false);
			}
			
		});
		
		aftelminigameview.invoerKnop.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e){
				aftelminigameview.timer.stop();
				aftelminigameview.startKnop.setEnabled(true);
			}
		});
		
	}

}
