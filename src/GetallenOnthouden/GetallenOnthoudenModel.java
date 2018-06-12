package GetallenOnthouden;

public class GetallenOnthoudenModel {
public int GenereerGetal;

	public int genereerGetal() {
		this.GenereerGetal = (int) (10 * Math.random());
		System.out.println(GenereerGetal);
		return GenereerGetal;
	}

}

//package GetallenOnthouden;
//
//public class GetallenOnthoudenModel {
//	public int GenereerGetal;
//
//	public GetallenOnthoudenModel() {
//		this.GenereerGetal = (int) (10 * Math.random());
//		System.out.println(GenereerGetal);
//	}
//	public int getRandomgetal() {
//		return GenereerGetal;
//	}
//
//}
