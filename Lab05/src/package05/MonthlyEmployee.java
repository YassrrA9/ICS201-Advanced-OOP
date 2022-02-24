package package05;

 class MonthlyEmployee extends Staff {
	 
	 private int Payment;
	 
	 public MonthlyEmployee(String name, String phoneNumber, int Payment) {
		 super(name,phoneNumber);
		 this.Payment = Payment;
	 }
	 public double getPayment() {
		 return this.Payment;
	 }
	 
	 public String toString() {
		 return String.format("Staff type: %s %nName: %s %nPhone: %s %nPay: %.1f SR",(this.getClass().getSimpleName()).substring(7),getName(),getPhoneNumber(),getPayment());
	 }

}
