package package04;

 class Employee extends Person{
	 
	 private int office;
	 private double salary;
	 private String datehired;
	 public Employee(String name, String address, String phonenumber, String email, int office, double salary, String datehired) {
		 super(name,address,phonenumber,email);
		 this.office = office;
		 this.salary = salary;
		 this.datehired = datehired;
	 }
	 
	 public String toString() {
		 return "Class: "+ this.getClass().getSimpleName() +"       Name: "+ getName();
	 }

}
