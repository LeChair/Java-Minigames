package GetallenRaden;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GetallenRadenView extends JPanel {
	
	public JTextField invoervak;
	public JLabel teRadenGetalLabel;
	
	public GetallenRadenView(){
		
		teRadenGetalLabel = new JLabel();
		
		invoervak = new JTextField("Monique doet een test");
		
		add(invoervak);
	}

	//timer maken
}
