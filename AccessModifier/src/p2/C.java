package p2;

import p1.A;

public class C extends A {
	public static void main(String[] args) {
		A obj = new A();
		System.out.println(obj.d);

		C objx = new C();
		System.out.println(objx.c);
		System.out.println(objx.d);
	}
}
