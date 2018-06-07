package AftelMinigame;

import java.util.*;

public class AftelMinigameModel {
	public int randomStart, randomInvisible, randomInvisible2;
	
	public AftelMinigameModel(){
		randomStart = (int) (Math.random()*8+8);
		randomInvisible = (int) (Math.random()*3+1);
		randomInvisible2 = randomStart/randomInvisible;
		System.out.println(randomStart);
		System.out.println(randomInvisible2);
	}
}
