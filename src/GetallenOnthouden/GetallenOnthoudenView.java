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
		
		invoervak = new JTextField(10);
		
		add(invoervak);
		add(teOnthoudenGetalLabel);
	}

	//timer maken
}
