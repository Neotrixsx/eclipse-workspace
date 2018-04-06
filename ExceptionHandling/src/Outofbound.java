
public class Outofbound {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30 };
		try {
			for (int i = 0; i <= arr.length; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of BoundsException");
		}
	}

	void method() {
		System.out.println("method1");
	}
}