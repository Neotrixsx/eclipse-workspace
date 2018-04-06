package assertion;

public class AccertDemo {
	public static void main(String[] args) {
		int withdrawamount = 100;
		int currentamount = 100;
		
		assert(withdrawamount< currentamount): "requred more amount for withdrawamount";
	}
}
