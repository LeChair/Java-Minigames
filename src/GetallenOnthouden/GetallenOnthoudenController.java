package GetallenOnthouden;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class GetallenOnthoudenController extends JPanel {

	private GetallenOnthoudenView getallenonthoudenview;
	private StartView startview;
	private InvoerView invoerview;
	private CheckView checkview;
	private int gamescreen;
	private String invoer;
	private Getal getal;
	private int level;

	public GetallenOnthoudenController() {
		setLayout(new BorderLayout());
		level = 1;
	}

	public Getal getGetal() {
		return getal;
	}

	public int getLevel() {
		return level;
	}

	public String getInvoer() {
		return invoer;
	}

	public void reset() {
		gamescreen = 0;
		volgendScherm();
	}

	public void nextLevel() {
		level++;
		volgendScherm();
	}

	public void volgendScherm() {

		gamescreen++;
		System.out.println("Volgend scherm: " + gamescreen);

		if (gamescreen == 1) {
			startview = new StartView(this);
			add(startview, BorderLayout.CENTER);

		} else if (gamescreen == 2) {
			remove(startview);
			getal = new Getal(5);
			getallenonthoudenview = new GetallenOnthoudenView(this);
			add(getallenonthoudenview, BorderLayout.CENTER);

		} else if (gamescreen == 3) {
			remove(getallenonthoudenview);
			invoerview = new InvoerView(this);
			add(invoerview, BorderLayout.CENTER);

		} else if (gamescreen == 4) {
			invoer = invoerview.getInput();
			remove(invoerview);
			checkview = new CheckView(this);
			add(checkview);

		} else if (gamescreen == 5) {
			remove(checkview);
			reset();
		}

		SwingUtilities.getWindowAncestor(this).pack();
	}

	class ScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			volgendScherm();
		}
	}
}
