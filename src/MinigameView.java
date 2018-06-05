import javax.swing.*;

public class MinigameView extends JPanel {
	
	public JTextField invoervak;
	
	public MinigameView(){
		
		invoervak = new JTextField("Monique doet een test");
		
		add(invoervak);
	}
}
