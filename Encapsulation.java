

public class Encapsulation {
	
	public Encapsulation()
	{
		Student student=new Student();
		student.setName("Divya"); //Write 
		
		System.out.println(student.getName()); //Read
	}
	
	public static void main(String[] args)
	{
		
		new Encapsulation();
	}

	public class Student {

		private String name;

		// Read-Only
		public String getName() {
			return name;
		}

		// Write Only
		public void setName(String name) {
			this.name = name;
		}

	}
}
