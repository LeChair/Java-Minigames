package AftelMinigame;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class AftelMinigame extends JFrame {
	public static void main( String args[] ) {
		new AftelMinigame();
	}
	
	public AftelMinigame() {
		setSize(550, 150);
		setTitle( "Aftel Minigame" );
		setContentPane( new AftelMinigameController() );
		setVisible( true );
		setLocation(300, 100);
	}
}
