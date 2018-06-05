package AftelMinigame;
import javax.swing.JFrame;

public class AftelMinigame extends JFrame {
	public static void main( String args[] ) {
		JFrame frame = new AftelMinigame();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setTitle( "Aftel Minigame" );
		frame.setContentPane( new AftelMinigameController() );
		frame.setVisible( true );
		frame.setLocation(400, 100);
	}
}
