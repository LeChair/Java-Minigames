import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

@SuppressWarnings("serial")
public class MinigameView extends JPanel {
	
	public JLabel titellabel, emptylabel;
	public JButton spel1knop, spel2knop, spel3knop, spel4knop;
	
	public MinigameView(){
		
		setLayout(new GridLayout(3, 2, 50 ,50 ));
		
		Font f1 = new Font(Font.DIALOG, Font.BOLD, 13);
		
		spel1knop = new JButton("Aftel Minigame");
		spel1knop.setFont(f1);
		spel2knop = new JButton("Getal onthouden Minigame");
		spel2knop.setFont(f1);
		spel3knop = new JButton("Coming soon");
		spel3knop.setFont(f1);
		spel4knop = new JButton("Coming soon");
		spel4knop.setFont(f1);
		
		titellabel = new JLabel("Minigames Whoooooooo!");
		titellabel.setFont(f1);
		
		emptylabel = new JLabel("");
		
		add(titellabel);
		add(emptylabel);
		add(spel1knop);
		add(spel2knop);
		add(spel3knop);
		add(spel4knop);
	}
}
