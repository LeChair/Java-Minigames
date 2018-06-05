package GetallenRaden;

import java.awt.*;
import javax.swing.*;

public class GetallenRadenController extends JPanel {
	GetallenRadenView getallenRadenView;
	
	public GetallenRadenController(){
		setLayout(new BorderLayout());
		
		getallenRadenView = new GetallenRadenView();
			
		add(getallenRadenView, BorderLayout.CENTER);
			
	}
}
