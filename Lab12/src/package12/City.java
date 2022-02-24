package package12;

public class City implements Comparable<City> {
	private String CityName;
	private int Temp;
	
	public City(String CityName, int Temp) {
		this.CityName = CityName;
		this.Temp = Temp;
	}
	public String getCity() {
		return this.CityName;
		
	}
	public double getTemp() {
		return this.Temp;
	}
	
	@Override
	public int compareTo(City o) {
		if(this.Temp > o.Temp) {
			return 1;
		}if(this.Temp < o.Temp) {
			return -1;
		}else {
			return 0;
		}
	}
	@Override
	public String toString() {
		return String.format("City : %s\t Temperature : %d\n", this.CityName, this.Temp);
	}
}
