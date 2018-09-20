package tdd;



class B {
	void call() {
		C c = new C();
		c.call();
	}
}

class C {
	void call() {
	}
}

class A {
	B b;
	void callB() {
		b.call();
	}
}

public class Demo {

	public static void main(String[] args) {
//		B b = new B(); // Dependency
//		A a = new A(b); // 1 constructor
//		a.setB(b); // 2. property
//		a.callB(b); // 3. method

	}

}
