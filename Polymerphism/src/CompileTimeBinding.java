
public class CompileTimeBinding {

	void add(int a, int b) {
		int result = a + b;
		System.out.println(result);
	}

	void add(float a, float b) {
		float result = a + b;
		System.out.println(result);
	}

	void add(int a, int b, int c) {
		int result = a + b + c;
		System.out.println(result);
	}

	public static void main(String[] args) {
		CompileTimeBinding obj = new CompileTimeBinding();
		obj.add(10, 30);
		obj.add(30f, 30f);
		obj.add(10, 30, 50);

	}
}
