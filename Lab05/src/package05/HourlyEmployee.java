package package05;

 class HourlyEmployee extends Staff {
	 
	 private int WorkHours;
	 private double PaymentPerHour;
	 private double Payment;
	 public HourlyEmployee(String name, String phoneNumber, int WorkHours, double PaymentPerHour) {
		 super(name,phoneNumber);
		 this.WorkHours = WorkHours;
		 this.PaymentPerHour = PaymentPerHour;

	 }
	 
	 public double getPayment() {
		 return Payment;
	 }
	 public int getHours() {
		 return this.WorkHours;
	 }
	 public double getPayPerH() {
		 return this.PaymentPerHour;
	 }
	 public void setPayment(int H , double P) {
		 Payment = (H)*(P);
	 }
	 public String toString() {
		 return String.format("Staff type: %s %nName: %s %nPhone: %s %nPay: %.1f SR",this.getClass().getSimpleName(),getName(),getPhoneNumber(),getPayment());
	 }

}
