package GetallenOnthouden;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import javax.swing.*;

public class GetallenOnthoudenController extends JPanel {
	GetallenOnthoudenView getallenRadenView;
	
	public GetallenOnthoudenController(){
		setLayout(new BorderLayout());
		
		getallenRadenView = new GetallenOnthoudenView();
			
		add(getallenRadenView, BorderLayout.CENTER);

	}
}
