package package10;

import java.lang.*;

abstract class GeometricObject {
	private String color;
	private boolean filled;

	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return this.color;
	}

	public boolean isFilled() {
		return this.filled;
	}

	public String toString() {
		return String.format("Color : %s \nIs Filled? %s\n", getColor(), isFilled());
	}

	public abstract double getArea();

	public abstract double getPerimeter();
}

public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;

	public Triangle(String color, boolean filled, double side2, double side1, double side3)
			throws IllegalArgumentException {
		super(color, filled);
		if ((side1 < 0) || (side2 < 0) || (side3 < 0)) {
			throw new IllegalArgumentException("Wrong valuse");
		} else {

			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}
	}

	public double getS1() {
		return this.side1;
	}

	public double getS2() {
		return this.side2;
	}

	public double getS3() {
		return this.side3;
	}

	@Override
	public double getArea() {
		double s = (this.side1 + this.side2 + this.side3) / (2);
		return Math.sqrt((s * (s - this.side1)) * (s - this.side2) * (s - this.side3));
	}

	@Override
	public double getPerimeter() {
		return (this.side1 + this.side2 + this.side3);
	}

	@Override
	public String toString() {
		return String.format("Area = %.2f m^3\nPerimeter = %.2f m\n", getArea(), getPerimeter()) + super.toString();
	}

}
