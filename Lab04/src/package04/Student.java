package package04;

 class Student extends Person{
	 public final String status1 = " Freshman " ;
	 public final String status2 = " Sophmore " ;
	 public final String status3 = " Junior " ;
	 public final String status4 = " Senior " ;
	 
	 public Student(String status2, String name,String address, String phonenumber, String email) {
		 super(name,address,phonenumber,email);
	 }
	 
	 public String toString() {
		 return "Class: "+ this.getClass().getSimpleName() +"       Name: "+ getName();
	 }

}
