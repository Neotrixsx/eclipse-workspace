package multithereding;

public class singlethered {
	public static void main(String[] args) {

		singlethered st = new singlethered();
		st.printnumber();
		for (int j = 1; j <= 200; j++) {
			System.out.println("j: " + j + "\t");
		}
	}

	void printnumber() {
		for (int i = 1; i <= 200; i++) {
			System.out.println("i: " + i + "\t");
		}
	}
}
