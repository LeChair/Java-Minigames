package GetallenOnthouden;

import java.awt.*;
import javax.swing.*;

public class GetallenOnthoudenController extends JPanel {
	GetallenOnthoudenView getallenRadenView;
	
	public GetallenOnthoudenController(){
		setLayout(new BorderLayout());
		
		getallenRadenView = new GetallenOnthoudenView();
			
		add(getallenRadenView, BorderLayout.CENTER);
			
	}
}
