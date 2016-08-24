import java.util.Random;


public class EmailRandomizer {
	private static String end = "@gmail.com";
	
	public static String random() {
		Random r = new Random();
		int i = Math.abs(r.nextInt(10000));
		return i + end;
	}

}
