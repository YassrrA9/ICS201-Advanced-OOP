package package04;

 class Staff extends Employee{
	 private String title;
	 
	 public Staff(String title, String name, String address, String phonenumber, String email, int office, double salary, String datehired) {

		 super(name,address, phonenumber,email,office,salary,datehired);
		 this.title = title;
	 }

	 
	 public String toString() {
		 return "Class: "+ this.getClass().getSimpleName() +"       Name: "+ getName();
	 }
}
