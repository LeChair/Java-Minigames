package GetallenOnthouden;

import java.util.ArrayList;

public class Getal {

    public static int GenereerGetal;

    public int genereerGetal() {
        this.GenereerGetal = (int) (10 * Math.random());
        System.out.println(GenereerGetal);
        return GenereerGetal;
    }


}
