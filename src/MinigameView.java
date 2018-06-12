import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

@SuppressWarnings("serial")
public class MinigameView extends JPanel {
	
	public JLabel titelLabel, legeLabel;
	public JButton spel1Knop, spel2Knop, spel3Knop, spel4Knop;
	
	public MinigameView(){
		
		setLayout(new GridLayout(3, 2, 50 ,50 ));
		
		Font f1 = new Font(Font.DIALOG, Font.BOLD, 13);
		
		spel1Knop = new JButton("Aftel Minigame");
		spel1Knop.setFont(f1);
		spel2Knop = new JButton("Getal onthouden Minigame");
		spel2Knop.setFont(f1);
		spel3Knop = new JButton("Coming soon");
		spel3Knop.setFont(f1);
		spel4Knop = new JButton("Coming soon");
		spel4Knop.setFont(f1);
		
		titelLabel = new JLabel("Minigames Whoooooooo!");
		titelLabel.setFont(f1);
		
		legeLabel = new JLabel("");
		
		add(titelLabel);
		add(legeLabel);
		add(spel1Knop);
		add(spel2Knop);
		add(spel3Knop);
		add(spel4Knop);
	}
	
	public JButton getSpel1Knop(){
		return this.spel1Knop;
	}

	public JButton getSpel2Knop(){
		return this.spel2Knop;
	}
	
	public JButton getSpel3Knop(){
		return this.spel3Knop;
	}
	
	public JButton getSpel4Knop(){
		return this.spel4Knop;
	}
}
