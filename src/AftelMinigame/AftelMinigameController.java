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
	private Timer timer = new Timer(10, new TimerHandler());
	private int verstrekenTijd;
	LocalTime startTijd=LocalTime.now();
	LocalTime huidigeTijd=LocalTime.now();

	public AftelMinigameController(){
		// Border layout maken voor de gehele applicatie
		setLayout(new BorderLayout());

		// Nieuwe model en view toevoegen aan de controller
		aftelminigamemodel = new AftelMinigameModel();
		aftelminigameview = new AftelMinigameView();

		add(aftelminigameview, BorderLayout.CENTER);

		// Action listener voor de startknop
		aftelminigameview.getStartKnop().addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// Random start waarde toewijzen aan de currentTime. Dit gebeurd zodat je kan spelen met nieuwe waardes.
				huidigeTijd = LocalTime.now().minusSeconds(aftelminigamemodel.getRandomStart());
				// Nog een keer het model aanmaken zodat er nieuwe waardes worden gegenereerd
				aftelminigamemodel = new AftelMinigameModel();
				// Tijd starten en startknop + uitslag disablen
				startTijd = LocalTime.now();
				timer.start();
				aftelminigameview.uitzetten();
			}

		});

		// Action listener voor de invoerknop
		aftelminigameview.getInvoerKnop().addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				// Timer stoppen
				timer.stop();
				// Start knop enablen + de timer weer visible maken
				aftelminigameview.aanzetten();
				// Bepaalde tekst neerzetten aan de hand van je uitslag
				aftelminigameview.setUitslagLabel(verstrekenTijd);
			}
		});

	}

	class TimerHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			// Random start waarde ophalen en toewijzen aan currentTime
			huidigeTijd = LocalTime.now().minusSeconds(aftelminigamemodel.getRandomStart());
			// Elapsedtime aanmaken. Zie Stackoverflow.
			long verstrekentijd = ChronoUnit.MILLIS.between(huidigeTijd, startTijd);
			// Als de elapsedtime in secondes gelijk is aan de random invisible, zet de timerlabel op invisible.
			if((int)verstrekentijd/1000 == aftelminigamemodel.getRandomOnzichtbaar()){
				aftelminigameview.getTimerLabel().setVisible(false);
			}
			// Zet de tijd om in seconden met 2 cijfers achter de komma zodat je een preciezere tijd kan aflezen
			verstrekenTijd = (int) verstrekentijd/1000;
			aftelminigameview.getTimerLabel().setText("Verstreken tijd: " + String.format("%.2f", (double)(verstrekentijd/1000.0)) + " seconden" );
		}
	}

}

