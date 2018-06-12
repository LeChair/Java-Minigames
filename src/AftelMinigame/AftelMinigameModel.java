package AftelMinigame;

public class AftelMinigameModel {
	private int randomStart, randomOnzichtbaar;

	public AftelMinigameModel(){
		// Random waardes voor een starttijd en waarop de tijd label ontzichtbaar wordt
		randomStart = (int) (Math.random()*8+8);
		randomOnzichtbaar = randomStart / (int) (Math.random()*3+1);
	}

	// Getters
	public int getRandomStart(){
		return this.randomStart;
	}

	public int getRandomOnzichtbaar(){
		return this.randomOnzichtbaar;
	}

}
