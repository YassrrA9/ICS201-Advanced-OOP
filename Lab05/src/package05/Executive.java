package package05;

class Executive extends Staff {
	 
	 private int Payment;
	 
	 public Executive(String name, String phoneNumber, int Payment) {
		 super(name,phoneNumber);
		 this.Payment = Payment;
	 }
	 
	 public double getPayment() {
		 return this.Payment;
	 }
	 public void setBonus(double bonus) {
		 this.Payment+= bonus;
	 }
	 
	 public String toString() {
		 return String.format("Staff type: %s %nName: %s %nPhone: %s %nPay: %.1f SR",this.getClass().getSimpleName(),getName(),getPhoneNumber(),getPayment());
	 }

}
