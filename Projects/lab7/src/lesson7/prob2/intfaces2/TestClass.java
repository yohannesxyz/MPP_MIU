package lesson7.prob2.intfaces2;

interface I1{
	void m1(); // public abstract void m1();
    float m2();
    //double add(double a, double b);
}
public class TestClass implements I1{

	@Override
	public void m1() {
		System.out.println("M1");
		
	}

	@Override
	public float m2() {
		
		return 10;
	}

}
