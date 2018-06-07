package GetallenOnthouden;

import javax.swing.JFrame;

public class GetallenOnthouden extends JFrame {
	public static void main( String args[] ) {
		JFrame frame = new GetallenOnthouden();
		frame.setSize(600, 500);
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setTitle( "Mini Games" );
		frame.setContentPane( new GetallenOnthoudenView() );
		frame.setVisible( true );
	}
}


//verschillende views (per scherm?), na op de startknop te hebben geklikt wordt er met een functie
//een andere view geladen?