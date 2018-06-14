package GetallenOnthouden;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class GetallenOnthoudenView extends JPanel {
	private GetallenOnthoudenModel getallenOnthoudenModel;
	private GetallenOnthoudenController controller;
	public JLabel teOnthoudenGetalLabel;
	private JLabel tijdlabel, tijdbeschrijving;
	private Timer timer = new Timer(10, new TimerHandler());
	LocalTime startTime=LocalTime.now();
	LocalTime currentTime=LocalTime.now();
	private boolean isgestart=false;
	
	public GetallenOnthoudenView(GetallenOnthoudenController controller){

		getallenOnthoudenModel = new GetallenOnthoudenModel();

		this.controller = controller;

		teOnthoudenGetalLabel = new JLabel("" + controller.getGetal());
		teOnthoudenGetalLabel.setVisible(true);

//		int getal = Getal.genereerGetal();
//		teOnthoudenGetalLabel = new JLabel("" + getal);

		tijdlabel = new JLabel (""+timer);
		tijdbeschrijving = new JLabel("Verstreken tijd:");

		
		tijdlabel = new JLabel (""+timer);
//		tijdbeschrijving = new JLabel("Verstreken tijd:");


		add(teOnthoudenGetalLabel);
//		add(tijdbeschrijving);
		add(tijdlabel);

		if (!isgestart) {
			timer.start();
			startTime = LocalTime.now();
			isgestart=true;
		}
	}

	class TimerHandler implements ActionListener {
		public void actionPerformed(ActionEvent e){
			currentTime = LocalTime.now();
			long elapsedtime= ChronoUnit.MILLIS.between(startTime, currentTime);

			long milliseconden = elapsedtime%60000;

			tijdlabel.setText("Seconden:" + milliseconden/1000);
//            tijdlabel.setText(String.format("%2.2f", (double)(elapsedtime/1000.0))+" seconden" );
			if(milliseconden>3000){
				controller.VolgendScherm();
				timer.stop();
			}
		}
	}
}


//JLabel, te raden getal laten zien als String, ophalen uit JLabel en converteren naar int?