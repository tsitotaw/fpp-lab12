package miu.edu.fpp390.lab12.exericise1;

public class Rectangle extends ClosedCurve {

	private double width;
	private double length;
	public Rectangle(double width, double length) throws IllegalClosedCurveException{
		if(width < 0 || length < 0) {
			throw new IllegalClosedCurveException("Either Width nor Length can be non positive");
		}
		this.length = length;
		this.width = width;
	}
	double computeArea() {
		return width*length;
	}
	


}
