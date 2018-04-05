
public class Test {
	public static void main(String[] args) {
		Applelaptop m1 = new MacBookPro();
		Applelaptop m2 = new MacBookAir();
		m1.start();
		m1.shutdown();
		MacBookPro m3 = (MacBookPro) m1;
		m3.extramethod();

		m2.start();
		m2.shutdown();
		MacBookAir m4 = (MacBookAir) m2;
	}
}
