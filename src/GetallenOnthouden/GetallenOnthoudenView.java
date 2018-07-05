package GetallenOnthouden;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class GetallenOnthoudenView extends JPanel {

	private GetallenOnthoudenController controller;
	private JLabel tijdlabel;
	private Timer timer = new Timer(10, new TimerHandler());
	private LocalTime startTime;

	public GetallenOnthoudenView(GetallenOnthoudenController controller) {

		this.controller = controller;

		JLabel teOnthoudenGetalLabel = new JLabel("" + controller.getGetal());
		tijdlabel = new JLabel("" + timer);

		add(teOnthoudenGetalLabel);
		add(tijdlabel);

		startTime = LocalTime.now();
		timer.start();
	}

	class TimerHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			long elapsedtime = ChronoUnit.MILLIS.between(startTime, LocalTime.now());
			long milliseconden = elapsedtime % 60000;
			tijdlabel.setText("Seconden:" + milliseconden / 1000);
			
			if (milliseconden > 2000) {
				timer.stop();
				controller.volgendScherm();
			}
		}
	}
}
