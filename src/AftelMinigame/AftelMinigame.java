package AftelMinigame;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class AftelMinigame extends JFrame {
	public static void main( String args[] ) {
		JFrame frame = new AftelMinigame();
		frame.setSize(400, 150);
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setTitle( "Aftel Minigame" );
		frame.setContentPane( new AftelMinigameController() );
		frame.setVisible( true );
		frame.setLocation(300, 100);
	}
}
