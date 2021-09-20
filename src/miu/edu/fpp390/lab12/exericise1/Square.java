package miu.edu.fpp390.lab12.exericise1;

import com.sun.jdi.DoubleValue;

public class Square extends ClosedCurve {
	double side;
	public Square(Double side) throws IllegalClosedCurveException{	
		this(side.doubleValue());		
	}
	public Square(double side) throws IllegalClosedCurveException {
		this.side = side;
		if(side < 0) {
			throw new IllegalClosedCurveException("Side cannot be non positive");
		}
	}
	double computeArea() {
		return(side*side);
	}

}
