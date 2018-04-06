package multithereding;

public class multithered extends Thread {

	public static void main(String[] args) {
		multithered mt = new multithered();
		mt.start();

		for (int j = 1; j <= 200; j++) {
			System.out.println("j: " + j + "\t");
		}
	}

	public void run() {
		for (int i = 1; i <= 200; i++) {
			System.out.println("i: " + i + "\t");
		}
	}
}
