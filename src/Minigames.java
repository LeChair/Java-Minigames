
public class Minigames extends JFrame {
	public static void main( String args[] ) {
		JFrame frame = new Minigames();
		frame.setBounds( 200, 200, 200, 200 );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setTitle( "Mini Games" );
		frame.setContentPane( new MiniGameView() );
		frame.setVisible( true );
	}
}
