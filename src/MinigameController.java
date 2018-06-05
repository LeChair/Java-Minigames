import java.awt.*;
import javax.swing.*;

public class MinigameController extends JPanel {
	MinigameView minigameview;
	
	public MinigameController(){
		setLayout(new BorderLayout());
		
		minigameview = new MinigameView();
			
		add(minigameview, BorderLayout.CENTER);
			//werkt het nu nog?
	}
}
