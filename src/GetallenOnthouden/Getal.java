package GetallenOnthouden;

import java.util.ArrayList;

public class Getal {
	
    public String genereerGetal  = "";
    
    public Getal(int level){
          System.out.println(genereerGetal);

        
    	for (int i = 0; i < level; i++) { 
    		int a  = (int) (10 * Math.random());
    		genereerGetal += a;
		}
    }


	public String getGetal() {
		return genereerGetal;
	}

}
