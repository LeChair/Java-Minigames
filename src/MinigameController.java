import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.*;

import AftelMinigame.AftelMinigame;
import GetallenOnthouden.GetallenOnthouden;
import sun.audio.*;

@SuppressWarnings("serial")
public class MinigameController extends JPanel {
	MinigameView minigameview;
	AftelMinigame aftelminigame;
	GetallenOnthouden getallenonthouden;
	
	public MinigameController(){
		setLayout(new BorderLayout());
		
		//music();
		
		minigameview = new MinigameView();
			
		minigameview.getSpel1Knop().addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("spel1");
				new AftelMinigame();
				//AudioPlayer.player.stop(music.audioStream);
			}
		});
		
		minigameview.getSpel2Knop().addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("spel2");
				new GetallenOnthouden();
			}
		});
		
		minigameview.getSpel3Knop().addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				music();
			}
		});
		
		add(minigameview, BorderLayout.CENTER);
	}
	
	public static void music()
	{
	    AudioPlayer MGP = AudioPlayer.player;
	    ContinuousAudioDataStream loop = null;

	    try
	    {
	        String File = ("D:/Downloads/Spanish_Flea_Herb_Alpert.wav");
	        InputStream in = new FileInputStream(File);
	        AudioStream audioStream = new AudioStream(in);
	        AudioPlayer.player.start(audioStream);
	    }
	    catch(IOException e)
	    {
	    	e.printStackTrace();
	        System.out.println("cant find the file");
	    }

	    MGP.start(loop);
	}
}
