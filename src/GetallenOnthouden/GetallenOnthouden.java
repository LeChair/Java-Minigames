package GetallenOnthouden;

import javax.swing.JFrame;

public class GetallenOnthouden extends JFrame {
	public static void main( String args[] ) {
		JFrame frame = new GetallenOnthouden();

	}
	
	public GetallenOnthouden(){
		setSize(600, 500);
		setTitle( "Mini Games" );
		setContentPane( new GetallenOnthoudenController() );
		setVisible( true );
	}
}


//verschillende views (per scherm?), na op de startknop te hebben geklikt wordt er met een functie
//een andere view geladen?