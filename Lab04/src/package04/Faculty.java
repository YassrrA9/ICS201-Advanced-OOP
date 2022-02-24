package package04;

 class Faculty extends Employee {
	 
	 private String officehours;
	 private String rank;
	 
	 public Faculty(String officehours,String rank, String name, String address, String phonenumber, String email, int office, double salary, String datehired) {

	 super(name,address, phonenumber,email,office,salary,datehired);
	 this.officehours = officehours;
	 this.rank = rank;
	 }
	 public String toString() {
		 return "Class: "+ this.getClass().getSimpleName() +"       Name: "+ getName();
	 }
	
}
