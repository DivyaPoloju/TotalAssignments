

class EmployeeInformation
{
	String Name;
	int Year;
	String Address;
	EmployeeInformation(String nam, int years, String addr)
	{
		Name = nam;
		Year = years;
		Address = addr;
	}

	void Sam()
	{
		System.out.println(Name + "        " + Year + "         " + Address);
	}

	void Robert()
	{
		System.out.println(Name + "     " + Year + "            " + Address);
	}

	void John()
	{
		System.out.println(Name + "    " + Year + "       " + Address);
	}

	public static void main(String args[])
	{
		System.out.println("Name" + "  Year of Joining     " + "Address");
		EmployeeInformation e = new EmployeeInformation("Sam", 2000, "68D-WallsStreet");
		e.Sam();
		EmployeeInformation e1 = new EmployeeInformation("Robert", 1994, "64C-WallsStreet");
		e1.Robert();
		EmployeeInformation e2 = new EmployeeInformation("John", 2002, "70F-WallsStreet");
		e2.Sam();
	}
}
