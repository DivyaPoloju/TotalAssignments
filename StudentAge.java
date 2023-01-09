

class StudentAge {
	   // Instance variable
	   int age;
	   // Instance methods
	   int getAge(){
	     // Accessing instance variable
	     return age;
	   }
	   void setAge(int i){
	     age = i;
	   }

	   public static void main(String[] args)
	   {
	      StudentAge stud = new StudentAge();
	      stud.age = 24;
	      // Invoking the instance method through an object using dot operator
	      int resultage = stud.getAge();
	      System.out.println("Age of the student is:" + resultage);
	   }
	}

