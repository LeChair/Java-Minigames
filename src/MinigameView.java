import javax.swing.*;

public class MinigameView extends JPanel {
	
	public JTextField invoervak;
	public JLabel teRadenGetalLabel;
	
	public MinigameView(){
		
		teRadenGetalLabel = new JLabel();
		
		invoervak = new JTextField("Monique doet een test");
		
		add(invoervak);
	}
}
