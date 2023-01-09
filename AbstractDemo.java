

public class AbstractDemo {

	public AbstractDemo() {
		// TODO Auto-generated method stub
		Employee permemp = new PermanentEmployee();
		System.out.println("Salary for permanent employee: " + permemp.Salary());

		Employee intern = new Intern();
		System.out.println("Salary for intern: " + intern.Salary());

	}

	public static void main(String[] args) {
		new AbstractDemo();
	}

	public class PermanentEmployee extends Employee {
		@Override
		public int Salary() {
			// TODO Auto-generated method stub
			return 20000;
		}
	}

	public abstract class Employee {

		// common to all child classes, so define non-abstract method
		// Non-abstract method contains default implementation(method body)
		public void cabFacility() {
			System.out.println("Cab Facility is available for all employees");
		}

		public abstract int Salary();

	}

	public class Intern extends Employee {

		@Override
		public int Salary() {
			// TODO Auto-generated method stub
			return 12000;
		}

	}

}
