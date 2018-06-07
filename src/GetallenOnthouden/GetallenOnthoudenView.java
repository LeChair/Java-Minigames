package GetallenOnthouden;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class GetallenOnthoudenView extends JPanel {
	private GetallenOnthoudenModel getallenOnthoudenModel;
	public JTextField invoervak;
	public JLabel teOnthoudenGetalLabel;
	private JLabel tijdlabel, tijdbeschrijving;
	private Timer timer = new Timer(10, new TimerHandler());
	LocalTime startTime=LocalTime.now();
	LocalTime currentTime=LocalTime.now();
	private boolean isgestart=false;
	
	public GetallenOnthoudenView(){

		getallenOnthoudenModel = new GetallenOnthoudenModel();
		int getal = getallenOnthoudenModel.genereerGetal();
		teOnthoudenGetalLabel = new JLabel("" + getal);

		tijdlabel = new JLabel (""+timer);
		tijdbeschrijving = new JLabel("Verstreken tijd:");


		invoervak = new JTextField(10);
		
		add(invoervak);
		add(teOnthoudenGetalLabel);
		add(tijdbeschrijving);
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

			long minuten = elapsedtime / 60000;
			long seconden = elapsedtime%60000;
//            long milliseconden = elapsedtime/1000;

			tijdlabel.setText("" + minuten + ":"+ seconden/1000 + " m:s");
//            tijdlabel.setText(String.format("%2.2f", (double)(elapsedtime/1000.0))+" seconden" );
		}
	}

	//timer maken
}
