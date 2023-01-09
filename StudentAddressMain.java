
public class StudentAddressMain {
	
		public StudentAddressMain()
		{
			Address john=new Address("John","8457656644", "3-4-55,Kukatpally,Hyd" ,"10");
			System.out.println("Name: " +john.getName());
			System.out.println("Roll No: " +john.getRoll_no());
			System.out.println("Phone Number: " +john.getPhonenumber());
			System.out.println("Address: " +john.getAddress() +"\n");
			
			Address sam=new Address("Sam","8099587996", "3-4-57,Electronic City,Bangalore" ,"11");
			System.out.println("Name: " +sam.getName());
			System.out.println("Roll No: " +sam.getRoll_no());
			System.out.println("Phone Number: " +sam.getPhonenumber());
			System.out.println("Address: " +sam.getAddress());
		}
	
	public static void main(String[] args)
	{
		new StudentAddressMain();
	}
	
	public class Address {
		
		private String phonenumber;
		private String name;
		private String address;
		private String roll_no;
		
		public Address(String name, String phonenumber, String address,String roll_no)
		{
			this.name=name;
			this.phonenumber=phonenumber;
			this.address=address;
			this.roll_no=roll_no;
		}
		
		
		public String getPhonenumber() {
			return phonenumber;
		}
		public void setPhonenumber(String phonenumber) {
			this.phonenumber = phonenumber;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}


		public String getRoll_no() {
			return roll_no;
		}


		public void setRoll_no(String roll_no) {
			this.roll_no = roll_no;
		}
		
		

	}


}
