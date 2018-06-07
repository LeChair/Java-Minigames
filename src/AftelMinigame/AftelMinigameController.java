package AftelMinigame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import javax.swing.*;

@SuppressWarnings("serial")
public class AftelMinigameController extends JPanel {
	AftelMinigameView aftelminigameview;
	AftelMinigameModel aftelminigamemodel;
	public Timer timer = new Timer(10, new TimerHandler());
	public int elapsedTime;
	LocalTime startTime=LocalTime.now();
	LocalTime currentTime=LocalTime.now();
	
	public AftelMinigameController(){
		setLayout(new BorderLayout());
		
		aftelminigamemodel = new AftelMinigameModel();
		aftelminigameview = new AftelMinigameView();
			
		add(aftelminigameview, BorderLayout.CENTER);
			
		
		aftelminigameview.startKnop.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				currentTime = LocalTime.now().minusSeconds(aftelminigamemodel.randomStart);
				aftelminigamemodel = new AftelMinigameModel();
				startTime = LocalTime.now();
				timer.start();
				aftelminigameview.startKnop.setEnabled(false);
				aftelminigameview.uitslagLabel.setText("");
			}
			
		});
		
		aftelminigameview.invoerKnop.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e){
				timer.stop();
				aftelminigameview.startKnop.setEnabled(true);
				aftelminigameview.timerLabel.setVisible(true);
				// Tussen de -1 en de 1
				if(elapsedTime < 1 && elapsedTime > -1){
					aftelminigameview.uitslagLabel.setText("Woa! Goed gedaan man!");
				// Tussen de 1 en de 2
				} else if(elapsedTime >= 1 && elapsedTime <= 2){
					aftelminigameview.uitslagLabel.setText("Wel oké, maar kan beter!");
				// Tussen de -1 en de -2
				} else if(elapsedTime <= -1 && elapsedTime >= -2){
					aftelminigameview.uitslagLabel.setText("Wel oké, maar kan beter!");
				// Boven de 2 en onder de -2
				} else if(elapsedTime > 2 || elapsedTime < -2){
					aftelminigameview.uitslagLabel.setText("Best wel slecht man");
				}
			}
		});
				
	}
	
	class TimerHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			currentTime = LocalTime.now().minusSeconds(aftelminigamemodel.randomStart);
			long elapsedtime= ChronoUnit.MILLIS.between(currentTime, startTime);
			if((int)elapsedtime/1000 == aftelminigamemodel.randomInvisible){
				aftelminigameview.timerLabel.setVisible(false);
			}
			elapsedTime = (int) elapsedtime/1000;
			//System.out.println(elapsedTime);
			aftelminigameview.timerLabel.setText("Verstreken tijd: " + String.format("%.2f", (double)(elapsedtime/1000.0)) + " seconden" );
		}
	}

}
