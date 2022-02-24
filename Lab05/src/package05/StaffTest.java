package package05;

public class StaffTest {
	public static void main(String[] args) {
		
		double totalPayment=0;
		Staff[] StaffList = new Staff[4];
		
		StaffList[0] = new Executive("Ahmad","860-1490",5000);
		StaffList[1] = new MonthlyEmployee("Ali","0555-0101",850);
		StaffList[2] = new HourlyEmployee("Othman","0555-0690",40,20.5);
		StaffList[3] = new Volunteer("Bandar","849-8374");
		
		for(int y=0; y<StaffList.length; y++) {
			if(StaffList[y] instanceof Executive) {
				((Executive) StaffList[y]).setBonus(5000.0);
			}
			else if(StaffList[y] instanceof HourlyEmployee) {
		((HourlyEmployee) StaffList[y]).setPayment(((HourlyEmployee) StaffList[y]).getHours(),((HourlyEmployee) StaffList[y]).getPayPerH());
			}
			
			
			
		}
		for(int i=0; i<StaffList.length; i++) {
			System.out.println(StaffList[i]);	
			System.out.println();
			totalPayment+= StaffList[i].getPayment();
		}
		
		System.out.println("Total Payments : "+totalPayment+" SR");
		
	}

}
