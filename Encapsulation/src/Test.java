
public class Test {
	public static void main(String[] args) {
		Customer c = new Customer();
		c.setFname("suraj");
		c.setLname("gorai");
		c.setCcard("9787654315542");

		System.out.println("first Name:" + c.getFname());
		System.out.println("last Name:" + c.getLname());
		System.out.println("CCard:" + c.getCcard());
	}
}
