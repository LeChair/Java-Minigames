package GetallenOnthouden;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckView extends JPanel {
	
	private GetallenOnthoudenController controller;

	public CheckView(GetallenOnthoudenController controller) {
		
		this.controller = controller;

		JLabel nummerLabel = new JLabel("Nummer: " + controller.getGetal());
		JLabel antwoordLabel = new JLabel("Jouw antwoord: " + controller.getInvoer());
		JLabel resultLabel = new JLabel("");
		JLabel levelLabel = new JLabel("Level " + controller.getLevel());
		JButton button = new JButton();
		
		if (controller.getGetal().getGetal().equals(controller.getInvoer())) {
			System.out.println("Goed geraden.");
			button.setText("Volgend level");
			button.addActionListener(new NextHandler());
			resultLabel.setText("Dat is goed!!");
		} else {
			System.out.println("Fout geraden!");
			button.setText("Opnieuw beginnen");
			button.addActionListener(new ResetHandler());
			resultLabel.setText("Helaas, dat is fout!");
		}

		add(nummerLabel);
		add(antwoordLabel);
		add(levelLabel);
		add(resultLabel);
		add(button);
	}

	class NextHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			controller.nextLevel();
		}
	}

	class ResetHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			controller.volgendScherm();
		}
	}

}
