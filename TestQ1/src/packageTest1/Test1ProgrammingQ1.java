package packageTest1;

public class Test1ProgrammingQ1 {
	public static void main(String[] args) {
		Vechile[] array = new Vechile[4];
		array[0] = new Vechile(240.53, 4);
		array[1] = new Vechile(135.0, 3);
		array[2] = new Bicycle(35,2,1);
		array[3] = new Bicycle(55,2,2);
		
		for(int i =0; i<array.length;i++) {
			System.out.println(array[i]);
		}
		
	}

}

class Vechile {
	 private double maxspeed;
	 private int numOfwheels;
	 
	 public Vechile(double maxspeed, int numOfwheels ) {
		 this.maxspeed = maxspeed;
		 this.numOfwheels = numOfwheels;
	 }
	 
	 public Vechile() {
	 }
	 public double getMax() {
		 return this.maxspeed;
	 }
	 public int getWheels() {
		 return this.numOfwheels;
	 }
	 
	 public String toString() {
		 return String.format("Max speed = %.2f  Number Of Wheels = %d",getMax(),getWheels());

	 }

}
class Bicycle extends Vechile {
	 
	 private int  numOfgears;
	 public Bicycle(double maxspeed, int numOfwheels, int  numOfgears) {
		 super(maxspeed,numOfwheels);
		 this.numOfgears = numOfgears;
	 }
	 public int getGeras() {
		 return this.numOfgears;
	 }
	 @Override
	 public String toString() {
		 return String.format("Max speed = %.2f  Number Of Wheels = %d Number Of Wheels = %d",getMax(),getWheels(),getGeras());

	 }
}
