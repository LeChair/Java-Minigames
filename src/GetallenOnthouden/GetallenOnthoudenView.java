package GetallenOnthouden;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GetallenOnthoudenView extends JPanel {
	private GetallenOnthoudenModel getallenOnthoudenModel;
	public JTextField invoervak;
	public JLabel teOnthoudenGetalLabel;
	
	public GetallenOnthoudenView(){
		
		getallenOnthoudenModel = new GetallenOnthoudenModel();
		int getal = getallenOnthoudenModel.genereerGetal();
		teOnthoudenGetalLabel = new JLabel("" + getal);
		teOnthoudenGetalLabel.setVisible(true);
		
		invoervak = new JTextField(10);
		invoervak.setVisible(false);
		
		add(invoervak);
		add(teOnthoudenGetalLabel);
	}

	//timer maken
}
