package package05;

 class Volunteer extends Staff {
	 
	 public Volunteer(String name, String phoneNumber) {
		 super(name,phoneNumber);
	 }
	 public String toString() {
		 return String.format("Staff type: %s %nName: %s %nPhone: %s %nPay: %.1f SR",this.getClass().getSimpleName(),getName(),getPhoneNumber(),getPayment());
	 }

}
