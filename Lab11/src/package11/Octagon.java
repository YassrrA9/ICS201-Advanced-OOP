package package11;
import java.lang.*;

abstract class GeometricObject {
	public abstract double getArea();

	public abstract double getPerimeter();
}
public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
	
	private double side;
	public Octagon() {
		side=0;
	}
	public Octagon(double side) {
		this.side = side;
	}
	
	public double getSide() {
		return this.side;
	}
	public void setSide(double s) {
		this.side = s;
	}
	
	@Override
	public double getArea() {
		return ((2+(4/(Math.sqrt(2))))*(Math.pow(this.side, 2)));
	}
	@Override
	public double getPerimeter() {
		return (8*this.side);
	}
	@Override
	public String toString() {
		return String.format("Area = %.2f m^2 \nPerimeter = %.2f m \n", getArea(), getPerimeter());
	}
    public Object clone() throws CloneNotSupportedException{
    	Octagon FIRSTCOPY = (Octagon)super.clone();
    	return FIRSTCOPY;
    }
    public int compareTo(Octagon obj) {
    	if(this.side == obj.side) {
    		return 1;
    	}else {
    		return 0;
    	}
    }
}
