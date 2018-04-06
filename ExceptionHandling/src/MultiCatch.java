
public class MultiCatch {
	public static void main(String[] args) {
		try {
			String input = args[0];
			System.out.println("input is " + input);
			int output = Integer.parseInt(input);
			System.out.println("Output is " + output);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception");
		}	catch (NumberFormatException e) {
			System.out.println("Number Format Exception");
		}finally {
			System.out.println("inside finally");
		}
		System.out.println("more code");
	}
}
