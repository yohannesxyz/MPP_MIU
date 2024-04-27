package lesson4.staticinherit.fourth;

//Shows a static method can override a static method
public class Sub extends Super {
	public static void main(String[] args) {
//		this.tryit(); //compiler error
		tryit();
	}
	public static void tryit() {
		System.out.println("trying it too");
	}
}

// Need explation