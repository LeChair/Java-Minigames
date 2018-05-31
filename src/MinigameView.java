import javax.swing.*;
import java.awt.*;

public class MinigameView extends JPanel {
	
	public JTextField invoervak;
	
	public MinigameView(){
		
		invoervak = new JTextField("Voer een getal in");
		
		add(invoervak);
	}
}
