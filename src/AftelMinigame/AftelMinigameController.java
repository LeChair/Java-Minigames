package AftelMinigame;
import java.awt.*;
import javax.swing.*;

public class AftelMinigameController extends JPanel {
	AftelMinigameView aftelminigameview;
	
	public AftelMinigameController(){
		setLayout(new BorderLayout());
		
		aftelminigameview = new AftelMinigameView();
			
		add(aftelminigameview, BorderLayout.CENTER);
			
	}
}
