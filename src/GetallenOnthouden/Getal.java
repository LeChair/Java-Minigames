package GetallenOnthouden;

public class Getal {

    public int GenereerGetal;

    public int genereerGetal() {
        this.GenereerGetal = (int) (10 * Math.random());
        System.out.println(GenereerGetal);
        return GenereerGetal;
    }


}
