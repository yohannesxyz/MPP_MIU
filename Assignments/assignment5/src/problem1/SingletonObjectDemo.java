package problem1;

import java.util.Random;

class SingletonClass {
	// static SingletonClass singletonObject;
	private static SingletonClass singletonObject ;
	private String key;

	/** A private Constructor prevents any other class from instantiating. */

	private SingletonClass() {
		this.generateKey();
	}

	public static SingletonClass getSingletonObject() {

		if (singletonObject != null) {
			System.out.println("Unsuccessful to produce the key....");
			return null;
		} else {
			System.out.println("Key generated Successfully  ");
			singletonObject = new SingletonClass();
			return singletonObject;
		}

	}

	private void generateKey() {
		Random random = new Random();
		int min = 1000000;
		int max = 9999999;
		
		int key = random.nextInt(max - min + 1) + min; 
		key = Math.abs(key);
		System.out.println("Your key to activate Avast anti virus is:" + key);
	}
}

public class SingletonObjectDemo {

	public static void main(String[] args) {
 //SingletonClass obj = new SingletonClass(); //Compilation error
	//	SingletonClass obj = SingletonClass.getSingletonObject();
	//SingletonClass obj1 = SingletonClass.getSingletonObject();
	//	SingletonClass obj2 = SingletonClass.getSingletonObject();

	}
}
