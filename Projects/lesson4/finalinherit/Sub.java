package lesson4.finalinherit;

//Shows how compiler locates first ancestor
//in inheritance chain in which the final method
//is implemented
public class Sub extends Super {
	public static void main(String[] args) {
		Sub s = new Sub();
		s.print();

	}
//	will throw compiler error
//	public void print() {
//		System.out.println("hello");
//	}
}


