import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Minigames extends JFrame {
	public static void main( String args[] ) {
		JFrame frame = new Minigames();
		frame.setSize(600, 500);
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setTitle( "Mini Games" );
		frame.setContentPane( new MinigameController() );
		frame.setVisible( true );
	}
}
