package lesson4.staticinherit.first;

//Shows that static method are inherited
public class Sub extends Super {
	static void print() {
		System.out.println("hello1");
	}
	public static void main(String[] args) {
//		Super.print();
		print();
	}	
}


// We did inheritance, why we have to mention class name. print(), we can invoke directly print() know.