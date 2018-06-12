package AftelMinigame;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class AftelMinigameView extends JPanel {

	private JLabel timerLabel, uitlegLabel, uitslagLabel;
	private JButton invoerKnop, startKnop;

	public AftelMinigameView(){

		// Zet de layout op border
		setLayout(new BorderLayout(10, 10));

		// Nieuwe font aanmaken
		Font f1 = new Font(Font.DIALOG, Font.BOLD, 13);

		// Alle labels en knoppen aanmaken
		timerLabel = new JLabel("Verstreken tijd: ");
		timerLabel.setFont(f1);

		uitlegLabel = new JLabel("Druk op de knop wanneer je denkt dat de tijd op 0 staat");
		uitlegLabel.setFont(f1);

		uitslagLabel = new JLabel("");
		uitslagLabel.setFont(f1);

		startKnop = new JButton("Start het spel");
		startKnop.setFont(f1);

		invoerKnop = new JButton("Ik denk dat het nu 0 is!");
		invoerKnop.setFont(f1);

		// Alles toevoegen op de juiste plek
		add(uitlegLabel, BorderLayout.NORTH);
		add(startKnop, BorderLayout.LINE_START);
		add(timerLabel, BorderLayout.CENTER);
		add(uitslagLabel, BorderLayout.LINE_END);
		add(invoerKnop, BorderLayout.SOUTH);
	}

	// Getters
	public JButton getStartKnop(){
		return this.startKnop;
	}

	public JButton getInvoerKnop(){
		return this.invoerKnop;
	}

	public JLabel getTimerLabel(){
		return this.timerLabel;
	}

	// Uitslag label setten bij bepaalde waarden
	public void setUitslagLabel(int verstrekenTijd){
		if(verstrekenTijd < 1 && verstrekenTijd > -1){
			uitslagLabel.setText("Woa! Goed gedaan man!");
		// Tussen de 1 en de 2
		} else if(verstrekenTijd >= 1 && verstrekenTijd <= 2){
			uitslagLabel.setText("Wel ok, maar kan beter!");
		// Tussen de -1 en de -2
		} else if(verstrekenTijd <= -1 && verstrekenTijd >= -2){
			uitslagLabel.setText("Wel ok, maar kan beter!");
		// Boven de 2 en onder de -2
		} else if(verstrekenTijd > 2 || verstrekenTijd < -2){
			uitslagLabel.setText("Best wel slecht man");
		}
	}

	// Disable functie om het spel te resetten
	public void uitzetten(){
		startKnop.setEnabled(false);
		uitslagLabel.setText("");
	}

	// Enable functie om het spel te starten
	public void aanzetten(){
		startKnop.setEnabled(true);
		timerLabel.setVisible(true);
	}
}
