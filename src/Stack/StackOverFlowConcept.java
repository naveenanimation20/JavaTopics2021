package Stack;

public class StackOverFlowConcept {

	public static void m1() {
		m2();
	}

	public static void m2() {
		m3();
	}

	public static void m3() {
		int i = 10;
		System.out.println(i);
	}

	public static void main(String[] args) {
		m1();
	}

}
