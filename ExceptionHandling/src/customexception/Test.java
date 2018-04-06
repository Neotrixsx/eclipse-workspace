package customexception;

public class Test {
	public static void main(String[] args) throws CheckedException {
		// throw new UncheckedException("Bussness Exception");
		throw new CheckedException("Checked Message");
	}

}
