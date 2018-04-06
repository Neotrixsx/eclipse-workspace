package checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	void raedFile() throws FileNotFoundException {
		FileInputStream data = new FileInputStream("");
	}

	public static void main(String[] args) {
		CheckedException ce = new CheckedException();
		try {
			ce.raedFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
