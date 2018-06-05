package AftelMinigame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class AftelMinigameView extends JPanel {
	
	public JLabel timerLabel, uitlegLabel;
	public JButton invoerKnop, startKnop;
	
	public AftelMinigameView(){
		
		setLayout(null);
		
		timerLabel = new JLabel("Verstreken tijd: ");
		timerLabel.setBounds(100, 50, 300, 20);
		uitlegLabel = new JLabel("Druk op de knop wanneer je denkt dat de tijd op 0 staat");
		uitlegLabel.setBounds(50, 20, 400, 20);
		
		invoerKnop = new JButton();
		invoerKnop.setBounds(150, 100, 50, 20);
		startKnop = new JButton("Start");
		startKnop.setBounds(150, 120, 70, 30);
		
		add(timerLabel);
		add(uitlegLabel);
		add(invoerKnop);
		add(startKnop);
	}

	//label maken. timer aanmaken, actionlistener voor de knop
}
