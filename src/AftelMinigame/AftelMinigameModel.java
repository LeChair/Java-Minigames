package AftelMinigame;

import java.util.concurrent.ThreadLocalRandom;

public class AftelMinigameModel {
	public int randomStart, randomInvisible;
	
	public AftelMinigameModel(){
		
		int randomNum = ThreadLocalRandom.current().nextInt(8, 15 + 1);
		randomStart = randomNum;
		randomInvisible = randomStart/2;
		System.out.println(randomStart);
		System.out.println(randomInvisible);
	}
}
