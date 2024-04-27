package lesson77.lecture.singletons;

/** Threadsafe singleton implementation; eager initialization */
public enum MySingletonEnum {
	INSTANCE;
	MySingletonEnum(){
		System.out.println("hgiub");
	}
	public MySingletonEnum get(){
		System.out.println("haha");
		return null;
	}
}
