import javax.swing.JFrame;

public class Minigames extends JFrame {
	public static void main( String args[] ) {
		JFrame frame = new Minigames();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setTitle( "Mini Games" );
		frame.setContentPane( new MiniGameView() );
		frame.setVisible( true );
	}
}
