package AftelMinigame;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class AftelMinigameView extends JPanel {
	
	public JLabel timerLabel, uitlegLabel, uitslagLabel;
	public JButton invoerKnop, startKnop;
	
	public AftelMinigameView(){
		
		setLayout(new BorderLayout(10, 10));
		
		Font f1 = new Font(Font.DIALOG, Font.BOLD, 13);
			
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

		add(uitlegLabel, BorderLayout.NORTH);
		add(startKnop, BorderLayout.LINE_START);
		add(timerLabel, BorderLayout.CENTER);
		add(uitslagLabel, BorderLayout.LINE_END);
		add(invoerKnop, BorderLayout.SOUTH);
	}

}
