package miu.edu.fpp390.lab12.exericise1;

public class Circle extends ClosedCurve {
	double radius;
	public Circle(Double radius) throws IllegalClosedCurveException{
		this(radius.doubleValue());
	}
	public Circle(double radius) throws IllegalClosedCurveException{
		this.radius = radius;
		if(radius < 0) {
			throw new IllegalClosedCurveException("Radius Can not be negative");
		}
	}
	double computeArea() {
		return (Math.PI * radius * radius);
	}
}
