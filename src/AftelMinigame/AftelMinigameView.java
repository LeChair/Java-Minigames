package AftelMinigame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AftelMinigameView extends JPanel {
	
	public JTextField invoervak;
	
	public AftelMinigameView(){
		
		invoervak = new JTextField("Hallo?");
		
		add(invoervak);
	}

	//timer maken
}
