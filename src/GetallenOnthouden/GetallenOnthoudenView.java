package GetallenOnthouden;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GetallenOnthoudenView extends JPanel {
	
	public JTextField invoervak;
	public JLabel teRadenGetalLabel;
	
	public GetallenOnthoudenView(){
		
		teRadenGetalLabel = new JLabel();
		
		invoervak = new JTextField("Monique doet een test");
		
		add(invoervak);
	}

	//timer maken
}
