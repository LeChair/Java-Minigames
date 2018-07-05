package GetallenOnthouden;

import java.awt.Dimension;

import javax.swing.JFrame;

public class GetallenOnthouden extends JFrame {
	public static void main(String args[]) {
		new GetallenOnthouden();
	}

	public GetallenOnthouden() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 400);
		setPreferredSize(new Dimension(400,400));
		setTitle("Mini Games");
		GetallenOnthoudenController controller = new GetallenOnthoudenController();
		setContentPane(controller);
		setVisible(true);
		controller.reset();
		
	}
}
