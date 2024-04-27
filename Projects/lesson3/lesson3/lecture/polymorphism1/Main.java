package lesson3.lecture.polymorphism1;

public class Main {

	public static void main(String[] args) {
		Manager boss = new Manager("Boss Guy", 80000);
		boss.setBonus(5000);

		Employee[] staff = new Employee[3];

		staff[0] = boss;

		staff[1] = new Manager("Jimbo", 50000);
		staff[2] = new Manager("Tommy", 40000);

		Manager[]	mgr = (Manager[])staff;
		mgr[0].setBonus(4);
		mgr[1].setBonus(5);
		mgr[2].setBonus(6);

		// print names and salaries polymorphically
		for (Employee e : staff) {
			System.out.println("name: " + e.getName() + ", salary: "
					+ e.getSalary());
		}

	}

}
