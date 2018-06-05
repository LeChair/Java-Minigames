package GetallenRaden;

import javax.swing.JFrame;

public class GetallenRaden extends JFrame {
	public static void main( String args[] ) {
		JFrame frame = new GetallenRaden();
		frame.setSize(600, 500);
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setTitle( "Mini Games" );
		frame.setContentPane( new GetallenRadenView() );
		frame.setVisible( true );
	}
}
